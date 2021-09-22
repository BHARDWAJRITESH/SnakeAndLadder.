package com.Bridgelabs;

public class PlayerOne {
	
	//creating constructor
	PlayerOne(){
		int start = 0;
		int playerPosition;
		playerPosition = start;
		
		//setting position of player one
		System.out.println("== Player Ritesh at Position:" + playerPosition +" ==");
		
		//rolling dice and recording output with help of random
		int diceRoll = 1+(int)Math.floor(Math.random() *10)%6;
		System.out.println("Player Ritesh Rolls the dice: " + diceRoll);
		
	}
}
