package com.techelevator;

import java.util.Scanner;

public class StoreOpenReporter {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please provide the current hour: ");
        String userInput = keyboard.nextLine();
        int currentHour = Integer.parseInt(userInput);

        System.out.println("Please provide the current day: ");
        userInput = keyboard.nextLine();
        char currentDay = userInput.charAt(0);
        boolean isSummer = false;
        boolean isValidInput = true;

        do {
            System.out.println("Is it summer (Y/N)? ");
            userInput = keyboard.nextLine();

            if (userInput.equals("Y") || userInput.equals("y")) {
                isSummer = true;
            } else if (userInput.equalsIgnoreCase("N")) {
                isSummer = false;
            } else {
                System.out.println("Incorrect value. Please Y or N");
//                   System.exit(0);
                isValidInput = false;
            }
        } while (!isValidInput);

        boolean result = isStoreOpen(currentHour, currentDay, isSummer);

        if (result) {
            System.out.println("The store is open!");
        } else {
            System.out.println("The store is closed :( ");
        }
    }
    public static boolean isStoreOpen(int currentHour, char currentDay, boolean isSummer) {
        if (!isSummer) {
            return currentHour >= 8 && (currentDay == 'M' || currentDay == 'W' || currentDay == 'F') && currentHour < 17;
        } else {
            if (currentDay == 'M' || currentDay == 'F') {
                return currentHour >= 8 && currentHour < 17;
            } else if (currentDay == 'W') {
                return currentHour >= 8 && currentHour < 20;
            } else if (currentDay == 'S') {
                return currentHour >= 9 && currentHour < 15;
            }
        }
        return false;
    }


}
