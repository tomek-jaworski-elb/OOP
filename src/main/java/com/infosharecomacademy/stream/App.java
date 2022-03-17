package com.infosharecomacademy.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.List.of;

public class App {
    public static void main(String[] args) {
        List<String> list = of("", "test", "ABC", "", "a");
        System.out.println(list);

        List<Integer> list1 = list.stream().filter(s -> !s.isEmpty()).map(String::length).sorted((o1, o2) -> o1 - o2).toList();
        System.out.println(list1);

        String s1 = "hello";
        String s2 = "academy";
        String s3 = "java";
        String s4 = "stream";

        List<String> strings = List.of(s1, s2, s3, s4);
        System.out.println(strings);

        List<Character> characters = strings.stream().map(s -> {
                    List<Character> result = new ArrayList<>();
                    for (int i = 0; i < s.length(); i++) {
                        result.add(s.charAt(i));
                    }
                    return result;
                }).flatMap(Collection::stream)
//                .map(character -> {
//                    Map<Character, Integer> map = new HashMap<>();
//                    map.putIfAbsent(character, 0);
//                    map.put(character, map.get(character) + 1);
//                    return map;
//                })
                .toList();

        System.out.println(characters);
        Map<Character,Integer> mapa = new HashMap<>();

        for (Character c : characters) {
            mapa.putIfAbsent(c,0);
            mapa.put(c,mapa.get(c)+1);
        }
        System.out.println(mapa);
    }
}
