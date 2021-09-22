package com.Bridgelabs;


public class SnakeAndLadder extends TwoPlayerGame {
		
	public static void main(String[] args) {
		 
		
		//welcome message
		System.out.println("**Welcome to the snake and ladder programs**");
		System.out.println("************************************************");
		System.out.println("=======Game Start=======");
		
		//playerOne started the game
		 new PlayerOne();      				//calling constructor of PlayerOne class
		 
		 System.out.println("Welcome to Snake and Ladder Game");
			while (true) {
				if (playerRitesh == winningPosition || playerYash == winningPosition) {
					break;
				}
				playgame();
			}
			System.out.println("Number of time dice has rolled is: " + diceRollCount);
	}
}
