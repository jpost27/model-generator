package com.fanduel.modelgenerator.utils;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class FileUtils {

    public static List<File> getAllFilesFromRootDirectory(File rootDirectory) {
        LinkedList<File> files = new LinkedList<>(List.of(rootDirectory));
        List<File> allFiles = new LinkedList<>();
        while (!files.isEmpty()) {
            File root = files.pop();
            if (root.listFiles() == null) {
                continue;
            }
            for (File file : root.listFiles()) {
                if (file.isDirectory()) {
                    files.addLast(file);
                } else {
                    allFiles.add(file);
                }
            }
        }
        return allFiles;
    }


}
