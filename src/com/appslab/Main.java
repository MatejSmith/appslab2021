package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.println(Ending("appslab", "lab"));
        System.out.println(Ending("appslab", "Lab"));
    }
    static boolean Ending(String full, String ending){
        return full.endsWith(ending);
    }
}