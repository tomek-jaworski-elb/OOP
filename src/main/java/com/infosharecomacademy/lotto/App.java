package com.infosharecomacademy.lotto;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj param1: ");
        int param1 = scanner.nextInt();
        System.out.print("Podaj param2: ");


        int param2 = scanner.nextInt();
        System.out.println(param1 + "|"+param2);
    }
}
