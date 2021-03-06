
public class Scyther extends Pokemon{
    
    public Scyther(){
	_name = "Scyther";
	_hp = (int)(Math.random() *48 + 130);
	_atk = (int)(Math.random() *76 + 103);
	_def = (int)(Math.random() *70 + 76);
	_spatk = (int)(Math.random() *64 + 54);
	_spdef = (int)(Math.random() *70 + 76);
	_speed = (int)(Math.random() *74 + 99);
	_currhp = _hp;
	_type1 = "Bug";
	_type2 = "Flying";
	_move1 = new Move("Thief", "Dark", 90, 1, true, true, false);
	_move2 = new Move("Aerial Ace", "Flying", 90, 1, true, true, false);
	_move3 = new Move("X-Scissors", "Bug", 80, 1, true, true, false);
	_move4 = new Move("Brick Break", "Fighting", 75, 1, true, true, false);
    }

    public String toString(){
	return "\u001B[32m @@@@@@@@@@@@....S@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[32m@@@@@@@@@@@@@@@.*.:S+S@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[32m@@@@@@@@@@@@@@@@@S::,::+.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[32m@@@@@@@@@@@@@@@@@@.::.**..:@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[32m@@@@@@@@@@@@@@@@@@@***.**.@@@@@@%..@@@@@@@@@@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[32m@@@@@@@@@@@@@@@@@@::****..S@@@@@S.+:@@@@@@@@@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[32m@@@@@@@@@@@@@@@@@@@@@@@+*:.,+@@@+.+,@@@@@@@@@@@@@,,,,,,,@@@@\u001B[0m \n \u001B[32m@@@@@@@@@@@@@@@@@@@@@@@@..+.*.::**+.@@@@@@@@@@@,,....,,%@@@@\u001B[0m \n \u001B[32m@@@@@@@@@@@@@@@@@@@@@@@@@@+.. S*.**.++.@@@@@S+%,,,,,,,*@@@@@\u001B[0m \n \u001B[32m@@@@@@@@@@@@@@@@@@@@@@@@@,*...+*.**++%@@S++,,,:::::S@@@@@@@@\u001B[0m \n \u001B[32m@@@@@@@@@@@@@@@@@@@@@@@@@?S:*+.+S?*.S::*,::::::,,,,.@@@@@@@@\u001B[0m \n \u001B[32m@@@@@@@@@@@@@@@@@@@@@@@@@@:S,**:**.+%:::::,,,,,,.,%@@@@@@@@@\u001B[0m \n \u001B[32m@@@@@@@@@@@@@@@@@:@@@@@@@@..*.*...%++,,,,,,.,S@@@@@@@@@@@@@@\u001B[0m \n \u001B[32m@@@@@@@@@@@@@@@@@**@@@@@@@@..+%++,:*:::.@@@@@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[32m@@@@@@@@@@@@@@@@:..**S:@**+:.*%+++,*+::,,*S@@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[32m@@@@@@@@@@@@@@@@%.*.**.%....S.++%*@.,:@@@.:..*%@@@@@@@@@@@@@\u001B[0m \n \u001B[32m@@@@@@@@@@@@@@@@%.**.**.*.**.++.++SS,,@@@@:S,***:,*@@@@@@@@@\u001B[0m \n \u001B[32m@@@@@@@@@@@@@@@@@.+++.+?.*.****.SSSSS.@@@.:,,,,%:,,,*,@@@@@@\u001B[0m \n \u001B[32m@@@@@@@@@@@@@@S:,,%@@@.+S.++...SSSSS+.%@@@@@@@@,,,%,,,S*@@@@\u001B[0m \n \u001B[32m@@@@@@@@@@@@.:+..+@@@@@.+++%@@@@@@@@..+S?@@@@@@@,,,&,,,+%@@@\u001B[0m \n \u001B[32m@@@@@@@@@@**.*.++@@@@@@@@@@@@@@@@@@@@%SSSSS@@@@@,,,:*,@@@@@@\u001B[0m \n \u001B[32m@@@@@++*****.+++S@@@@@@@@@@@@@@@@@@@@@%+++SSS@@,@.%.@@@@@@@@\u001B[0m \n \u001B[32m@@@.*++%..++++++*@@@@@@@@@@@@@@@@@@@@@@:.*.SS+,,?.@@@@@@@@@@\u001B[0m";



    }
}
	
