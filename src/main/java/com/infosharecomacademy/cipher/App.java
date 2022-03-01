package com.infosharecomacademy.cipher;

public class App {

    public static void main(String[] args) {
        System.out.println("Ceaser Cipher");
        System.out.println(new CeaserCipher().encrypt("abcdef abc xyz"));
    }
}
