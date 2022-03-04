package com.infosharecomacademy.fibonacci;

public class Fibonacci {

    public static long count(int n) {
        if ((n == 0)||(n==1)) {
            return n;
        }
        return count(n - 1) + count(n - 2);
    }
}
