package com.infosharecomacademy.cipher;

import java.util.Scanner;

public class CeaserCipher extends Cipher {


    private final static String ABC_SMALL_LETTERS = "abcdefghijklmnopqrstuwxyz";

    @Override
    String encrypt(String text) {
        System.out.println(text);
        int offset = 3;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                int position = ABC_SMALL_LETTERS.indexOf(c);
                if (position == -1) {
                    result.append(c);
                } else {
                    position += offset;
                    if (position >= ABC_SMALL_LETTERS.length()) {
                        position = position - ABC_SMALL_LETTERS.length();
                    }
                    result.append(ABC_SMALL_LETTERS.charAt(position));
                }
            } else {
                result.append(" ");
            }
        }
        System.out.println(result.toString());
        return result.toString();
    }

    @Override
    String decrypt(String text) {
        int offset = 3;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                int position = ABC_SMALL_LETTERS.indexOf(c);
                if (position == -1) {
                    result.append(c);
                } else {
                    position -= offset;
                    if (position < 0) {
                        position = ABC_SMALL_LETTERS.length()+position;
                    }
                    result.append(ABC_SMALL_LETTERS.charAt(position));
                }
            } else {
                result.append(" ");
            }
        }
        System.out.println(result.toString());
        return result.toString();
    }

    public String getInput(String textToPrint) {
        System.out.println(textToPrint);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
