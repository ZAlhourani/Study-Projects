package com.techelevator;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes) */

		/* create an new instance of String using a literal */

		String name = "Walt";

		String name2 = new String("Walt");

		String name3 = "Walt";

		if (name == name3) {
			System.out.println("name and name3 are equal");
		}

		if (name == name2) {
			System.out.println("name and name2 are equal");
		}

		if (name.equals(name2)) {
			System.out.println("name and name2 are .equal true");
		}

		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();


		/* Other commonly used methods:
		 *
		 * charAt
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * replace
		 * trim
		 * split
		 */


		String helloWorld = "Hello World!";

		char w = helloWorld.charAt(6);

		System.out.println(helloWorld.charAt(6));

		if (helloWorld.startsWith("Hello")) {

		}
		if (helloWorld.endsWith("World!")) {

		}
		if (helloWorld.contains("W")) {

		}

		int indexOfHello = helloWorld.indexOf("Hello"); //returns 0
		int indexOfWorld = helloWorld.indexOf("World"); //returns 6
		int indexOfBob = helloWorld.indexOf("Bob"); // returns -1

		int indexOfL = helloWorld.indexOf("l"); //returns 2
		int lastIndexOfL = helloWorld.lastIndexOf("l"); //returns 9

		int howManyLs = 0;
		for (int i = 0; i < helloWorld.length(); i++) {
			if (helloWorld.charAt(i) == 'l') {
				howManyLs++;
			}
		}

		// "Hello World!"

		String subString4 =  helloWorld.substring(4); // "o World!"

		String subString4to7 = helloWorld.substring(4, 7); // "o W" (it doesn't print the 7)

		// is a string a palindrome?
		// Palindrome: a string that reads the same left to right and right to left
		//racecar
		//tacocat
		// return true if a string is a palindrome

		for (int i = 0; i < testString

		}
			if




		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();


		System.out.println();
		System.out.println("****************************************************");
		System.out.println("****** COMBINING MANY STRINGS (StringBuilder) ******");
		System.out.println("****************************************************");
		System.out.println();
	}
}
