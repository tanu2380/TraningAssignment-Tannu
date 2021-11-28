package com.tannu.dictionary;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		
		Map<String, String> dictionary =new TreeMap<String, String>();
		dictionary.put("Apple", "Apple is a fruit.");
		dictionary.put("Cat", "Cat is an animal");
		dictionary.put("Home", "A place where all family member live together");
		dictionary.put("Mall", "A place where all shopping items are available");
		dictionary.put("Youtube","A video sharing social media platform");
		dictionary.put("Sunday", "Sunday is weekend");
		
		System.out.println("Enter a word:");
		name = sc.next();
		
		if(dictionary.containsKey(name)){
			System.out.println(dictionary.get(name));
		}else {
			System.out.println("OOPs, Your word is not available in this dictionary.");
		}
		
		sc.close();
	}
}
