package com.fsoftdev.oop.abstractclass.example;


import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.assertThat;


public class FileReaderTEst {


    @Test
    public void givenLowercaseFileReaderInstance_whenCalledreadFile_thenCorrect() throws Exception {
        URL location = getClass().getClassLoader().getResource("files/test.txt");
        Path path = Paths.get(location.toURI());
        BaseFileReader lowercaseFileReader = new LowercaseFileReader(path);

        assertThat(lowercaseFileReader.readFile(),isA(List.class));
    }

}
