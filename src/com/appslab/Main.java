package com.appslab;

public class Main {

    public static void main(String[] args) {
        RPS("Scissors", "Paper");
    }

    public static void RPS(String player_1, String player_2) {
        if ((player_1.equals("Rock") && player_2.equals("Scissors")) || (player_1.equals("Paper") && player_2.equals("Rock")) || (player_1.equals("Scissors") && player_2.equals("Paper"))) {
            System.out.println("Player 1 win");
        } else if ((player_2.equals("Rock") && player_1.equals("Scissors")) || (player_2.equals("Paper") && player_1.equals("Rock")) || (player_2.equals("Scissors") && player_1.equals("Paper"))) {
            System.out.println("Player 2 win");
        } else {
            System.out.println("Tie");
        }
    }
}