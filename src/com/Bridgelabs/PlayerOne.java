package com.Bridgelabs;

public class PlayerOne {
	
	//creating constructor
	PlayerOne(){
		int start = 0;
		int playerPosition;
		playerPosition = start;
		
		//setting position of player one
		System.out.println("Player Ritesh at Position:" + playerPosition );
		System.out.println();
		
		
		
		//using while loop for reaching winning position
		while (playerPosition != 100) {
			
			//rolling dice and recording output with help of random
			int diceRoll = 1+(int)Math.floor(Math.random() *10)%6;
			System.out.println("Player Ritesh Rolls the dice: " + diceRoll);
			System.out.println();
			
			//check for option like snake,ladder and no play by help of random
			int checkOption= (int)Math.floor(Math.random() *10)% 3;
				if (checkOption == 0) {
					System.out.println("======== No play ========");
				}
				else if(checkOption == 1) {
					System.out.println("======== Ladder comes ========");
				
					// adding condition to reach winning position
					playerPosition = playerPosition + diceRoll;
					
						if(playerPosition >100) {
							playerPosition = playerPosition - diceRoll;
						}
						else if(playerPosition + diceRoll > 100) {
						
							continue;
						}
				}
				else {
					System.out.println("======== Snake comes ========");
					playerPosition = playerPosition - diceRoll;
						if (playerPosition  < 0) 
							playerPosition = 0;
						} 
						
						
		 }
		
		 System.out.println("Current Position of player Ritesh is: "+playerPosition);
	   }	
}

	
	