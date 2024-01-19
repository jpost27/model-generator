package com.fanduel.modelgenerator.v1.generator;

public interface ModelGenerator {

    void generate(String packageName);

    void print();

    String getOutputDirectory();

    String getBasePackage();
}
