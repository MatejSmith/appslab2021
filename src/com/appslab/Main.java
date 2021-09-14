package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.print(Calculation(0.2, 0.4, 100.0));
    }

    public static double Calculation(double goUp, double goNext, double tower)
    {
        return ((tower / goUp) * goNext) + tower;
    }
}