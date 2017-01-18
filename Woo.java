//Team Skull: Rihui Zheng, Jake Zaia, Tim Wang
//APCS Pd5
//Final Project: Gotta Catch 'Em All

import cs1.Keyboard;
import java.util.ArrayList;
public class Woo {

    private String line = "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=";
    private String pname = "";
    public Woo(){
	
    }

    public void newgame(){

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

        

	System.out.println("Hello there, young trainer. Welcome to the World of Pokemon. May I ask you your name?");
	while (pname == ""){
	    try {
		pname = Keyboard.readString();
	    }
	    catch ( Exception e ) {
		System.out.println("C'mon...You know you have a name...");
	    }
	}
	
	System.out.println(line);
    }

	   
		
    public void playgame(){

	int numAlive = 6;
	int oppHP = 0;
	int playHP = 0;
	int playerMove = 0;
	int opponentMove = 0;
	int kills = 0;
	boolean validMove = false;
	boolean playerFainted = false;
	boolean opponentFainted = false;
	ArrayList<Pokemon> yourPokemon = new ArrayList<Pokemon>();
	
		
	//user chooses their own Pokemen
	System.out.println(line);
	System.out.println("So you want to battle. Lets see, which of these 3 Pokemons do you want to be your partners?\n");
	for (int x = 1; x < 7; x++){
	    Pokemon saved;

	    String msg = "";
	    msg += "Choice " + x + "\n";
	    msg += "1) Pikachu\n";
	    msg += "2) Venusaur\n";
	    msg += "3) Charizard\n";
	    msg += "4) Blastoise\n";
	    msg += "5) Random\n";
	    msg += "Enter you choice (as a number):";
	    System.out.println(msg);

	    int pChoice = 0;
	    while (pChoice == 0) {
		pChoice = Keyboard.readInt();
		if (pChoice == 5){
		    pChoice = (int) (Math.random() * 4 + 1);
		}
		if (pChoice == 1){
		    saved = new Pikachu();
		    yourPokemon.add(saved);
		}
		else if (pChoice == 2){
		    saved = new Venusaur();
		    yourPokemon.add(saved);
		}
		else if (pChoice == 3){
		    saved = new Charizard();
		    yourPokemon.add(saved);
		}
		else if (pChoice == 4){
		    saved = new Blastoise();
		    yourPokemon.add(saved);
		}
		else {
		    System.out.println("Invalid Choice. Please select from the list above:");
		    pChoice = 0;
		}
	    
	    }
	    System.out.println("You chose " + yourPokemon.get(x-1).getName() + "!");
	}
    
	System.out.println(line);

	int Counter = 0;
	Pokemon player = yourPokemon.get(0);
	String playName = player.getName();
	System.out.println("Go " + playName);
	Pokemon opponent = new Pokemon();
	int oChoice = (int) (Math.random() * 4 + 1);
	if (oChoice == 1)
	    opponent = new Pikachu();
	else if (oChoice == 2)
	    opponent = new Venusaur();
	else if (oChoice == 3)
	    opponent = new Charizard();
	else if (oChoice == 4)
	    opponent = new Blastoise();
	
	String oppName = opponent.getName();
	
	
	System.out.println("A wild " + oppName + " appeared!\n" );
	while (numAlive != 0){
		//displays HP
		oppHP = (int)((double)opponent.getCurrHP() / opponent.getMaxHP() * 100);
		playHP =(int)((double) player.getCurrHP() / player.getMaxHP() * 100);
		System.out.println(line + "\n" + "Opponent's " + oppName + " HP: " + oppHP + "%\n" + line);
		System.out.println(opponent);
		
		System.out.println("\n" + line + "\n" + pname + "'s " + playName + " HP: " + playHP + "%\n" + line);
		
		//displays moves
		System.out.println("\nWhat will " + playName + " do?\nPlease enter the number corresponding to the move you want to use:\n1) " + player._move1 + "\t2) " + player._move2 + "\t3) " + player._move3 + "\t4) " + player._move4);
		
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
		
		System.out.println(line + "\n\n\n\n\n" + line);
		
		
		//if enemy is faster
		if (opponent.getSpeed() > player.getSpeed()) {
		    opponentMove = (int)(Math.random() * 5);		
		    if (opponentMove == 1){
			System.out.println("The foe's " + oppName + " used " + opponent._move1 + "!");
			opponent.move1(player);
		    }
		    else if (opponentMove == 2){
			System.out.println("The foe's " + oppName + " used " + opponent._move2 + "!");
			opponent.move2(player);
		    }
		    else if (opponentMove == 3){
			System.out.println("The foe's " + oppName + " used " + opponent._move3 + "!");
			opponent.move3(player);
		    }
		    else {
			System.out.println("The foe's " + oppName + " used " + opponent._move4 + "!");
			opponent.move4(player);
		    }
		    
		    //if player's Pokemon is still alive
		    if (player.getCurrHP() > 0){
			if (playerMove == 1){
			    System.out.println(playName + " used " + player._move1 + "!");
			    player.move1(opponent);
			}
			else if (playerMove == 2){
			    System.out.println(playName + " used " + player._move2 + "!");
			    player.move2(opponent);
			}
			else if (playerMove == 3){
			    System.out.println(playName + " used " + player._move3 + "!");
			    player.move3(opponent);
			}
			else if (playerMove == 4){
			    System.out.println(playName + " used " + player._move4 + "!");
			    player.move4(opponent);
			}
		    }
		    else{
			playerFainted = true;
			numAlive--;
			Counter++;
		    }
		    if (opponent.getCurrHP() <= 0)
			opponentFainted = true;
		    
		}
		
		//if player is faster or tied
		if (opponent.getSpeed() <= player.getSpeed()) {
		    if (playerMove == 1){
			System.out.println(playName + " used " + player._move1 + "!");
		    player.move1(opponent);
		    }
		    else if (playerMove == 2){
			System.out.println(playName + " used " + player._move2 + "!");
			player.move2(opponent);
		    }
		    else if (playerMove == 3){
			System.out.println(playName + " used " + player._move3 + "!");
			player.move3(opponent);
		}
		    else if (playerMove == 4){
			System.out.println(playName + " used " + player._move4 + "!");
			player.move4(opponent);
		    }
		    //if enemy is still alive
		    if (opponent.getCurrHP() > 0) {
			opponentMove = (int)(Math.random() * 5);		
			if (opponentMove == 1){
			    System.out.println("The foe's " + oppName + " used " + opponent._move1 + "!");
			    opponent.move1(player);
			}
			else if (opponentMove == 2){
			    System.out.println("The foe's " + oppName + " used " + opponent._move2 + "!");
			    opponent.move2(player);
			}
			else if (opponentMove == 3){
			    System.out.println("The foe's " + oppName + " used " + opponent._move3 + "!");
			    opponent.move3(player);
			}
			else {
			    System.out.println("The foe's " + oppName + " used " + opponent._move4 + "!");
			    opponent.move4(player);
			}
		}
		    else
			opponentFainted = true;
		    if (player.getCurrHP() <= 0){
			playerFainted = true;
			numAlive--;
			Counter++;
		    }
		}
		//System.out.println(line);
	        if (playerFainted == true && Counter < 6){
		    System.out.println("You just lost your " + playName + "! But don't worry because you have more pokemons at hand!");
		    player = yourPokemon.get(Counter);
		    playName = player.getName();
		    System.out.println("Go " + playName);
		    playerFainted = false;
		    System.out.println("You have " + numAlive + " Pokemon remaining.");
		}
		if (opponentFainted == true){
		    System.out.println("You killed the wild " + oppName + "!");
		    kills++;
		    opponent = new Pokemon();
		    oChoice = (int) (Math.random() * 4 + 1);
		    if (oChoice == 1)
			opponent = new Pikachu();
		    else if (oChoice == 2)
			opponent = new Venusaur();
		    else if (oChoice == 3)
			opponent = new Charizard();
		    else if (oChoice == 4)
			opponent = new Blastoise();
		    
		    oppName = opponent.getName();
		    opponentFainted = false;
		    System.out.println("A wild " + oppName + " appeared!\n" );
		}
	}
		
	    //who wins?
	System.out.println("Game Over. You have killed a total of " + kills + " Pokemon.");
    
    }//end playgame()
    

    public String getpName(){
	return pname;
    }
	    
    public static void main(String[] arr) {
	boolean exit = false;
	Woo game = new Woo();
	game.newgame();
	while (exit == false){
	    
	    System.out.println("\n\nHello again, " + game.getpName() + ". What would you like to do? \n 1.Battle\n 2.Exit\nPlease enter the number corresponding to your choice:");
	    int mode = 0;
		
	    while (mode == 0){
		try{
		    mode = Keyboard.readInt();
		}
		catch( Exception e){
		    System.out.println("Input Invalid. Please enter the number corresponding to what you want to do above:");
		}
	    }

	    if (mode == 1){
		game.playgame();
	    }

	    if (mode == 2) {
		System.out.println("Have a nice day, " + game.getpName() + ".");
		exit = true;
	    }
	}//end exit loop
	
    }//end main
    
}//end class
