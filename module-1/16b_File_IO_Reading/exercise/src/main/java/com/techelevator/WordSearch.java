package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Year;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {

	// Use this scanner for all user input. Don't create additional Scanners with System.in
	private final Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		WordSearch wordSearch = new WordSearch();
		wordSearch.run();
	}

	public void run() {
		/* Your code goes here */


		System.out.println("What is the fully qualified name of the file that should be searched?");
		String filePath = userInput.nextLine();

		File inputFilePath = new File(filePath);


		try (Scanner fileScanner = new Scanner(inputFilePath)) {

			int lineNumber = 1;
			boolean ifTheWordFound = false;


			System.out.println("What is the search word you are looking for?");
			String wordToFind = userInput.nextLine();


			System.out.println("Should the search be case sensitive? (Y) yes, (N) no");
			String yesOrNo = userInput.nextLine();


			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();

				if (yesOrNo.equalsIgnoreCase("Y")) {

					if (line.contains(wordToFind)) {

						System.out.println(lineNumber + ": " + line);
					}
				}

				if (yesOrNo.equalsIgnoreCase("N")) {
					if (line.toLowerCase().contains(wordToFind.toLowerCase())) {
						System.out.println(lineNumber + ": " + line);
					}

					ifTheWordFound = true;
				}
					lineNumber++;
				}

		} catch(FileNotFoundException e) {
				System.out.println("Error: File not found. Please check the file path and try again.");

		}

	}
}






