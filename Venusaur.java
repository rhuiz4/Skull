
public class Venusaur extends Pokemon{
    
    public Venusaur(){
	_name = "Venusaur";
	_hp = (int)(Math.random() *48 + 140);
	_atk = (int)(Math.random() *70 + 78);
	_def = (int)(Math.random() *70 + 79);
	_spatk = (int)(Math.random() *74 + 94);
	_spdef = (int)(Math.random() *74 + 94);
	_speed = (int)(Math.random() *70 + 76);
	_currhp = _hp;
	_type1 = "Grass";
	_type2 = "Poison";
	_move1 = new Move("Petal Blizzard", "Grass", 90, 1, true, false);
	_move2 = new Move("Earthquake", "Ground", 100, 1, true, false);
	_move3 = new Move("Leaf Storm", "Grass", 130, .9, false, false);
	_move4 = new Move("Sludge Bomb", "Poison", 90, 10, false, false);
    }

    public String toString(){
	return "@@@@@@@@@@@@@@@@@@@@@@@@S%.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n@@@@@@@@@@@@@@@@@@?+++++.SS+:%+#+%++:,..+%@@@@@@@@@@@@@@@@@@\n@@@@@@@@@@@@:++::.......+S%*:::.*.*S++**....+%@@@@@@@@@@@@@@\n@@@@@@@@@@.+S::+.?..+:++....+++...::.....+%+*::+++@@@@@@@@@@\n@@@@@@@@,+SSS*.++++:::..:::%?????#+....++*++++?.*+S.@@@@@@@@\n@@@@@@@@,S@@SS+++SSS+S++%@?%???????@++S++*S++SSSS@+.@@@@@@@@\n@@@@@@@@@@@@?SSSSSSSSSS@@%?#%?##?#?@@SS**:SSSSSS+.@@@@@@@@@@\n@@@@@@@@@@@@@@@@@,SSS%.%.?SSSS.....?@+:SSSSSSS,@@@@@@@@@@@@@\n@@@@@@@@@@@:.+S.SS?.%#?%%%SSS+????S%%%.??.SS.%:@@@@@@@@@@@@@\n@@@@@@%++S+SS.%%.%?????%.%?%.?..%...??%%....?%SS+S+SS%@@@@@@\n@@+.++++SS++SSS.S.....*%+SSSS%+SSS?S+....%.SSSSSSS.SSSS+%@@@\n*S+++++S?SSSS+SSS?.......SSSSSSSS+SS.+.?.S+S?SS.SSS+S+++#+.S\n?,..,+S?SS#S.?%..?+.....??.SS++SSS.%++++++%......???.*+.%+..\n@@@@@@@*S..%?SSS...S.......S+...?+++++++++++......SS.,@@@@@@\n@@@@@@@S..S%SS.....S@+#+.....+++....%%S@++++S?SSS.S..S.@@@@@\n@@@@@@....S++S%SS+............++.......++S?SSSSSS.S....@@@@@\n@@@@@@,...SSSSS.S+SS:#%++.....++.++%S%%:.SS..SSSS%SS.%%@@@@@\n@@@@@@@@...SSSSSSSS+S%.....+....+......S%SSSSSSSS....%@@@@@@\n@@@@@@@@S...SSSSSSSS.S%?.**********S.SS.S..S.SS.%...@@@@@@@@\n@@@@@@@@@@@**?..S.?SSSS%+?........#+S..%....SS.S:::@*@@@@@@@\n@@@@@@@@@@@@@@@.%...S%.@@@@@@@@@@@@%...SS..S...@@@@@@@@@@@@@\n@@@@@@@@@@@@@@@...S:.?:@@@@@@@@@@@@SS.....S..@@@@@@@@@@@@@@@\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.S%,..S:?@@@@@@@@@@@@@@@@\n";
    }
}

	
