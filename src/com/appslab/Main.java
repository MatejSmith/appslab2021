package com.appslab;

public class Main {

    public static void main (String[] args) {
        if (checkPalindrome("oko")) {
            System.out.println("Zhoda");
        } else {
            System.out.println("Nezhoda");
        }
    }

    public static boolean checkPalindrome(String word) {
        boolean check;
        StringBuilder reverse = new StringBuilder();
        int word_lenght = word.length();
        for (int i = word_lenght - 1; i >= 0; i--) {
            reverse.append(word.charAt(i));
        }

        check = word.equals(reverse.toString());
        return check;
    }
}