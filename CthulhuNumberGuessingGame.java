//Simple guessing game
//Author: Logan Richardson
//Version 1.0
//Date 8/18/2021

import java.util.Scanner;
import java.util.Random;

public class GuessMe {
	
	public static void  main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to Lord Cthulhu's GuessMe Game!\n");
		System.out.println("You shall be trapped here forever until you guess my number!");
		System.out.println("Mwahahahahahahaha! Tremble in fear puny mortal.");
		System.out.println("\nLo! I am a merciful ancient one.");
		System.out.println("I will allow you to pick the number range of our game.");
		System.out.println("I will also allow you to leave if you admit defeat by pressing 0.\n");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("Choose an upper limit of the numbers you will guess from? ");

		int upperBound = keyboard.nextInt();

		do {
			
			if (upperBound == 0) {
				System.out.println("\n\nYou foolishy chose: " + upperBound);
				System.out.print("Try again mortal, and don't pick 0 this time. ");
				upperBound = keyboard.nextInt();
			}
			else 
				break;
		}
		while(upperBound == 0);

		//random # in range 0 inclusive, upperBound exlcusive: [0-upperbound)
		int secretNumber = (int) Math.floor(Math.random() * upperBound);

		//prompt for and get guess
		System.out.println("\n\nNow you must guess! 1 to " + (upperBound - 1));
		System.out.print("Choose wisely, for your very soul depends on it! ");

		int guess = keyboard.nextInt();
	
		//compare guess to secret number, tell them if their guess is
		//too high or too low (to help guide them).
	
		//You might need to redo this as a while loop.
		do {
		
			if(guess == 0) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("\n\nYou have chosen defeat!");
				System.out.println("Mwahahahahaha!");
				System.out.println("I will allow you to leave this time, mortal!");
				System.out.println("Be gone!");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				break;
			}
			else if(guess < secretNumber) {
				System.out.println("\n\nYou fool! You chose too low.");
				System.out.print("Guess again! ");
				guess = keyboard.nextInt();		
			}
			else if(guess > secretNumber) {
				System.out.println("\n\nSilly mortal! Your arrogance betrays you. You chose too high.");
				System.out.print("Guess again! ");
				guess = keyboard.nextInt();
			}
	
		//report success if they get, encouragement if the quit (0)
	
		}
		while (guess != secretNumber);
		
		if (guess == secretNumber) {
			System.out.println("\n\nYou chose " + guess);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("The cosmos has smiled upon thee! You chose correct ... this time.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}


}
