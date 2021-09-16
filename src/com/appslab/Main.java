package com.appslab;

public class Main {

    public static void main(String[] args) {
    System.out.println(War(new int[]{12, 90, 75}));
    }
    static int War(int[] array) {
        int odd = 0;
        int even = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                odd = odd + i;
            }
        }
        for (int i : array) {
            if (i % 2 != 0) {
                even = even + i;
            }
        }
        if (even > odd) {
            return (even) - (odd);
        }
        else {
            return (odd) - (even);
        }
    }
}