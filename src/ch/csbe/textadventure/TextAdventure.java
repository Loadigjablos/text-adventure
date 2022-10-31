package ch.csbe.textadventure;

import java.util.Scanner;

/**
 * The starting Class
 * @author (c) Dominic Streit
 */
public class TextAdventure {
	
	static Scanner inputScanner = new Scanner(System.in); // Makes a new Input Scanner that Reads Console Input
	
	static public String lang = "en"; // Is the Language the user chooses
	static public int dificulty = 1; // Indicates how hard the game is to beat
	static String userInput = "nothing"; // Is a Container for the User Input
	
	/*
	 * here are all the user Items
	 */
	static public int usrAtck; // User Attack Damage
	static public int usrHp; // User Health
	static public int usrCharisma; // User inerStrengt Damage
	static public int usrPotion; // User Healing Potions
	static public int usrResistenz; // User Armor
	static public int money; // User Money
	static public int key; // user Keys
	
	/**
	 * Start of the Application
	 * @param args The Arguments passed to this Application
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to SPIRAL WORLD					Wilkommen zu SPIRAL WORLD");
		System.out.println("(c) Dominic Streit");
		/*
		 * the user is forced to input "en", "de" or "". it then changes the value of lang
		 */
		boolean test = true; // a short term boolean just to loop when there is a wrong input
		while (test == true) {
			System.out.println("What language do you speak? ('de' or 'en')		Welche sprache sprechen sie? ('de' oder 'en')");
			System.out.print("                   ");
			userInput = readConsoleString();
			if (userInput.equals("en") || userInput.equals("")) {
				test = false;
			} else if (userInput.equals("de")) {
				lang = "de";
				test = false;
			} else {
				System.out.println("error, please chose from 'de' or 'en'");
			}
		} 
		/*
		 * the user is forced to input "1", "2" or "". it then changes the value of dificulty
		 * it also is either if lang is "en" it is printing it out in Englisch
		 */
		test = true; // sets to true, just to loop when there is a wrong input
		while (test == true) {
			switch (lang) {
				case "en":
					System.out.println("What Dificulty do you want?");
					System.out.println("'1' is easy / '2' is hard");
					break;
				case "de":
					System.out.println("Welche schwirigkeit wollen sie?");
					System.out.println("'1' ist leicht / '2' ist schwierig");
					break;
			}
			System.out.print("                   ");
			/*
			 * the user is forced to input.
			 */
			userInput = readConsoleString();
			if (userInput.equals("1") || userInput.equals("")) {
				test = false;
				usrAtck = 10;
				usrHp = 100;
				usrCharisma = 20;
				usrPotion = 3;
				usrResistenz = 2;
				money = 100;
				key = 0;
			} else if (userInput.equals("2")) {
				dificulty = 2;
				test = false;
				usrAtck = 3;
				usrHp = 10;
				usrCharisma = 0;
				usrPotion = 0;
				usrResistenz = 1;
				money = 200;
				key = 0;
			} else {
				switch (lang) {
					case "en":
						System.out.println("error, please chose from '1' or '2'");
						break;
					case "de":
						System.out.println("Fehler, bitte wähle '1' oder '2'");
						break;
				}
			}
		}
		/*
		 * these are the last words from this class.
		 */
		System.out.println("");
		switch (lang) {
			case "en":
				System.out.println("Hello adventurer, this is the start to your journey as the greatest quest conqueror and the enemys worst nightmare");
				System.out.println("With this sayd you can do many things, you will see");
				break;
			case "de":
				System.out.println("Hallo Abenteurer, dies ist der Beginn deiner Reise als größter Quest-Eroberer und schlimmster Albtraum des Feindes");
				System.out.println("damit gesagt, du kannst vieles machen. Du wirst sehen");
				break;
		}
		System.out.println("");
		Menu.menu();
	}
	/**
	 * Wants the User to write Something and Returns it
	 * @return what the users wrote in the console
	 */
	static String readConsoleString() {
		String userInput = inputScanner.nextLine();
		return userInput;
	}
}
