package com.techelevator.services;

import java.util.Scanner;

public class ConsoleService {

    private final Scanner scanner = new Scanner(System.in);

    public int promptForMenuSelection() {

        int menuSelection;

        System.out.println("Please choose an option");

        try {
            menuSelection = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e) {
            menuSelection = -1;
        }
        return menuSelection;
    }

    public void printMainMenu() {
        System.out.println();
        System.out.println("----Games Menu----");
        System.out.println("1: List Games");
        System.out.println("2: Select a Game by Using Game ID");
        System.out.println("3: Start Game");
        System.out.println("4: Make a Guess for Existing Game");
        System.out.println("0: Exit");
        System.out.println();
    }

}
