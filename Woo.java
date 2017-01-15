//Team Skull: Rihui Zheng, Jake Zaia, Tim Wang
//APCS Pd5
//Final Project: Gotta Catch 'Em All

import cs1.Keyboard;
public class Woo {
    
    public static void main(String[] arr) {
	String line = "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=";
	String pname = "";
	boolean exit = false;

	System.out.println(line + "\n\n\n");
	System.out.println("                                .::.                                 ");	
	System.out.println("                              .;:**                                  ");
	System.out.println("                              `                                      ");
	System.out.println("  .:XHHHHk.              db.   .;;.     dH  MX                       ");
	System.out.println("oMMMMMMMMMMM       ~MM  dMMP :MMMMMR   MMM  MR      ~MRMN            ");
	System.out.println("QMMMMMb   MMX       MMMMMMP !MX^ :M~   MMM MMM  .oo. XMMM  MMM       ");
	System.out.println("  `MMMM.  )M> :X!Hk. MMMM   XMM.o^  .  MMMMMMM X?XMMM MMM>!MMP       ");
	System.out.println("   ^MMMb.dM! XM M^?M MMMMMX.`MMMMMMMM~ MM MMM XM `^ MX MMXXMM        ");
	System.out.println("    ~MMMMM~ XMM. .XM XM`^MMMb.~*?**~ .MMX V t MMbooMM XMMMMMP        ");
	System.out.println("     ?MMM>  YMMMMMM! MM   `?MMRb.    `MMM   !L;MMMMM XM IMMM         ");
	System.out.println("      MMMX   ^MMMM^  MM       ~%:           !Mh.    dMI IMMP         ");
	System.out.println("      ^MMM.                                             IMX          ");
	System.out.println("       ~M!M                                             IMP          ");
	System.out.println("\n\n\nA game by Jake Zaia, Rihui Zheng, and Tim Wang. Enjoy.\n\n" + line + "\n\n");

        

	System.out.println("Welcome, young trainer. Welcome to the World of Pokemon. May I ask you your name?");
	try {
	    pname = Keyboard.readString();
	}
	catch ( Exception e ) {}

	System.out.println(line);

	while (!exit) {
	    System.out.println("Hello again, " + pname + ". What would you like to do? \n 1.Battle\n 2.Exit\nPlease enter the number corresponding to your choice:");
	    int mode = 0;
	    int pmode = 0;
		
	    while (mode == 0){
		pmode = Keyboard.readInt();
		if (pmode == 1)
		    mode = 1;
		else if (pmode == 2)
		    mode = 2;
		else
		    System.out.println("Input Invalid. Please enter the number corresponding to what you want to do above:");
	    }

	    if (mode == 1) {
		Pokemon opponent = new Pikachu();
		Pokemon player = new Pikachu();
		int oppHP = 0;
		int playHP = 0;
		int playerMove = 0;
		int opponentMove = 0;
		boolean validMove = false;
		boolean playerFainted = false;
		boolean opponentFainted = false;
		boolean battleOver = false;
		System.out.println("A wild Pikachu appeared!\nGo Pikachu");
		while (!battleOver) {
		    //displays HP
		    oppHP = (int)((double)opponent.getCurrHP() / opponent.getMaxHP() * 100);
		    playHP =(int)((double) player.getCurrHP() / player.getMaxHP() * 100);
		    System.out.println("\n\nOpponent's Pikachu\nHP: " + oppHP + "%");
		    System.out.println(opponent + "\n\n");
		    System.out.println(player);
		    System.out.println("\n\nPlayer's Pikachu\nHP: " + playHP + "%");
	    
		    //displays moves
		    System.out.println("\nWhat will Pikachu do?\nPlease enter the number corresponding to the move you want to use:\n1) " + player._move1 + "\t2) " + player._move2 + "\n3) " + player._move3 + "\t4) " + player._move4);

		    //keeps on asking the user to put in integer until they input a valid input
		    validMove = false;
		    while (!validMove) {
			playerMove = Keyboard.readInt();
		
			if (playerMove >= 1 && playerMove <= 4) {
			    validMove = true;
			}
			else {
			    System.out.println("Please input an integer between 1-4 corresponding to the move you want to use:");
			}

		    }

		    System.out.println(line);
	    

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
			if (opponent.getCurrHP() <= 0)
			    opponentFainted = true;
		
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
			if (player.getCurrHP() <= 0)
			    playerFainted = true;
		    }
		    //see if anyone fainted
		    if (playerFainted || opponentFainted) 
			battleOver = true;
		}

		//who wins?
		if (playerFainted){
		    System.out.println("Pikachu fainted! You ran out of usable Pokemon! You lost $100,000! Oh Noooooooo!\n\n\n");
		}
		else{
		    System.out.println("The wild Pikachu fainted! You found $100,000! Boo Yea!\n\n\n");
		}
	    }//end mode 1

	    if (mode == 2) {
		System.out.println("Have a nice day, " + pname + ".");
		exit = true;
	    }
	}//end exit loop
	
    }//end main
    
}//end class
