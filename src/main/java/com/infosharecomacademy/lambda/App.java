package com.infosharecomacademy.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<String> strings = List.of("A", "", "AB", "CDDC", "12", "0001000", "A","ZZ","ZA");
        System.out.println(strings);
        List<Integer> integers = strings.stream()
                .sorted((o1, o2) -> o2.length() - o1.length())
                .peek(s -> System.out.println(s.length() + " - " + s))
                .map(String::length)
                .distinct()
                .toList();
        System.out.println(integers);

        String collect = strings.stream()
                .sorted((o1, o2) -> o2.length() - o1.length())
                .map(s -> String.valueOf(s.length()))
                .limit(1)
                .collect(Collectors.joining());
        System.out.println("Wynik: " + collect);

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

        Comparator<String> c1 = (o1, o2) -> {
            return o2.compareTo(o1);
        };

        System.out.println(sort(strings,c1));

    }

    private static void calc(List<String> list, MyInterface myInterface) {
        int doWork = myInterface.doWork(list);
        System.out.println("Wynik -> " + doWork);
    }

    private static List<String> sort(List<String> list, Comparator<String> comparator) {
        return list.stream()
                .filter(s -> !Objects.equals(s, ""))
                .sorted(comparator)
                .toList();
    }


}
