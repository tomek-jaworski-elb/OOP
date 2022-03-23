package com.infosharecomacademy.lamba;

import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> strings = List.of("A", "", "AB", "CDDC", "12", "0001000", "A");
        System.out.println(strings);
        List<Integer> integers = strings.stream()
                .sorted((o1, o2) -> o2.length() - o1.length())
                .peek(s -> System.out.println(s.length() + " - " + s))
                .map(String::length)
                .distinct()
                .toList();
        System.out.println(integers);

        MyInterface l1 = list -> {
            Integer result = null;
            for (String s : list) {
                if (result == null) {
                    result = s.length();
                } else {
                    if (result < s.length()) {
                        result = s.length();
                    }
                }
            }
            return result;
        };

        MyInterface l2 = list -> {
            Integer result = null;
            for (String s : list) {
                if (result == null) {
                    result = s.length();
                } else {
                    if (result > s.length()) {
                        result = s.length();
                    }
                }
            }
            return result;
        };

        calc(strings, l1);
        calc(strings, l2);

    }

    private static void calc(List<String> list, MyInterface myInterface) {
        int doWork = myInterface.doWork(list);
        System.out.println("Wynik -> " + doWork);
    }


}
