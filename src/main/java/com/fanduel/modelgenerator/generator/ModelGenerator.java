package com.fanduel.modelgenerator.generator;

public interface ModelGenerator {
    void collectDocumentationUrls();

    void generate(String packageName);

    void print();
}
