package com.fanduel.modelgenerator.cache;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

@Slf4j
public class CacheLoader {

    private static final File cachePath = new File("cache");
    private static final ObjectMapper objectMapper = new ObjectMapper();
    static {
        if (!cachePath.exists()) {
            cachePath.mkdir();
        }
    }

    public static <T> T loadOrFetch(@NonNull Cache cacheName, @NonNull TypeReference<T> tTypeReference, @NonNull Supplier<T> fetchFn) {
        File cacheFile = new File(cachePath.getAbsolutePath() + "/" + cacheName);
        Optional<T> cachedData = readFromCache(cacheName, cacheFile, tTypeReference);
        if (cachedData.isPresent()) {
            return cachedData.get();
        }
        T response = fetchFn.get();
        writeToCache(cacheName, cacheFile, response);
        return response;
    }

    public static <T, I> T loadOrFetch(@NonNull Cache cacheName,
                                       @NonNull I id,
                                       @NonNull TypeReference<T> tTypeReference,
                                       @NonNull Function<I, T> fetchFn) {
        File cacheFile =
                new File(cachePath.getAbsolutePath() + "/" + cacheName + "/" +
                        Base64.getUrlEncoder().encodeToString(id.toString().getBytes()));
        Optional<T> cachedData = readFromCache(cacheName, cacheFile, tTypeReference);
        if (cachedData.isPresent()) {
            return cachedData.get();
        }
        T response = fetchFn.apply(id);
        writeToCache(cacheName, cacheFile, response);
        return response;
    }

    private static <T> Optional<T> readFromCache(Cache cacheName, File cacheFile, TypeReference<T> tTypeReference) {

        cacheFile = addFileExtension(cacheName, cacheFile);
        Optional<T> cacheRead = Optional.empty();
        if (cacheFile.exists()) {
            try {
                if (tTypeReference.getType().getTypeName().equals(String.class.getTypeName())) {
                    try (FileInputStream inputStream = new FileInputStream(cacheFile)) {
                        cacheRead = Optional.of((T) new String(inputStream.readAllBytes()));
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    cacheRead = Optional.of(objectMapper.readValue(cacheFile, tTypeReference));
                }
            } catch (IOException e) {
                log.error("Could not save cache {}. {}", cacheFile.getAbsolutePath(), e.getMessage());
                e.printStackTrace();
            }
        }
        cacheRead.ifPresent(value -> log.info("{} found in cache.", cacheName.name()));
        return cacheRead;
    }

    private static <T> void writeToCache(Cache cacheName, File cacheFile, T data) {
        if (data == null) {
            return;
        }
        cacheFile = addFileExtension(cacheName, cacheFile);
        cacheFile.getParentFile().mkdir();
        if (data instanceof String) {
            try (FileOutputStream outputStream = new FileOutputStream(cacheFile)) {
                outputStream.write(data.toString().getBytes());
            } catch (Exception e) {
                log.error("Could not save cache {}. {}", cacheFile.getAbsolutePath(), e.getMessage());
                e.printStackTrace();
            }
        } else {
            try {
                objectMapper.writeValue(cacheFile, data);
            } catch (IOException e) {
                log.error("Could not save cache {}. {}", cacheFile.getAbsolutePath(), e.getMessage());
                e.printStackTrace();
            }
        }
    }

    private static File addFileExtension(Cache cache, File file) {
        String extension = "";
        if (cache.getMediaType().equals(MediaType.APPLICATION_JSON)) {
            extension = ".json";
        }
        return new File(file.getPath() + extension);
    }

}
