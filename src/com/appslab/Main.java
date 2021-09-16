package com.appslab;

public class Main {

    public static void main(String[] args) {
    System.out.println(Function((new int[]{44, 32, 86, 19})));
    }

    static int Function(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int j : array) {
            if (j < min)
                min = j;
        }
        for (int i : array) {
            if (i > max)
                max = i;
        }
            return (max) - (min);
    }
}