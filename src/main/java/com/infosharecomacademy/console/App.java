package com.infosharecomacademy.console;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String line = scanner.nextLine();
        line = line.replace(" ","");
        System.out.println(line);
    }
}
