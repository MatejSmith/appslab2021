package com.appslab;

public class Main {

    public static void main (String[] args) {
        if (Akoze("oko")) {
            System.out.println("Zhoda");
        } else {
            System.out.println("Nezhoda");
        }
    }

    public static boolean Akoze(String slovo) {
        boolean uvidime;
        String reverse = "";
        int dlzka = slovo.length();
        for (int i = dlzka - 1; i >= 0; i--) {
            reverse = reverse + slovo.charAt(i);
        }

        uvidime = slovo.equals(reverse);
        return uvidime;
    }
}