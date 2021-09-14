package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.println(multiplyByLength(new int[]{1, 5, 2, 4, 7, 1}));
    }

    static int multiplyByLength(int[] array) {
        int x = 0;
        int z = 0;
        for (int i : array) {
            x = i;
        }
        /*for (int i = 0; i < array.length; i++) {
            array[i] = i * x;
        }*/

        for (int a = 0; a < array.length; a++) {
            z = a;
        }

        return z;
    }
}