//Team Skull: Rihui Zheng, Jake Zaia, Tim Wang
//APCS Pd5
//Final Project: Gotta Catch 'Em All

import cs1.Keyboard;
public class Woo {
    
    public static void main(String[] arr) {
	double oppHP = 0;
	double playHP = 0;
	Pokemon opponent = new Pikachu();
	Pokemon player = new Pikachu();
	System.out.println("A wild Pikachu appeared!\nGo Pikachu");
	int playerMove = 0;
	int opponentMove = 0;
	boolean validMove = false;
	boolean playerFainted = false;
	boolean opponentFainted = false;
	boolean battleOver = false;
	
	while (!battleOver) {
	    //displays HP
	    oppHP = opponent.getCurrHP() / opponent.getMaxHP();
	    playHP = player.getCurrHP() / player.getMaxHP();
	    System.out.println("\n\nOpponent's Pikachu\nHP: " + oppHP + "%");
	    System.out.println("\n\nPlayer's Pikachu\nHP: " + playHP + "%");
	    
	    //displays moves
	    System.out.println("\nWhat will Pikachu do?\nPlease enter the number corresponding to the move you want to use:\n1) " + player._move1 + "\t2) " + player._move2 + "\n3) " + player._move3 + "/t4) " + player._move4);

	    //keeps on asking the user to put in integer until they input a valid input
	    while (!validMove) {
		playerMove = Keyboard.readInt();
		if (playerMove >= 1 && playerMove <= 4) {
		    validMove = true;
		}
		else {
		    System.out.println("Please input an integer between 1-4 corresponding to the move you want to use:");
		}

	    }
	    

	    //if enemy is faster
	    if (opponent.getSpeed() > player.getSpeed()) {
		opponentMove = (int)(Math.random() * 5);		
		if (opponentMove == 1){
		    System.out.println("The foe's Pikachu used " + opponent._move1 + "!");
		    opponent.move1(player);
		}
		else if (opponentMove == 2){
		    System.out.println("The foe's Pikachu used " + opponent._move2 + "!");
		    opponent.move2(player);
		}
		else if (opponentMove == 3){
		    System.out.println("The foe's Pikachu used " + opponent._move3 + "!");
		    opponent.move3(player);
		}
		else {
		    System.out.println("The foe's Pikachu used " + opponent._move4 + "!");
		    opponent.move4(player);
		}

		//if player's Pokemon is still alive
		if (player.getCurrHP() > 0){
		    if (playerMove == 1){
			System.out.println("Pikachu used " + player._move1 + "!");
			player.move1(opponent);
		    }
		    else if (playerMove == 2){
			System.out.println("Pikachu used " + player._move2 + "!");
			player.move2(opponent);
		    }
      		    else if (playerMove == 3){
			System.out.println("Pikachu used " + player._move3 + "!");
			player.move3(opponent);
		    }
		    else if (playerMove == 4){
			System.out.println("Pikachu used " + player._move4 + "!");
			player.move4(opponent);
		    }
		}
		else{
		    playerFainted = true;
		}
	    }

	    //if player is faster or tied
	    if (opponent.getSpeed() <= player.getSpeed()) {
		if (playerMove == 1){
			System.out.println("Pikachu used " + player._move1 + "!");
			player.move1(opponent);
		    }
		    else if (playerMove == 2){
			System.out.println("Pikachu used " + player._move2 + "!");
			player.move2(opponent);
		    }
      		    else if (playerMove == 3){
			System.out.println("Pikachu used " + player._move3 + "!");
			player.move3(opponent);
		    }
		    else if (playerMove == 4){
			System.out.println("Pikachu used " + player._move4 + "!");
			player.move4(opponent);
		    }
		//if enemy is still alive
		if (opponent.getCurrHP() > 0) {
		    opponentMove = (int)(Math.random() * 5);		
		    if (opponentMove == 1){
			System.out.println("The foe's Pikachu used " + opponent._move1 + "!");
			opponent.move1(player);
		    }
		    else if (opponentMove == 2){
			System.out.println("The foe's Pikachu used " + opponent._move2 + "!");
			opponent.move2(player);
		    }
		    else if (opponentMove == 3){
			System.out.println("The foe's Pikachu used " + opponent._move3 + "!");
			opponent.move3(player);
		    }
		    else {
			System.out.println("The foe's Pikachu used " + opponent._move4 + "!");
			opponent.move4(player);
		    }
		}
		else
		    opponentFainted = true;
	    }
	    //see if anyone fainted
	    if (playerFainted || opponentFainted) 
		battleOver = true;
	}

    //who wins?
	if (playerFainted){
	    System.out.println("Pikachu fainted! You ran out of usable Pokemon! You lost $100,000! Oh Noooooooo!");
	}
	else{
	    System.out.println("The wild Pikachu fainted! You found $100,000! Boo Yea!");
	}
  
    }//end main
    
}//end class
