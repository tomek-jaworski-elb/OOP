package com.infosharecomacademy.generics;

import com.infosharecomacademy.streamgson.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        System.out.println("Generics!");

        List<Box> box = new ArrayList<>();

        box.add(new Box(1));
        box.add(new Box('a'));
        box.add(new Box("A"));
        box.add(new Box(new Student("Tomasz", "Jaworski", 1979)));
        box.add(new Box(1d));
        box.add(new Box("A"));


        Set<Box> boxSet = printList(box);
        box.forEach((b) -> {
            System.out.println(b.toString());
        });

        List<Integer> integers = List.of(1,2,3,4,0,0,5,8,-1);
        Set<Integer> integerSet = printList(integers);
        System.out.println(integerSet.stream().sorted((o1, o2) -> o2-o1).toList());
    }

    private static <T> Set<T> printList(List<T> list) {
        list.forEach(t -> {
            System.out.println(t.toString());
        });
        return new HashSet<>(list);
    }
}
