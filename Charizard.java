public class Charizard extends Pokemon{
    
    public Charizard(){
	_hp = (int)(Math.random() *48 + 138);
	_spdef = (int)(Math.random() *70 + 81);
	_spatk = (int)(Math.random() *76 + 102);
	_speed = (int)(Math.random() *70 + 81);
	_atk = (int)(Math.random() *70 + 80);
	_def = (int)(Math.random() *70 + 74);
	_currhp = _hp;
	_type1 = "Fire";
	_type2 = "Flying";
	_move1 = new Move("Flamethrower", "Fire", 90, 1, false, false);
	_move2 = new Move("Air Slash", "Flying", 75, .95, false, false);
	_move3 = new Move("Dragon Pulse", "Dragon", 85, 1, false, false);
	_move4 = new Move("Earthquake", "Ground", 100, 1, true, false);
    }

    public String toString(){
	return "@@@@@@@@@@@@@.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n@@@@@@@@@@@,??@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n@@@@@@@@@@.###@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n@@@@@@@@@,##:,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*?@@\n@@@@@@@@@#::::@@@@@@@@@@@@@@@@@@@@@@@@@,*.???%@@@@@@@@*,,,@@\n@@@@@@@@::,,::@@@@@@@@@@@@@@@@@@%:,,:#####??,@@@@@@*,,,,,,:@\n@@@@@@@@%:,,:.@@@@@@@@@@@@@@.:::::::.#####@@@@@@@.::,,,,,::@\n@@@@@@@@%::::.,,,,:,:%@@:,:::::::::S###@@@@@@@@%,:::::,::,:%\n@@@@@@@@.S,,,,,,,,::::::::::::::::?@@@@@@@@@@?::::::::::::::\n@@@@@@@:,,,,,,,:,#.#?::::::+.,@@@@@@@@@@@@@.::::::::::::::::\n@@@@@,#:S,,:,::::*#.,:::::::*@@@@@@@@@@@@,::::::::::::::::+@\n@@@@@:%S::::::*,,:::...+.::::S@@@@@@@@@@:::::::::::::::%@@@@\n@@@@*.::::,SSSS%::::+++++:::::%@@@@@@@@:::::::::::::%@@@@@@@\n@@@@@.+:,,::S%+S::::.+++:::::::,@@@@@@@@@:::*::::S@@@@@@@@@@\n@@@@@@.S:::::.*.::::::::::::::::@@@@@@@@@,****%@@@@@@@@@@@@@\n@@@@@@@@.:::::::::::::::*:,**::::,@@@@@@@@,***@@@@@@@@@@@@@@\n@@@@,%,::::::::::::::::*.****::,:S%@@@@@@......@@@@@@@@@@@@@\n,**::::,,,,,,:::::::::::+:**:::::,::@@?.....S@@@@@@@@@@@@@@@\n%:*:,:::,,,,,,,,,,,::::::%::::::,,,::,@S..+@@@@@@@@@@@@@@@@@\n@@@@@,S%+::*,:,,::,:,,,,::::::::::::::?@@%SS?@@@@@@@@@@@@@@@\n@@@@@@@@@@@@.:,,,,:,,,,,,,:::::::::::::+SSSSS.@@@@@@@@@@@@@@\n@@@@@@@@@@@@@:,,,:::::,::::,:::::::::::*?.@@@@@@@@@@@@@@@@@@\n@@@@@@@@@@@@@+,:,:,::::::::::,,::,::::**.SS@@@@@@@@@@@@@@@@@\n@@@@@@@@@@@@@S,,:,,,,::::::::::::::::****@@@@@@@@@@@@@@@@@@@\n@@@@@@@@@@@@@@:::::::::****::::::*******S@@@@@@@@@@@@@@@@@@@\n@@@@@@@@@@@@@@@**********.%..***********@@@@@@@@@@@@@@@@@@@@\n@@@@@@@@@@@@@@@@@,?+S%@@@@@@@@@@@@......@@@@@@@@@@@@@@@@@@@@\n@@@@@@@@@@@@@@@@@@@+..*@@@@@@@@@@@@@:+**@@@@@@@@@@@@@@@@@@@@";
    }
}
	
