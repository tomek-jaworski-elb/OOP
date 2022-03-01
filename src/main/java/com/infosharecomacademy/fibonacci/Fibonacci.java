package com.infosharecomacademy.fibonacci;

public class Fibonacci {

    public static long count(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return count(n - 1) + count(n - 2);
    }
}
