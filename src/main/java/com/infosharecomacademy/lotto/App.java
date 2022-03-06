package com.infosharecomacademy.lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj param1: ");
        int param1 = scanner.nextInt();
        System.out.print("Podaj param2: ");

        int param2 = scanner.nextInt();
        System.out.println(param1 + " | "+param2);
        System.out.println(lotto(param1,param2));
    }

    private static Set<Integer> lotto(int numberCount, int range) {
        Set<Integer> set = new HashSet<>();
        do {
            Random random = new Random();
            int number = random.nextInt(range)+1;
            set.add(number);
        } while (set.size()<numberCount);
        return set;
    }


}
