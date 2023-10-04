package com.techelevator;

import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	// Use this scanner for all user input. Don't create additional Scanners with System.in
	private final Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		FizzWriter fizzWriter = new FizzWriter();
		fizzWriter.run();
	}

	public void run() {
		/* Your code goes here */

		System.out.println("What is the new file");
		String newFile = userInput.nextLine();

		File outputFile = new File (newFile);

		try (PrintWriter printWriter = new PrintWriter(outputFile)) {

			for (int i = 1; i <= 300; i++) {

				if (i % 3 == 0 && i % 5 == 0) {
					printWriter.println("FizzBuzz");

				} else if (i % 3 == 0) {
					printWriter.println("Fizz");

				} else if (i % 5 == 0) {
						printWriter.println("Buzz");

				}else {

					printWriter.println(i);
				}
			}
		}catch (FileNotFoundException e) {
		}

	}

}
