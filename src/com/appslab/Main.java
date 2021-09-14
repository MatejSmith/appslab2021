package com.appslab;

public class Main {
    public static void main(String[] args) {
        if (!Triangle(4, 5, 9)) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }

    public static boolean Triangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}