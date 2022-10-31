package ch.csbe.textadventure;

import java.util.ArrayList;
import java.util.Scanner;
/** 
 * The game class
 * Here are the levels of the game
 * @author (c) Dominic Streit
 */
public class Quests {
	
	static Scanner inputScanner = new Scanner(System.in); // Makes a new Input Scanner that Reads Console Input
	
	/*
	 * Logic Variables
	 */
	static String userInput = "nothing"; // is a container for the user input
	static boolean cheekUserInput; // this boolean is for loops so bad user input can be ignored
	
	/*
	 * this array is for all the monsters and bosses in the game.
	 * should not have more than 11 symbols!
	 */
	static String monsterList[] = {
			"Skeleton,10,3,1,0,1000", "Slime,20,2,2,0,100", "Thing,40,5,1,1,300", "(O--O),1,1,1,0,25",
			"Boss,1000,100,3,5,10000", "Final Boss,5000,150,1,10,100000", "EEEEEEEEEEEEEEEEEEEEEE,6666,6666,6666,6666,6666"
			};
	
	/**Outputs certainty Words in different Languages depending on the Variable TextAdventure.lang
	 * The first Level of the Quest. Here are a Series of Questions You have to Answer.
	 */
	public static void levelOne() {
		switch (TextAdventure.lang) {
			case "en":
				System.out.println("Welcome to your first level, you will get a bunch of questions now. you always have a to choose witch way you are going.");
				System.out.println("I mean you have to write 1 - 4 to select your option. most of the time the first sentence will be the current situation");
				System.out.println("and the second will be your choices. the choices may be separated with commas ','");
				System.out.println("Press enter to continue");
				break;
			case "de":
				System.out.println("Willkommen in Ihrem ersten Level, Sie werden jetzt eine Reihe von Fragen erhalten. Sie haben immer die Wahl, welchen Weg Sie gehen.");
				System.out.println("Ich meine, Sie müssen 1 - 4 schreiben, um Ihre Option auszuwählen. Meistens wird der erste Satz die aktuelle Situation sein");
				System.out.println("und der zweite wird ihre Wahl sein. die Auswahlmöglichkeiten können durch Kommas getrennt werden ','");
				System.out.println("drücke enter zum fortfahren");
				break;
		}
		readConsoleString();
		/*
		 * after the tutorial the first question starts
		 */
		cheekUserInput = true;
		while (cheekUserInput == true) {
			switch (TextAdventure.lang) {
				case "en":
					System.out.println("you are in a Normal living room, there are two doors.");
					System.out.println("one of them is shining Red, in the other door is a street visible");
					break;
				case "de":
					System.out.println("du Befindet sich in einem normalen Wohnzimmer, gibt es zwei Türen.");
					System.out.println("einer von ihnen leuchtet rot, in der anderen Tür ist eine Straße sichtbar");
					break;
			}
			System.out.println("");
			userInput = readConsoleString();
			if (cheek(userInput, 2, 1, 0, 0) == 1) {
				cheekUserInput = false;
			}
		}
		fight(3, 3);
		cheekUserInput = true;
		while (cheekUserInput == true) {
			switch (TextAdventure.lang) {
				case "en":
					System.out.println("you are in on a street, there seemes to be three ways. ");
					System.out.println("on the first way there are thorns, on the second way is very dark, the third way has a giant cumulonimbus.");
					break;
				case "de":
					System.out.println("Sie befinden sich auf einer Straße, es scheint drei Wege zu geben.");
					System.out.println("Auf dem ersten Weg gibt es Dornen, auf dem zweiten Weg ist es sehr dunkel, auf dem dritten Weg gibt es einen riesigen Cumulonimbus.");
					break;
			}
			System.out.println("");
			userInput = readConsoleString();
			if (cheek(userInput, 1, 2, 2, 0) == 1) {
				cheekUserInput = false;
			}
		}
		cheekUserInput = true;
		while (cheekUserInput == true) {
			switch (TextAdventure.lang) {
				case "en":
					System.out.println("you have shoes on, you are now somewhere unknown. you have 2 options");
					System.out.println("1 you will get a cute puppy, 2 you now have a black hole");
					break;
				case "de":
					System.out.println("Du hast Schuhe an, du bist jetzt an einem unbekannten Ort. du hast 2 möglichkeiten");
					System.out.println("1 bekommst du einen niedlichen Welpen, 2 hast du jetzt ein schwarzes Loch");
					break;
			}
			System.out.println("");
			userInput = readConsoleString();
			if (cheek(userInput, 1, 2, 0, 0) == 1) {
				cheekUserInput = false;
			}
		}
		switch (TextAdventure.lang) {
			case "en":
				System.out.println("Congrats on beating the first level. here is your reward.");
				System.out.println("");
				System.out.println("+ 1 Potion + 200 Money");
				break;
			case "de":
				System.out.println("Herzlichen Glückwunsch zum Überwinden des ersten Levels. Hier ist deine Belohnung.");
				System.out.println("");
				System.out.println("+ 1 Potion + 200 Money");
				break;
		}
		TextAdventure.money += 200;
		TextAdventure.usrPotion += 1;
		if (!(Menu.lvlDone >= 1)) {
			Menu.lvlDone += 1;
		}
		return;
	}
	/**Outputs certainty Words in different Languages depending on the Variable TextAdventure.lang
	 * The Second Level of the Quest. Here are a Series of Questions You have to Answer.
	 */
	public static void levelTwo() {
		cheekUserInput = true;
		while (cheekUserInput == true) {
			switch (TextAdventure.lang) {
				case "en":
					System.out.println("You are in a deep hole,there are four ways.");
					System.out.println("there are crocodiles on the floor, there is complete nothingness, it's just a normal way, there are red eyes looking at you");
					break;
				case "de":
					System.out.println("Du bist in einem tiefen Loch, es gibt vier Wege.");
					System.out.println("Da sind Krokodile auf dem Boden, da ist völliges Nichts, es ist nur ein normaler Weg, da sind rote Augen, die dich ansehen");
					break;
			}
			System.out.println("");
			userInput = readConsoleString();
			if (cheek(userInput, 2, 2, 1, 2) == 1) {
				cheekUserInput = false;
			}
		}
		fight(0, 2);
		/*
		 * just to use the mechanics of a key
		 */
		switch (TextAdventure.lang) {
			case "en":
				System.out.print("You have found a cheest. ");
				break;
			case "de":
				System.out.print("Du hast eine truhe gefunden. ");
				break;
		}
		if (TextAdventure.key >= 1) {
			switch (TextAdventure.lang) {
				case "en":
					System.out.println("you have found 5000 money but lost a key");
					break;
				case "de":
					System.out.println("du hast 5000 money gefunden aber einen schlüsel verlohren");
					break;
			}
			TextAdventure.key -= 1;
			TextAdventure.money += 5000;
		} else {
			switch (TextAdventure.lang) {
				case "en":
					System.out.println("but you didnt have a key");
					break;
				case "de":
					System.out.println("aber hast kein schlüsel");
					break;
			}
		}
		
		switch (TextAdventure.lang) {
		case "en":
			System.out.println("Congrats on beating the level. here is your reward.");
			System.out.println("");
			System.out.println("+ 500 Money");
			break;
		case "de":
			System.out.println("Herzlichen Glückwunsch zum Überwinden des Levels. Hier ist deine Belohnung.");
			System.out.println("");
			System.out.println("+ 500 Money");
			break;
	}
	TextAdventure.money += 500;
		if (!(Menu.lvlDone >= 2)) {
			Menu.lvlDone += 1;
		}
		return;
	}
	/**Outputs certainty Words in different Languages depending on the Variable TextAdventure.lang
	 * The Third Level of the Quest. Here are a Series of Questions You have to Answer.
	 */
	public static void levelTre() {
		cheekUserInput = true;
		while (cheekUserInput == true) {
			switch (TextAdventure.lang) {
				case "en":
					System.out.println("press 1");
					System.out.println("");
					break;
				case "de":
					System.out.println("drücke 1");
					System.out.println("");
					break;
			}
			System.out.println("");
			userInput = readConsoleString();
			if (cheek(userInput, 1, 0, 0, 0) == 1) {
				cheekUserInput = false;
			}
		}
		fight(2, 1);
		fight(1, 2);
		switch (TextAdventure.lang) {
		case "en":
			System.out.println("Congrats on beating the level. here is your reward.");
			System.out.println("");
			System.out.println("+ key + 5000 Money");
			break;
		case "de":
			System.out.println("Herzlichen Glückwunsch zum Überwinden des Levels. Hier ist deine Belohnung.");
			System.out.println("");
			System.out.println("+ key + 5000 Money");
			break;
	}
	TextAdventure.money += 5000;
	TextAdventure.key += 1;
		if (!(Menu.lvlDone >= 3)) {
			Menu.lvlDone += 1;
		}
		return;
	}
	/**Outputs certainty Words in different Languages depending on the Variable TextAdventure.lang
	 * The Fourth Level of the Quest. Here are a Series of Questions You have to Answer.
	 */
	public static void levelFor() {
		cheekUserInput = true;
		while (cheekUserInput == true) {
			switch (TextAdventure.lang) {
				case "en":
					System.out.println("press 1");
					System.out.println("");
					break;
				case "de":
					System.out.println("drücke 1");
					System.out.println("");
					break;
			}
			System.out.println("");
			userInput = readConsoleString();
			if (cheek(userInput, 1, 0, 0, 0) == 1) {
				cheekUserInput = false;
			}
		}
		fight(2, 5);
		switch (TextAdventure.lang) {
		case "en":
			System.out.println("Congrats on beating the level. here is your reward.");
			System.out.println("");
			System.out.println("+ 1 Potion + 1 key + 500 Money");
			System.out.println("you also recive a map which you can use in the next quest");
			break;
		case "de":
			System.out.println("Herzlichen Glückwunsch zum Überwinden des Levels. Hier ist deine Belohnung.");
			System.out.println("");
			System.out.println("+ 1 Potion + 1 key + 500 Money");
			System.out.println("Sie erhalten auch eine Karte, die Sie in der nächsten Quest verwenden können");
			break;
	}
	TextAdventure.money += 500;
	TextAdventure.key += 1;
	TextAdventure.usrPotion += 1;
		if (!(Menu.lvlDone >= 4)) {
			Menu.lvlDone += 1;
		}
		return;
	}
	/**Outputs certainty Words in different Languages depending on the Variable TextAdventure.lang
	 * The Last Level of the Quest. Here are a Series of Questions You have to Answer.
	 */
	public static void boss() {
		cheekUserInput = true;
		while (cheekUserInput == true) {
			switch (TextAdventure.lang) {
				case "en":
					System.out.println("you follow the map you have received, you are in a boat. there are is a kraken coming up");
					System.out.println("1 you fight, 2 you ignore, 3 pray to god");
					break;
				case "de":
					System.out.println("Sie folgen der Karte, die Sie erhalten haben, Sie befinden sich in einem Boot. Da kommt ein Kraken");
					System.out.println("1 du kämpfst, 2 du ignorierst, 3 betest zu Gott");
					break;
			}
			System.out.println("");
			userInput = readConsoleString();
			if (cheek(userInput, 1, 2, 2, 0) == 1) {
				cheekUserInput = false;
			}
		}
		fight(4, 1);
		switch (TextAdventure.lang) {
		case "en":
			System.out.println("Congrats on beating the level.");
			System.out.println("Is something following you ?");
			break;
		case "de":
			System.out.println("Herzlichen Glückwunsch zum Überwinden des Levels.");
			System.out.println("Folgt dir etwas?");
			break;
	}
	TextAdventure.money += 500;
	TextAdventure.key += 1;
		if (!(Menu.lvlDone >= 5)) {
			Menu.lvlDone += 1;
		}
		Menu.secret = 1;
		return;
	}
	/** Makes things easier to compare the right way.
	 * @param userInput is what the user inputed
	 * @param pathOneOk means if the variable is 1 the path is clear, but if its 2 its wrong and if its 3 the path does not exist.
	 * @param pathTwoOk means if the variable is 1 the path is clear, but if its 2 its wrong and if its 3 the path does not exist.
	 * @param pathTreOk means if the variable is 1 the path is clear, but if its 2 its wrong and if its 3 the path does not exist.
	 * @param pathForOk means if the variable is 1 the path is clear, but if its 2 its wrong and if its 3 the path does not exist.
	 * @return can return 1 or 2. 1 means the correct path, 2 means wrong input.
	 */
	static int cheek(String userInput, int pathOneOk, int pathTwoOk, int pathTreOk, int pathForOk) {
		switch (userInput) {
			case "1":
				if (pathOneOk == 1) {
					System.out.println("Brillant");
					return 1;
				} else if (pathOneOk == 2) {
					end();
				}
				break;
			case "2":
				if (pathTwoOk == 1) {
					System.out.println("Brillant");
					return 1;
				} else if (pathTwoOk == 2) {
					end();
				}
				break;
			case "3":
				if (pathTreOk == 1) {
					System.out.println("Brillant");
					return 1;
				} else if (pathTreOk == 2) {
					end();
				}
				break;
			case "4":
				if (pathForOk == 1) {
					System.out.println("Brillant");
					return 1;
				} else if (pathForOk == 2) {
					end();
				}
				break;
			case "back":
				System.out.println("\\_(O-O)_/");
				break;
		}
		return 2;
	}
	/**Outputs certainty Words in different Languages depending on the Variable TextAdventure.lang
	 * Here is a turn Based Fight, first you start. then the monsters attack the User or heal itself
	 * @param whatIsIt is the id of the monster
	 * @param howMany how many monsters should come
	 * @return nothing
	 */
	static int fight(int whatIsIt, int howMany) {
		ArrayList<String> monsters = new ArrayList<String>();
		for (int i = 0; i <= howMany - 1; i++) {
			monsters.add(monsterList[whatIsIt]);
		}
		boolean fightOn = true;
		while (fightOn == true) {
			System.out.println();
			switch (TextAdventure.lang) {
				case "en":
					System.out.println(" NAME:       | HP:         | ATCK:       | RESISTENZ:  | POTION:     | INERSTRENGHT:");
					break;
				case "de":
					System.out.println(" NAME:       | HP:         | ATCK:       | RESISTENZ:  | POTION:     | INERESTAERCKE:");
					break;
			}
			for (int i = 0; i <= (monsters.size() - 1); i++) {
				String stats[] = monsters.get(i).split(",");
				System.out.printf(" %11.11s | %11.11s | %11.11s | %11.11s | %11.11s | %11.11s ", stats[0], stats[1], stats[2], stats[3], stats[4], stats[5]);
				System.out.println("");
			}
			int againstWho = 0;
			boolean userChoses = true;
			while (userChoses == true) {
				switch (TextAdventure.lang) {
					case "en":
						System.out.println("what do you want to do?");
						System.out.println("'fight', 'mercy' or use 'items'");
						break;
					case "de":
						System.out.println("was möchtest du machen?");
						System.out.println("Kämpfen 'fight', Ein Kompliment geben 'mercy' oder ein item benutzen 'items'");
						break;
				}
				userInput = readConsoleString();
				switch (userInput) {
					case "fight":
						/*
						 * it takes the the current monster and takes the values resistenz and HP. the resistenz will get divided by the usrAtck which
						 * will be the damage. the damage will the be subtracted from the enemyHp.
						 */
						int resistenz = 1; // this is a Container for a number that will divide
						int enemyHp = 0; // this is a container for a number 
						String prepareOne = monsters.get(againstWho); // is the String located in the list
						String statsOne[] = prepareOne.split(","); // the string has comma separated stats
						resistenz = Integer.parseInt(statsOne[3]);
						enemyHp = Integer.parseInt(statsOne[1]);
						int Damage = TextAdventure.usrAtck / resistenz;
						int result = enemyHp - Damage;
						if (result <= 0) {
							monsters.remove(againstWho);
						} else {
							/*
							 * puts the values back together and replaces it in the list
							 */
							statsOne[1] = ("" + result);
							String replace = "";
							for (int i = 0; i <= (statsOne.length - 1); i++) {
								replace += "" +statsOne[i];
								replace += ",";
							}
							monsters.set(againstWho, replace);
						}
						userChoses = false;
						break;
					case "mercy":
						/*
						 * it takes the the current monster and takes the values INERSTRENGHT.
						 */
						int enemyInerStrenght = 0; // this is a container for a nummber 
						String prepareTwo = monsters.get(againstWho); // is the String located in the list
						String statsTwo[] = prepareTwo.split(","); // the string has comma separated stats
						enemyInerStrenght = Integer.parseInt(statsTwo[5]);
						int inrresult = enemyInerStrenght - TextAdventure.usrCharisma;
						if (inrresult <= 0) {
							monsters.remove(againstWho);
						} else {
							/*
							 * puts the values back together and replaces it in the list
							 */
							statsTwo[5] = ("" + inrresult);
							String replace = "";
							for (int i = 0; i <= (statsTwo.length - 1); i++) {
								replace += "" +statsTwo[i];
								replace += ",";
							}
							monsters.set(againstWho, replace);
						}
						userChoses = false;
						break;
					case "items":
						System.out.println();
						Menu.items();
						System.out.println();
						switch (TextAdventure.lang) {
							case "en":
								System.out.println("what do you want to use?");
								System.out.println("'potion' ");
								break;
							case "de":
								System.out.println("was möchtest du benutzen?");
								System.out.println("'potion' oder zurückgehen 'back'");
								break;
						}
						userInput = readConsoleString();
						switch (userInput) {
							case "potion":
								if (TextAdventure.usrPotion >= 1) {
									TextAdventure.usrPotion -= 1;
									TextAdventure.usrHp += 50;
									userChoses = false;
								} else {
									switch (TextAdventure.lang) {
										case "en":
											System.out.println("you dont have that");
											break;
										case "de":
											System.out.println("du hast das nicht");
											break;
									}
								}
								break;
							default:
								System.out.println("error");
								break;
						}
						break;
					default:
						System.out.println("error ('fight', 'mercy', 'items') !");
						break;
				}
			}
			if (monsters.size() == 0) {
				fightOn = false;
			}
			/*
			 * now its the monsters turn. each monster can either attack or heal itself
			 */
			for (int i = 0; i <= (monsters.size() - 1); i++) {
				String prepareOne = monsters.get(i); // is the String located in the list
				String stats[] = prepareOne.split(","); // splits the string to seperate all values
				if (Integer.parseInt(stats[1]) <= 10 && Integer.parseInt(stats[4]) >= 1) {
					stats[1] = ("" + (Integer.parseInt(stats[1]) + 50));
					stats[4] = ("" + (Integer.parseInt(stats[4]) - 1));
					String replace = "";
					/*
					 * puts the values back together and replaces it in the list
					 */
					for (int x = 0; x <= (stats.length - 1); x++) {
						replace += "" +stats[x];
						replace += ",";
					}
					monsters.set(i, replace);
					switch (TextAdventure.lang) {
						case "en":
							System.out.println("+ 50 HP by " + stats[0]);
							break;
						case "de":
							System.out.println(stats[0] + " Heilt 50 HP");
							break;
					}
				} else {
					TextAdventure.usrHp -= (Integer.parseInt(stats[2]) / TextAdventure.usrResistenz) * TextAdventure.dificulty;
					switch (TextAdventure.lang) {
						case "en":
							System.out.println("You got " + (Integer.parseInt(stats[2]) / TextAdventure.usrResistenz) + " Damage by " + stats[0]);
							break;
						case "de":
							System.out.println("Du bekammst " + (Integer.parseInt(stats[2]) / TextAdventure.usrResistenz) + " Schaden von " + stats[0]);
							break;
					}
				}
			}
			if (TextAdventure.usrHp <= 0) {
				end();
			}
		}
		return 0;
	}
	
	/**
	 * wants the user to write something and returns it
	 * @return userInput what the users wrote in the console
	 */
	static String readConsoleString() {
		String userInput = inputScanner.nextLine();
		return userInput;
	}
	/**
	 * Terminates the Program
	 */
	static void end() {
		switch (TextAdventure.lang) {
			case "de":
				System.out.println("Du Bist gestorben");
				break;
			case "en":
				System.out.println("You Died");
				break;
		}
		System.out.println();
		System.exit(0);
	}
}
