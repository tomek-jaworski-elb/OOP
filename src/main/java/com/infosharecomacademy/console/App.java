package com.infosharecomacademy.console;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj jakiś tekst: ");
        String line = scanner.nextLine();
        line = line.replace(" ", "");
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            map.putIfAbsent(line.charAt(i), 0);
            map.put(line.charAt(i), map.get(line.charAt(i)) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        list.stream()
                .sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .forEach(System.out::println);

    }
}
