package com.altun.ConditionalStatement;

public class Main {

    public static void main(String[] args) {
	// Season validation with a Switch Statement

        int currentSeason = 2;

        if (currentSeason  >= 0 && currentSeason < 5) {
            switch (currentSeason) {
                case 1:
                    System.out.println("Spring!");
                    break;
                case 2:
                    System.out.println("Summer!");
                    break;
                case 3:
                    System.out.println("Autumn!");
                    break;
                default:
                    System.out.println("Winter!");
            }
        }
    }
}
