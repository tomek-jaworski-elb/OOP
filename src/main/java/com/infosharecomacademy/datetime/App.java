package com.infosharecomacademy.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        LocalDateTime localDateTime;
        localDateTime = LocalDateTime.parse("2015-08-18 14:42:59", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - hh:mm")));
    }
}
