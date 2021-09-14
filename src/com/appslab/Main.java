package com.appslab;

public class Main {
    public static void main(String[] args) {
        System.out.println(Equal(2,3,4));
    }

    public static int Equal(int a, int b, int c)
    {
        int numberOfEquals = 0;
        if (a == b && b ==c ) {
            numberOfEquals = 3;
        } else if (a == b || a == c || b == c) {
            numberOfEquals = 2;
        }
        return numberOfEquals;
    }
}