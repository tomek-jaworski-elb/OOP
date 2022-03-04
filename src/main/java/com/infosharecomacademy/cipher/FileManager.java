package com.infosharecomacademy.cipher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {

    private static final Path PATH_FILE = Paths.get("src","main","resources","encrypted.txt");

    public void fileSave(String textToSave) {
        try {
            Files.writeString(PATH_FILE,textToSave);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String fileRead() {
        String text = "";
        try {
            text = Files.readString(PATH_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
