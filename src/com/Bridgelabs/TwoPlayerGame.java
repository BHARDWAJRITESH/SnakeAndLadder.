package com.Bridgelabs;

public class TwoPlayerGame {
	
	TwoPlayerGame(){
		 while (true) {
				if (playerRitesh == winningPosition || playerYash == winningPosition) {
					break;
				}
				playgame();
			}
	 }

	  	static int playerRitesh = 0, playerYash = 0, winningPosition = 10, condition = 0, diceRollCount = 0;
	
	  	
	  		static int checkOption = (int) (Math.floor(Math.random() * 10 % 6 + 1));
	  	    static int options = (int) (Math.floor(Math.random() * 10 % 3));

	 static void playgame() {
		
		 
		if (condition == 0) {
			diceRollCount++;
			int diceRoll = checkOption;
			System.out.println("Dice roll value: " + diceRoll);
			int checkOption = options;
			switch (checkOption) {
			case 0:
				System.out.println("********No play*******");
				condition = 1;
				break;
			case 1:
				System.out.println("*******Ladder come******");
				playerRitesh = playerRitesh + diceRoll;
				if (playerRitesh > winningPosition)
					playerRitesh = playerRitesh - diceRoll;
				System.out.println("Player Ritesh is at position: " + playerRitesh);
				break;
			case 2:
				System.out.println("Snake");
				playerRitesh = playerRitesh - diceRoll;
				if (playerRitesh < 0)
					playerRitesh = 0;
				System.out.println("Player Ritesh is at position: " + playerRitesh);
				condition = 1;
				break;
			}
			if (playerRitesh == winningPosition) {
				System.out.println("Player Ritesh is winner");
			}
		} else {
			diceRollCount++;
			int diceRoll = checkOption;
			System.out.println("Dice roll value: " + diceRoll);
			int checkOption = options;
			switch (checkOption) {
			case 0:
				System.out.println("*********No play********");
				condition = 0;
				break;
			case 1:
				System.out.println("********Ladder come*******");
				playerYash = playerYash + diceRoll;
				if (playerYash > winningPosition)
					playerYash = playerYash - diceRoll;
				System.out.println("Player Yash is at position: " + playerYash);
				break;
			case 2:
				System.out.println("*********Snake come*********");
				playerYash = playerYash - diceRoll;
				if (playerYash < 0)
					playerYash = 0;
				System.out.println("Player Yash is at position: " + playerYash);
				condition = 0;
				break;
			}
			if (playerYash == winningPosition) {
				System.out.println("Player Yash is winner");
			}
		}
	 }
	
}


