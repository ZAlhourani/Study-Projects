package com.techelevator.auctions;

import com.techelevator.services.ConsoleService;

public class App {

    private final ConsoleService consoleService = new ConsoleService();

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    private void run() {
        int menuSelection = -1;

        while (menuSelection != 0) {
            consoleService.printMainMenu();
            menuSelection = consoleService.promptForMenuSelection();
            if (menuSelection == 1) {

            }else if (menuSelection == 2){

            }else if (menuSelection == 3) {

            }else if (menuSelection == 4) {

            }else if (menuSelection == 0) {
                continue;
            }else {
                System.out.println("Invalid Selection");
            }
        }

    }

}
