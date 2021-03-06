public class Aerodactyl extends Pokemon{

    public Aerodactyl(){
	_name = "Aerodactyl";
	_hp = (int)(Math.random() *48 + 140);
	_atk = (int)(Math.random() *74 + 99);
	_def = (int)(Math.random() *66 + 63);
	_spatk = (int)(Math.random() *66 + 58);
	_spdef = (int)(Math.random() *68 + 72);
	_speed = (int)(Math.random() *80 + 121);
	_currhp = _hp;
	_type1 = "Rock";
	_type2 = "Flying";
	_move1 = new Move("Ice Fang", "Ice", 65, .95, true, true, false);
	_move2 = new Move("Crunch", "Dark", 80, 1, true, true, false);
	_move3 = new Move("Stone Edge", "Dragon", 100, .8, true, false, false);
	_move4 = new Move("Earthquake", "Ground", 100, 1, true, false, false);
    }

    public String toString(){
	return "\u001B[35m@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[35m@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[35m@@@@@@@@@@@@@@@.@@@@@@@@@@@@@@@@@@@@@@@@?.@,@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[35m@@@@,:.++%@@@*:+*+@,@@@@@@@@@@@@@@@@@@S++++.?%...%%%S:*+@@@@\u001B[0m \n \u001B[35m@@@@@+,+%++@@.+.+++++:.++.@@@@@@@@@@@@@@:.SSS..++.+++..?:@@@\u001B[0m \n \u001B[35m@@@,SS+.+S?.@@@@%%#+++++.@@@@@@@@@@@@@@*SS++++++..+:@@@@@@@@\u001B[0m \n \u001B[35m@SS++.++...+.@@@@%%?%+++%@@@@@@@@@@@@@:S+++++++.+@@@@@@@@@@@\u001B[0m \n \u001B[35m+@@@@@@@@@.+.%S@@*+++++.*@@@@@@@@@@@@+?+++++++.@@@@@@@@@@@@@\u001B[0m \n \u001B[35m+@@@@@@@@@@..%S@*%+++++.*@@@@@@@@@@@@+?++++++.@@@@@@@@@@@@@@\u001B[0m \n \u001B[35m@@@@@@@@@@@@++#..****.+.:@@S@@@@@@@S**..+...@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[35m@@@@@@@@@@@@@@S***%:@@::::.+%@@@:+.SSSSSSSS%@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[35m@@@@@@@@@@@@S.....*@@S+:****:*:%S...%@@@@@@@@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[35m@@@@@@@@@@@@@@@@@@@@@%*:**:*::...*@@@@@@@@@@@@@@@,..:+*::@@@\u001B[0m \n \u001B[35m@@@@@@@@@@@@@@@@@@@@@S:::*::*****@@@@@@@@@@@@@@..+*@+%@@@@@@\u001B[0m \n \u001B[35m@@@@@@@@@@@@@@@@@@@@@+*****:::**S?@@@@@@@@@@@+..@@@@@@@@@@@@\u001B[0m \n \u001B[35m@@@@@@@@@@@@@@@@@@@@@+*****:::**S?@@@@@@@@@S++.@@@@@@@@@@@@@\u001B[0m \n \u001B[35m@@@@@@@@@@@@@@@@@@@@@+..******.SS+?SSSSSS++.@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[35m@@@@@@@@@@@@@@@@@@@@@..+.SSSSSS+..+SSSSS%@@@@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[35m@@@@@@@@@@@@@@@@@@@@@@..S@@@@@@+..+.@@@@@@@@@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[35m@@@@@@@@@@@@@@@@@@@@@@@S..@@@@@@@+SS:@@@@@@@@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[35m@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@?S@.@@@@@@@@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[35m@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\u001B[0m \n \u001B[35m@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\u001B[0m ";

    }
}
