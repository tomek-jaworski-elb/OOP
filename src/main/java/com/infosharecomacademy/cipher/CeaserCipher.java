package com.infosharecomacademy.cipher;

import java.util.Scanner;

public class CeaserCipher extends Cipher {


    private final static String ABC_SMALL_LETTERS = "abcdefghijklmnopqrstuwxyz";
    private final static String ABC_BIG_LETTERS = "ABCDEFGHIJKLMNOPQRSTUWXYZ";

    @Override
    String encrypt(String text) {
        System.out.println("Teskt do zaszyfrowania: " + text);
        int offset = 3;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int position;
            if ((position = ABC_SMALL_LETTERS.indexOf(c)) != -1) {
                position += offset;
                if (position >= ABC_SMALL_LETTERS.length()) {
                    position = position - ABC_SMALL_LETTERS.length();
                }
                result.append(ABC_SMALL_LETTERS.charAt(position));
            } else if ((position = ABC_BIG_LETTERS.indexOf(c)) != -1) {
                position += offset;
                if (position >= ABC_BIG_LETTERS.length()) {
                    position = position - ABC_BIG_LETTERS.length();
                }
                result.append(ABC_BIG_LETTERS.charAt(position));
            } else {
                result.append(c);
            }
        }
        System.out.println("Teskt zaszyfrowany: " + result);
        return result.toString();
    }

    @Override
    String decrypt(String text) {
        int offset = 3;
        System.out.println("Teskt zaszyfrowany: " + text);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int position;
            if ((position = ABC_SMALL_LETTERS.indexOf(c)) != -1) {
                position -= offset;
                if (position < 0) {
                    position = ABC_SMALL_LETTERS.length() + position;
                }
                result.append(ABC_SMALL_LETTERS.charAt(position));
            } else if ((position = ABC_BIG_LETTERS.indexOf(c)) != -1) {
                position -= offset;
                if (position < 0) {
                    position = ABC_BIG_LETTERS.length() + position;
                }
                result.append(ABC_BIG_LETTERS.charAt(position));
            } else {
                result.append(c);
            }
        }
        System.out.println("Teskt odszyfrowany: " + result);
        return result.toString();
    }

    public String getInput(String textToPrint) {
        System.out.println(textToPrint);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
