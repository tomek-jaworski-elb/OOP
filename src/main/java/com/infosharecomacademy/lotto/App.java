package com.infosharecomacademy.lotto;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilosc liczb: ");
        int param1 = scanner.nextInt();
        System.out.print("Podaj zakres liczb: ");

        int param2 = scanner.nextInt();
        System.out.println(param1 + " | " + param2);
        System.out.print("Wylosowano: ");
        Iterator<Integer> integerIterator = lotto(param1, param2).iterator();
        while (integerIterator.hasNext()) {
            System.out.print(integerIterator.next());
            if (integerIterator.hasNext()) {
                System.out.print(", ");
            }
        }
    }

    private static Set<Integer> lotto(int numberCount, int range) {
        Set<Integer> set = new TreeSet<>(Comparator.naturalOrder());
        do {
            Random random = new Random();
            int number = random.nextInt(range) + 1;
            set.add(number);
        } while (set.size() < numberCount);
        return set;
    }
}
