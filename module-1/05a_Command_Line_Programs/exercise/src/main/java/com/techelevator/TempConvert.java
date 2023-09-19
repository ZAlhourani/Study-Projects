package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double inputTemp = 0.0;
		int temp2 = 0;

		System.out.println("Please enter the temperature:");
		String userInput = keyboard.nextLine();
		int currentTemp = Integer.parseInt(userInput);

		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?");
		userInput = keyboard.nextLine();

		if (userInput.equalsIgnoreCase("F")) {
			temp2 = (int) ((currentTemp- 32) / 1.8);
			System.out.println(currentTemp + "F is " + temp2 + "C");

		}else if (userInput.equalsIgnoreCase("C")) {
			temp2= (int) (currentTemp * 1.8 + 32);
			System.out.println(currentTemp + "C is " + temp2 +"F" );
		}

	}

}
