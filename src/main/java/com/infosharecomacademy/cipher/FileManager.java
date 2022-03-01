package com.infosharecomacademy.cipher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {

    private static final Path fileRead = Paths.get("src","main","resources","encrypted.txt");
    private static final Path fileSave = Paths.get("src","main","resources","encrypted.txt");

    public void fileSave(String textToSave) {
        try {
            Files.writeString(fileSave,textToSave);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String fileRead() {
        String text = "";
        try {
            text = Files.readString(fileRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
