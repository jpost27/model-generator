package com.fanduel.modelgenerator.generator;

public interface ModelGenerator {

    void generate(String packageName);

    void print();

    String getOutputDirectory();

    String getBasePackage();
}
