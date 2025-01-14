package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RTNValidator {
	
	private static final int[] CHECKSUM_WEIGHTS = new int[] { 3, 7, 1, 3, 7, 1, 3, 7, 1 };

	public static void main(String[] args) {

		printApplicationBanner();

		File inputFile = getInputFileFromUser();

		try(Scanner fileScanner = new Scanner(inputFile)) {

			while (fileScanner.hasNext()) {
				String line = fileScanner.nextLine();
				boolean isValid = checksumIsValid(line);
				if (isValid) {
					System.out.println(line + " is valid!");
				} else {
					System.out.println(line + " is invalid!");
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("Sorry the file was no able to be opened.");
		}
/*		finally {
			if (fileScanner != null)
			fileScanner.close();

		}*/
	}
	private static void printApplicationBanner() {
		System.out.println("******************");
		System.out.println("RTN Validator 9000");
		System.out.println("******************");
		System.out.println();
	}

	@SuppressWarnings("resource")
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();
		
		File inputFile = new File(path);
		if (inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path+" does not exist");
			System.exit(1); // Ends the program
		} else if (inputFile.isFile() == false) {
			System.out.println(path+" is not a file");
			System.exit(1); // Ends the program
		}
		return inputFile;
	}

	private static boolean checksumIsValid(String routingNumber) {
		int checksum = 0;
		for (int i = 0; i < 9; i++) {
			int digit = Integer.parseInt(routingNumber.substring(i, i+1));
			checksum += digit * CHECKSUM_WEIGHTS[i];
		}
		return checksum % 10 == 0;
	}
}
