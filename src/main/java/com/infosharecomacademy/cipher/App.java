package com.infosharecomacademy.cipher;

public class App {

    public static void main(String[] args) {
        System.out.println("Ceaser Cipher");
        CeaserCipher ceaserCipher = new CeaserCipher();

        String txt = ceaserCipher.encrypt("abcdeF aBc xyz 1! g");
        FileManager fileManager = new FileManager();
        fileManager.fileSave(txt);
        txt = fileManager.fileRead();
        new CeaserCipher().decrypt(txt);


        ceaserCipher.encrypt(ceaserCipher.getInput("Podaj text do zaszyfrowania: "));
    }
}
