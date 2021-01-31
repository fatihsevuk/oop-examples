package com.fsoftdev.oop.abstractclass.example;

import java.nio.file.Path;

public class UppercaseFileReader extends BaseFileReader {


    public UppercaseFileReader(Path filePath) {
        super(filePath);
    }

    @Override
    protected String mapFileLine(String s) {

        return s.toUpperCase();
    }
}
