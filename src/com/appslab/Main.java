package com.appslab;

public class Main {
    public static void main(String[] args) {
        if (!Pie(24, 12, 2)) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }

    public static boolean Pie(int total, int recipients, int each) {
        return each * recipients <= total;
    }
}