package ch.csbe.textadventure;

import java.util.Scanner;

/**
 * The Main Class
 * @author (c) Dominic Streit
 */
public class Menu {

	static Scanner inputScanner = new Scanner(System.in); // Makes a new Input Scanner that Reads Console Input
	
	public static int secret = 0; // This Variable only gets to 1 if the last Quest is done
	public static int lvlDone = 0; //Gets higher for every Level that is made
	static String userInput = "nothing"; // Is a Container for the User Input
	
	/**Outputs certainty Words In different Languages depending on the Variable TextAdventure.lang
	 * This Is the Main Screen, from here you can go to many other Methods by the Input of the user.
	 */
	public static void menu() {
		/*
		 *  its a invinite loop, but there is a way out with quit
		 */
		while (0 == 0) {
			/*
			 * gives you all its options
			 */
			System.out.println("");
			switch (TextAdventure.lang) {
			case "en":
				System.out.println("Welcome to the Menu. What would you like to do?");
				System.out.print("go on 'quests', visit the 'shop', show your 'items' change your 'settings' or 'quit'. ");
				if (secret == 1) {
					System.out.println("what is that behind you? 'secret'");
				}
				break;
			case "de":
				System.out.println("Willkommen im Menü. Was würdest du gern tun?");
				System.out.print("Gehen Sie auf 'quests', besuchen Sie den 'shop', zeigen Sie Ihre 'items', ändern Sie Ihre 'settings' oder 'quit' sie.");
				if (secret == 1) {
					System.out.println("was ist das hinter dir? 'secret'");
				}
				break;
			}
			System.out.println("");
			System.out.println("");
			/*
			 * the user is forced to input.
			 */
			userInput = readConsoleString();
			if (userInput.equals("quests")) {
				quests();
			} else if (userInput.equals("shop")) {
				shop();
			} else if (userInput.equals("items")) {
				items();
			} else if (userInput.equals("settings")) {
				settings();
			} else if (userInput.equals("quit")) {
				quit();
			} else if (userInput.equals("secret")) {
				/*
				 * only if the user did the last level, which changes the variable secret to one.
				 */
				if (secret == 1) {
					switch (TextAdventure.lang) {
						case "en":
							System.out.println("This is the Final Boss, I hope you are prepared");
							break;
						case "de":
							System.out.println("Das ist der letzte Boss, ich hoffe, Sie sind darauf vorbereitet");
							break;
					}
					System.out.println("");
					Quests.fight(5, 1);
					System.out.println("");
					switch (TextAdventure.lang) {
						case "en":
							System.out.println("Congratulations you have beaten the game. you should be proud. Not if you cheated!");
							break;
						case "de":
							System.out.println("Herzlichen Glückwunsch, Sie haben das Spiel gewonnen. du solltest stolz sein. Nicht, wenn Sie betrogen haben!");
							break;
					}
					System.out.println("");
					System.out.println("(c) Dominic Streit");
					System.out.println("");
				} else {
					/*
					 * so the user shouldn't know this exists until he did the last level.
					 */
					switch (TextAdventure.lang) {
						case "en":
							System.out.println("What did you say?");
							System.out.println("");
							break;
						case "de":
							System.out.println("Was sagten sie?");
							System.out.println("");
							break;
					}
				}
			} else {
				switch (TextAdventure.lang) {
					case "en":
						System.out.println("What did you say?");
						System.out.println("");
						break;
					case "de":
						System.out.println("Was sagten sie?");
						System.out.println("");
						break;
				}
			}
		}
	}
	/** Outputs certainty Words in different Languages depending on the Variable TextAdventure.lang
	 * It loops, but if User Input is 'back' it stops
	 * You can buy things by writing the Item Id, but you must have enough Money
	 * @return goes back to the menu
	 */
	static void shop() {
		boolean sure = true;
		while (sure == true) {
			switch (TextAdventure.lang) {
				case "en":
					System.out.println("Welcome to the shop. What would you like to buy?");
					System.out.println("with 'back' you can go back");
					System.out.println("Please write the Item id (1 - 20 ...)");
					System.out.println("");
					System.out.println("NAME: 				| COST: 	| DESCRIPTION:");
					System.out.println("Healing 			| 50 		| It heals you by 10 HP Instantly");
					System.out.println("Healing+ 			| 200 		| It heals you by 50 HP Instantly");
					System.out.println("Healing++ 			| 1000 		| It heals you by 600 HP Instantly");
					System.out.println("Sword 				| 200 		| Makes your ATCK better");
					System.out.println("Sword+ 				| 1000 		| Makes your ATCK even better");
					System.out.println("Love_Book 			| 200 		| Makes your CHARISMA higher");
					System.out.println("Love_DvD 			| 1000 		| Makes your CHARISMA even higer");
					System.out.println("Personal_Trainer		| 10000 	| Your ATCK and your Charisma is being tripled");
					System.out.println("Potion				| 200	 	| Gives you a potion you can use while attacking");
					System.out.println("Key	 			| 5000		| You will have a Key");
					System.out.println("Armor				| 5000		| your Armor will get better");
					break;
				case "de":
					System.out.println("Willkommen im shop. Was würdest du gern kaufen?");
					System.out.println("mit 'back' können sie zurück");
					System.out.println("Bitte geben Sie die Artikel-ID ein (1 - 11)");
					System.out.println("");
					System.out.println("NAME: 				| COST: 	| DESCRIPTION:");
					System.out.println("Heilung 			| 50 		| Es heilt 10 HP Direckt");
					System.out.println("Heilung+ 			| 200 		| Es heilt 50 HP Direckt");
					System.out.println("Heilung++ 			| 1000 		| Es heilt 600 HP Direckt");
					System.out.println("Schwert				| 200 		| Macht ihre ATCK besser");
					System.out.println("Schwert+ 			| 1000 		| Macht ihre ATCK noch besser");
					System.out.println("Liebes_Buch 			| 200 		| Macht ihre CHARISMA besser");
					System.out.println("Liebes_DvD 			| 1000 		| Macht ihre CHARISMA noch besser");
					System.out.println("Persönlicher_Trainer		| 10000 	| Deine ATCK und CHARISMA wird verdreifacht");
					System.out.println("Heilungs_Trank			| 200	 	| Du bekommst ein trank für im kampf");
					System.out.println("Schlüsel			| 5000		| Du bekomst einen Schlüsel");
					System.out.println("rüstung				| 5000		| Deine rüsting wird besser");
					break;
			}
			System.out.println("");
			/*
			 * the user is forced to input.
			 */
			userInput = readConsoleString();
			/*
			 * here the user can buy items with the id or go back. wenn he hasnt enough mony the user cant buy it
			 */
			if (userInput.equals("back")) {
				sure = false;
			} else if (userInput.equals("1")) {
				if (TextAdventure.money >= 50) {
					TextAdventure.usrHp += 10;
					TextAdventure.money -= 50;
				}
			} else if (userInput.equals("2")) {
				if (TextAdventure.money >= 200) {
					TextAdventure.usrHp += 50;
					TextAdventure.money -= 200;
				}
			} else if (userInput.equals("3")) {
				if (TextAdventure.money >= 1000) {
					TextAdventure.usrHp += 600;	
					TextAdventure.money -= 1000;
				}
			} else if (userInput.equals("4")) {
				if (TextAdventure.money >= 200) {
					TextAdventure.money -= 200;
					TextAdventure.usrAtck += 4;
				}
			} else if (userInput.equals("5")) {
				if (TextAdventure.money >= 1000) {
					TextAdventure.money -= 1000;
					TextAdventure.usrAtck += 20;
				}
			} else if (userInput.equals("6")) {
				if (TextAdventure.money >= 200) {
					TextAdventure.money -= 200;
					TextAdventure.usrCharisma += 4;
				}
			} else if (userInput.equals("7")) {
				if (TextAdventure.money >= 1000) {
					TextAdventure.money -= 1000;
					TextAdventure.usrCharisma += 20;
				}
			} else if (userInput.equals("8")) {
				if (TextAdventure.money >= 10000) {
					TextAdventure.money -= 10000;
					TextAdventure.usrAtck *= 3;
					TextAdventure.usrAtck *= 3;
				}
			} else if (userInput.equals("9")) {
				if (TextAdventure.money >= 200) {
					TextAdventure.money -= 200;
					TextAdventure.usrPotion += 1;
				}
			} else if (userInput.equals("10")) {
				if (TextAdventure.money >= 5000) {
					TextAdventure.money -= 5000;
					TextAdventure.key += 1;
				}
			} else if (userInput.equals("11")) {
				if (TextAdventure.money >= 5000) {
					TextAdventure.money -= 5000;
					TextAdventure.usrResistenz += 1;
				}
			} else {
				switch (TextAdventure.lang) {
					case "en":
						System.out.println("What?");
						break;
					case "de":
						System.out.println("Was?");
						break;
				}
			}
			items();
		}
		return;
	}
	/** Outputs certainty Words in different Languages depending on the Variable TextAdventure.lang
	 * It loops, but if User Input is 'back' it stops
	 * You can chose a Quest by the id and you will go to it in the Class Quests
	 * @return goes back to the menu
	 */
	static void quests() {
		boolean sure = true;
		while (sure == true) {
			switch (TextAdventure.lang) {
				case "en":
					System.out.println("Hello there stranger, come here and see what you would like to do");
					System.out.println("with 'back' you can go back");
					System.out.println("please write the id of the specific level");
					System.out.println("id: | Name:  | difficulty:");
					System.out.println("1   | Level 1| easy");
					System.out.println("2   | Level 2| easy");
					System.out.println("3   | Level 3| mediocre");
					System.out.println("4   | Level 4| mediocre");
					System.out.println("5   | Boss   | hard");
					System.out.println("you have done Level " + lvlDone);
					break;
				case "de":
					System.out.println("Hallo Fremder, komm her und schau, was du gerne machen wilst");
					System.out.println("mit 'back' können sie zurück");
					System.out.println("Bitte geben Sie die ID des jeweiligen Levels an");
					System.out.println("id: | Name:  | schwierigkeit:");
					System.out.println("1   | Level 1| leicht");
					System.out.println("2   | Level 2| leicht");
					System.out.println("3   | Level 3| mittel");
					System.out.println("4   | Level 4| mittel");
					System.out.println("5   | Boss   | schwer");
					System.out.println("du hast Level " + lvlDone + " geschaft");
					break;
			}
			System.out.println("");
			/*
			 * the user is forced to input.
			 */
			userInput = readConsoleString();
			/*
			 * like above it wants the user to write the level id witch he can play, but if he didnt play the previous level he cant play it.
			 * with back he ends the loop and goes back
			 */
			switch (userInput) {
				case "back":
					sure = false;
					break;
				case "1":
					Quests.levelOne();
					break;
				case "2":
					if (lvlDone >= 1) {
						Quests.levelTwo();
					}
					break;
				case "3":
					if (lvlDone >= 2) {
						Quests.levelTre();
					}
					break;
				case "4":
					if (lvlDone >= 3) {
						Quests.levelFor();
					}
					break;
				case "5":
					if (lvlDone >= 4) {
						Quests.boss();
					}
					break;
				default:
					System.out.println("");
					break;
			}
		}
		return;
	}
	/** Outputs certainty Words in different Languages depending on the Variable TextAdventure.lang
	 * it loops, but if user input is back it stops.
	 * the user can change variables here.
	 * @return goes back to the menu
	 */
	static void settings() {
		boolean sure = true;
		while (sure == true) {
			switch (TextAdventure.lang) {
				case "en":
					System.out.println("Welcome to the settings, what qould you like to change?");
					System.out.println("language 'lang', difficulty 'dif', 'cheats', 'back'");
					break;
				case "de":
					System.out.println("Wilkommen in den einstelungen, was möchten sie ändern?");
					System.out.println("sprache 'lang', schwirigkeit 'dif', betrügen 'cheats' 'back' zurück");
					break;
			}
			System.out.println("");
			userInput = readConsoleString();
			switch (userInput) {
			/*
			 * manipulates the variabel lang in the class TextAdventure
			 */
				case "lang":
						System.out.println("What language do you speak? ('de' or 'en')		Welche sprache sprechen sie? ('de' oder 'en')");
						userInput = readConsoleString();
						if (userInput.equals("en") || userInput.equals("")) {
							TextAdventure.lang = "en";
						} else if (userInput.equals("de")) {
							TextAdventure.lang = "de";
						} else {
							System.out.println("Nothing changed.      Nichts hat sich verändert.");
						}
					break;
				case "back":
					menu();
					break;
				case "dif":
					/*
					 * manipulates the variabel dificulty in the class TextAdventure
					 */
					switch (TextAdventure.lang) {
						case "en":
							System.out.println("What Dificulty do you want?");
							System.out.println("'1' is easy / '2' is hard");
							break;
						case "de":
							System.out.println("Welche schwirigkeit wollen sie?");
							System.out.println("'1' ist leicht / '2' ist schwierig");
							break;
					}
					userInput = readConsoleString();
					if (userInput.equals("1")) {
						TextAdventure.dificulty = 1;
					} else if (userInput.equals("2")) {
						TextAdventure.dificulty = 2;
					} else {
						System.out.println("Nothing changed.      Nichts hat sich verändert.");
					}
					break;
				case "cheats":
					/*
					 * here is a place holder for future settings
					 */
					switch (TextAdventure.lang) {
						case "en":
							System.out.println("press 1 to make variable lvlDone = 5. Press 2 to make your HP go up 100000, Press 3 makes your ATK go up 100000");
							break;
						case "de":
							System.out.println("Drücken Sie 1, um die Variable lvlDone = 5 zu machen. Drücken Sie 2, um Ihre HP um 100.000 zu erhöhen, Drücken Sie 3, um Ihre ATK um 100.000 zu erhöhen");
							break;
					}
					break;
				case "1":
					lvlDone = 5;
					break;
				case "2":
					TextAdventure.usrHp += 100000;
					break;
				case "3":
					TextAdventure.usrAtck += 100000;
					break;
				default:
					System.out.println("error");
					break;
			}
		}
		return;
	}
	/** Outputs certainty Words in different Languages depending on the Variable TextAdventure.lang
	 * All the stats will be shown to the user, some only when they are over 0.
	 * @return just goes back to the menu
	 */
	static void items() {
		System.out.println("HP       " + TextAdventure.usrHp);
		System.out.println("ATCK     " + TextAdventure.usrAtck);
		System.out.println("CHARISMA " + TextAdventure.usrCharisma);
		System.out.println("ARMOR    " + TextAdventure.usrResistenz);
		System.out.println("MONEY    " + TextAdventure.money);
		if (TextAdventure.key > 0) {
			System.out.println("Key      " + TextAdventure.key);
		}
		if (TextAdventure.usrPotion > 0) {
			System.out.println("POTION   " + TextAdventure.usrPotion);
		}
		return;
	}
	/** The application wants a correct response from the user for a termination of this application
	 *  @return goes back to the menu
	 */
	static void quit() {
		boolean sure = true;
		while (sure == true) {
			switch (TextAdventure.lang) {
				case "en":
					System.out.println("are you sure? (y or n)");
					break;
			case "de":
					System.out.println("sind sie sicher? (y oder n)");
					break;
			}
			userInput = readConsoleString();
			if (userInput.equals("n")) {
				sure = false;
				return;
			}
			if (userInput.equals("y")) {
				sure = false;
			} else {
				System.out.println("y / n !");
			}
		}
		System.out.println("bye");
		System.exit(0);
	}
	/**
	 * wants the user to write something and returns it
	 * @return userInput what the users wrote in the console
	 */
	static String readConsoleString() {
		String userInput = inputScanner.nextLine();
		return userInput;
	}
}
