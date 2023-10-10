package com.techelevator;

import java.io.*;
import java.util.Scanner;

public class FindAndReplace {

    // Use this scanner for all user input. Don't create additional Scanners with System.in
    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        FindAndReplace findAndReplace = new FindAndReplace();
        findAndReplace.run();
    }

    public void run() {
        /* Your code goes here */

        System.out.print("What is the search word?");
        String searchWord = userInput.nextLine();

        System.out.print("What is the replacement word?");
        String replacementWord = userInput.nextLine();

        System.out.print("Name of source file?");
        String sourceFile = userInput.nextLine();
        File originalFile = new File(sourceFile);

        System.out.print("Name of destination file?");
        String destinationFile = userInput.nextLine();
        File copiedFile = new File(destinationFile);


        try (Scanner fileReader = new Scanner(originalFile);
             PrintWriter printWriter = new PrintWriter(copiedFile)) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                if (line.contains(searchWord)) {
                    printWriter.println(line.replace(searchWord, replacementWord));
                } else {
                    printWriter.println(line);
                }
            }

        }catch (FileNotFoundException e) {
        }

        }
    }




