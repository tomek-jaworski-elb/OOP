package com.infosharecomacademy.cipher;

public class App {

    public static void main(String[] args) {
        System.out.println("Ceaser Cipher");
        CeaserCipher ceaserCipher = new CeaserCipher();
        String txt = ceaserCipher.encrypt("abcdeF aBc xyz 1! g");
        System.out.println(txt);
        FileManager fileManager = new FileManager();
        fileManager.fileSave(txt);
        txt = fileManager.fileRead();
        ceaserCipher.decrypt(txt);
        System.out.println(ceaserCipher.encrypt(ceaserCipher.getInput("Podaj text do zaszyfrowania: ")));
    }
}
