package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double inputLength;
		int length2;

		System.out.println("Please enter the length:");
		String userInput = keyboard.nextLine();
		int currentLength = Integer.parseInt(userInput);

		System.out.println("Is the length in (f)Foot, or (m)Meters?");
		userInput = keyboard.nextLine();

		if (userInput.equalsIgnoreCase("f")) {
			length2 = (int) (currentLength * 0.3048);
			System.out.println(currentLength + "f is " + length2 + "m");

		}else if (userInput.equalsIgnoreCase("m")) {
			length2= (int) (currentLength * 3.2808399);
			System.out.println(currentLength + "m is " + length2 +"f" );
		}

	}

}
