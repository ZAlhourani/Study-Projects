package com.techelevator;

import java.util.*;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		// Create a map
		Map<String, Integer> namesAndZipCodes = new HashMap<>();

		int howManyEntries = namesAndZipCodes.size();

		// add to the map

		namesAndZipCodes.put("Dan", 15227);
		namesAndZipCodes.put("David", 15222);

		// if we add this
		namesAndZipCodes.put("David", 15226); // this will replace "David".

		Integer davidsZipCode = namesAndZipCodes.get("David"); // retrieve value assoc. with "David". if not then the returns null

		if (namesAndZipCodes.containsKey("David")) {
			davidsZipCode = namesAndZipCodes.get("David");
		}

		namesAndZipCodes.remove("David"); // removes both key and value

		namesAndZipCodes.put("Bobby", 90210);
		namesAndZipCodes.put("Sally", 34543);

		// looping over the map
		// for (DataType variableName : Collection)

		for (String name : namesAndZipCodes.keySet()) {
			Integer zipCode = namesAndZipCodes.get(name);
			System.out.println("Name: " + name + " Zip: " + zipCode);
		}

		// another way to loop

		for (Map.Entry<String, Integer> keyValuePairing : namesAndZipCodes.entrySet()) {
			String name = keyValuePairing.getKey();

			Integer zipCode = keyValuePairing.getValue();

			System.out.println("Name: " + name + " Zip: " + zipCode);
		}

		System.out.println("####################");
		System.out.println("        SETS");
		System.out.println("####################");
		System.out.println();

		Set<String> names = new HashSet<>();

		// ask for the size
		int howManyNames = names.size();

		// add to the set
		names.add("Tom");
		names.add("Walt");
		names.add("Julie");
		names.add("Walt"); // won't do anything

		// Looping in the set

		for (String name : names) {                    // : means in
			System.out.println(name);
		}
		// remove from the Set, returns true if it did
		names.remove("Walt");


		if (names.contains("Walt")) {
			System.out.println("Walt is in the Set");
		} else {
			System.out.println("Walt is not in the Set");
		}


	}

	/*
		Problems:

		1) Determine if a list has duplicates.

		2) Given a list, remove all duplicates from it.

		3) Build a structure that represents a dictionary of words and their definitions.


		4) Given a list of integers, find and return a number that appears most frequently.
		In the case of a tie, return the largest value.

		5) Given two Strings, return true if they are anagrams.

	 */

	// #2
	public static List<String> getDefinitionForWord(String word) {

		if (word == null) {
			return null;
		}

		Map<String, List<String>> dictionary = new HashMap<>();

		List<String> javaDefinition = new ArrayList<>();
		javaDefinition.add("Coffee");
		javaDefinition.add("A Programming Language");

		dictionary.put("java", javaDefinition);

		List<String> cSharpDefinition = new ArrayList<>();
		cSharpDefinition.add("A Musical Note");
		cSharpDefinition.add("A Programming Language");

		dictionary.put("c#", cSharpDefinition);

		word = word.toLowerCase();

		if (dictionary.containsKey(word)) {
			return dictionary.get(word);
		} else {
			return List.of("I'm not sure.");
		}
	}


	// [ 50, 30, 22, 30, 50, 50 ]

	public static int findMostFrequent(List<Integer> nums) {
		int mostFrequentNumber = -1;
		int frequency = 0;


		Map<Integer, Integer> freqMap = new HashMap<>();

		for (Integer num : nums) {

			if (freqMap.containsKey(num)) {

				if (freqMap.containsKey(num)) {
					int updatedFrequency = freqMap.get(num) + 1;
					freqMap.put(num, updatedFrequency);
				} else {
					freqMap.put(num, 1);
				}

				int currentNumFrequency = freqMap.get(num);
				if (currentNumFrequency > frequency) {
					mostFrequentNumber = num;
					frequency = currentNumFrequency;
				} else if (currentNumFrequency == frequency && num > mostFrequentNumber) {
					mostFrequentNumber = num;

				}
			}
		}
		return mostFrequentNumber;
	}
}