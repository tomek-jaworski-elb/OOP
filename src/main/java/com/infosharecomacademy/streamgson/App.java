package com.infosharecomacademy.streamgson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        List<Student> studentList;

        studentList = List.of(new Student("Tomek", "Jaworski", 1979),
                new Student("Juliusz", "Jaworski", 2005),
                new Student("Julia", "Jaworska", 2010),
                new Student("Małgorzata", "Jaworska", 1976),
                new Student("Juliusz", "Jaworski", 2005)
        );

        studentList.stream()
                .sorted((o1, o2) -> {
                    return getAge(o2.getYearOfBirth()) - getAge(o1.getYearOfBirth());
                })
                .forEach(x -> System.out.println("Wiek: " + getAge(x.getYearOfBirth()) + ", " + x));

        Set<Student> studentSet = createJson(studentList);
        studentSet.forEach(System.out::println);
    }

    private static int getAge(Integer yearOfBirth) {
        LocalDate today = LocalDate.now();
        LocalDate date = LocalDate.of(yearOfBirth, 1, 1);
        Period period = Period.between(date, today);
        return period.getYears();
    }

    private static <T> Set<T> createJson(List<T> list) {
        Gson gson = gsonBuilder();
        String s = gson.toJson(list);
        System.out.println(s);
        Set<Student> studentSet = readJson(s);
        return (Set<T>) studentSet;
    }

    private static Set<Student> readJson(String json) {
        Gson gson = gsonBuilder();

        Type listOfStudents = new TypeToken<ArrayList<Student>>() {
        }.getType();

        List<Student> studentList = gson.fromJson(json, listOfStudents);
        return new HashSet<>(studentList);
    }

    private static Gson gsonBuilder() {
        GsonBuilder builder = new GsonBuilder();

        return builder
                .setPrettyPrinting()
                .create();
    }
}
