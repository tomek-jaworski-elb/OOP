package com.infosharecomacademy.cipher;

import java.util.Scanner;

public class CeaserCipher extends Cipher {


    private final static String ABC = "abcdefghijklmnopqrstuwxyz";


    @Override
    String encrypt(String text) {
        System.out.println(text);
        int offset = 3;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                int position = ABC.indexOf(c);
                position += offset;
                if (position >= ABC.length()) {
                    position = position - ABC.length();
                }
                result.append(String.valueOf(ABC.charAt(position)));
            } else {
                result.append(" ");
            }
        }
        return result.toString();
    }

    @Override
    String decrypt(String text) {
        return null;
    }

    private String getInput(String textToPrint) {
        System.out.println(textToPrint);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void run() {
        String inputText = getInput("enter text");
    }
}
