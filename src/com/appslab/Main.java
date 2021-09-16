package com.appslab;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(multiplyByLength(new int[]{1, 4, 6, 3, 7, 5})));
    }

    static int[] multiplyByLength(int[] array) {
        int x = 0;
        for (int a = 0; a < array.length; a++) {
            x = a + 1;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * x;
        }
        return array;
    }
}