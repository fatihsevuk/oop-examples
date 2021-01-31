package com.fsoftdev.oop.abstractclass.example;

import java.nio.file.Path;

public class LowercaseFileReader extends BaseFileReader {


    public LowercaseFileReader(Path filePath) {
        super(filePath);
    }

    @Override
    protected String mapFileLine(String s) {
        return s.toLowerCase();
    }
}
