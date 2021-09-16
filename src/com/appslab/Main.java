package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.println(Ending("abc", "stv"));
    }
    static String Ending(String full, String ending){
        String reverse = "";
        String second_reverse = "";
        for (int i = full.length() - 1; i >= 0; i--) {
            reverse = reverse + full.charAt(i);
        }
        for (int i = ending.length() - 1; i >= 0; i--) {
            second_reverse = second_reverse + ending.charAt(i);
        }

    }
}