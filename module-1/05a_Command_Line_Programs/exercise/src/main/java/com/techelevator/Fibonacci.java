package com.techelevator;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int firstNumber = 0;
		int secondNumber = 1;
		int resultNumber = 0;

		System.out.println("Please enter a number:");
		String userInput = keyboard.nextLine();
		int number = Integer.parseInt(userInput);
		System.out.println(firstNumber + " " + secondNumber);

		for (int i = 2; i < number; i++) {

		resultNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = resultNumber;
			System.out.println(" " + resultNumber);

		}
	}
	}





