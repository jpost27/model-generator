package com.fanduel.modelgenerator.codegen;

import com.fanduel.modelgenerator.collector.response.model.ResponseMetadata;
import org.springframework.lang.NonNull;

import java.io.File;
import java.util.List;

public interface ClientGenerator {

    void generateClient(@NonNull List<ResponseMetadata> responseMetadata, @NonNull File destinationFolder);

}
