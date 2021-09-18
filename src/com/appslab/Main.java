package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.println((canCapture(new String[]{"A8", "F8"})));
    }

    static boolean canCapture(String[] array) {
        String First = "", Second = "", Third = "", Fourth = "";
        for (int i = 1; i < array[0].length(); i++) {
            First = First + array[0].charAt(i);
        }
        for (int i = 1; i < array[1].length(); i++) {
            Second = Second + array[1].charAt(i);
        }
        for (int i = 0; i < array[0].length() - 1; i++) {
            Third = Third + array[0].charAt(i);
        }
        for (int i = 0; i < array[1].length() - 1; i++) {
            Fourth = Fourth + array[1].charAt(i);
        }
        return First.equals(Second) || Third.equals(Fourth);
    }
}