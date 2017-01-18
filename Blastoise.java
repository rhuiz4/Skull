
public class Blastoise extends Pokemon{
    
    public Blastoise(){
	_name = "Blastoise";
	_hp = (int)(Math.random() *48 + 139);
	_atk = (int)(Math.random() *70 + 79);
	_def = (int)(Math.random() *74 + 94);
	_spatk = (int)(Math.random() *70 + 81);
	_spdef = (int)(Math.random() *74 + 99);
	_speed = (int)(Math.random() *70 + 74);
	_currhp = _hp;
	_type1 = "Water";
	_move1 = new Move("Hydro Pump", "Water", 110, .8, false, false);
	_move2 = new Move("Ice Beam", "Ice", 90, 1, false, false);
	_move3 = new Move("Scald", "Water", 80, 1, false, false);
	_move4 = new Move("Aura Sphere", "Fighting", 80, 10, false, false);
    }

    public String toString(){
	return "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@..@.%@@@@@@@@@@@@@@@@@\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,.....*****...S.@@@@@@@@@@@@@@@\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+S##....??,,#....+SSS@@@@@@@@@@\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.%............+SS%++%@@@@@@@@@\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,......%+++SSSS.***.@@@@@@@@@@\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+..+S***************@@@@@@@@@@\n@@@@@@@@.%@@@@@@@@@@@@@@@*%+.***..*::**********:%@@@@@@@@@@@\n@@@@@@@::::,@@@@@@@@*.*:**.*****.++++??:*****:?@@@@@@@@@@@@@\n@@@@@@@:::::,+++.%+S%..%.++S+.%*...++%...,,@@@@,%:@@,:@@@@@@\n@@@@@@@*,::%++++.........++*......S++SS%#..S@@,@@@@@#SS@@@@@\n@@@@@@@@@%SS++........++++..+....++S%.?SS**S,,,:::*:S#+@@@@@\n@@@@@@@@SSS%+S....++++++SSS+++++++S+..++SSS+.**:::::::*@@@@@\n@@@@@@@..?+++..S+++++++SSS?..SSS++S%.%++++,::+......,@@@@@@@\n@@@@@@..%++++.++++++++S....?..........#,::::*SS+..%*:.,@@@@@\n@@@@:+%?S+S++SS++S+S..........?.....%.#:,,,:.SS++....**S,@@@\n@@@@S.%.SSSSSSS...SS....S.........?....+,,,:+SSSS+S.....+.@@\n@@@@@@.....SSS...SSS...?...........SS...+:::SS+.SSSSSSS.SS#@\n@@@@@%...............?................?:::::+SSSSSSSSS?SSS%:\n@@@@@S......S.....S%..........SS....S%**:.::**+@:+..++S#@.S@\n@@@@S.#.S.....S.?%........SS.SS....S,::::.%.*:@@@@@@@@@@@@@@\n@@@@?%...........?.......SSSSSS.S.?::::::**..%@@@@@@@@@@@@@@\n@@,.?.....................SS..SS,,,,,:::,+*,%@@@@@@@@@@@@@@@\n@@..%.............%......SSSS?,,,,,,,,%..+..%@@@@@@@@@@@@@@@\n@S+S+S...................S.%:,,:,,,,.SS++.S...,@@@@@@@@@@@@@\n@+SSS*.............?....S.::,:,:,,%SSSSSSS+%+SS.@@@@@@@@@@@@\n@SSSS@,@,,,,:::S.....%+::::::,,:*SSSSSSSSSSSSSSS@@@@@@@@@@@@\n@SSSSS,,,@:,::*::,:::::::::**::*SSSSSSSSSSSS%SSS@@@@@@@@@@@@\n@?SSS.?.*...S..%,:*::::::::::%.....SSSSSSSSS.SS%@@@@@@@@@@@@\n@:@,:.*...+S.S.SS..*********:?................#@@@@@@@@@@@@@\n.,:S.*..+SS....SS**::,,..,@@@@#.............%.@@@@@@@@@@@@@@\n@@*..+SS.SSSSSSS@@@@@@@@@@@@@@@.............%::,@@@@@@@@@@@@\n+.+SSSSSSSS+S@@@@@@@@@@@@@@@@@*,****+......:::,%*@@@@@@@@@@@";


    }
}
	