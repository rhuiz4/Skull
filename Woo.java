//Team Skull: Rihui Zheng, Jake Zaia, Tim Wang
//APCS Pd5
//Final Project: Gotta Catch 'Em All

public class Woo {
    
    public static void main(String[] arr) {
	//Openning Message
	/*	System.out.println("Hello! Sorry to keep you waiting!\n
                            Welcome to the World of Pokémon!\n
                            My name is Oak. People affectionately refer to me as the Pokémon Professor.\n
                            This world is inhabited far and wide by creatures called Pokémon!\n
                            For some people, Pokémon are pets. Other use them for battling.\n
                            As for myself… I study Pokémon as a profession. But first, tell me a little about yourself.\n
                            ");*/
	Pokemon opponent = new Pikachu();
	Pokemon player = new Pikachu();
	System.out.println("A wild Pikachu appeared!\nGo Pikachu");
	System.out.println("\n\nOpponent's Pikachu\nHP: " + "opponent.HP" + "%");

	System.out.println("\n\nPlayer's Pikachu\nHP: " + "player.HP" + "%");
	System.out.println("\nWhat will Pikachu do?\n" + player._move1 + "\t" + player._move2 + "\n" + player._move3 + "/t" + player._move4);
	

    }
}
