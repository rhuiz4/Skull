public class Gengar extends Pokemon{
    public Gengar(){
       	_name = "Gengar";
	_hp = (int)(Math.random() *48 + 120);
	_atk = (int)(Math.random() *66 + 63);
	_def = (int)(Math.random() *66 + 58);
	_spatk = (int)(Math.random() *80 + 121);
	_spdef = (int)(Math.random() *68 + 72);
	_speed = (int)(Math.random() *76 + 103);
	_currhp = _hp;
	_type1 = "Ghost";
	_type2 = "Poison";
	_move1 = new Move("Shadow Ball", "Ghost", 80, 1, false, false);
	_move2 = new Move("Sludge Bomb", "Poison", 90, 1, false, false);
	_move3 = new Move("Psychic", "Psychic", 90, 1, false, false);
	_move4 = new Move("Thunderbolt", "Electric", 90, 1, false, false);
    }

    public String toString(){
	return "
@@@@@@@@@@@@.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@S.+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@.S+.%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@%SS+...,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@?SS++..+..@@@,@@@@@@@@@@@@@.#@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@.SSS+++++SS#*.S*%.@@S%.....#@@@@@@@@@@@@@@@@@@@@
@@@.@@@@@@@@@SSSSSSSSSSSSSSSSSSS......*@@@@@@@@@@@@@@@@@@@@@
,?+.SS+%@@@@@SSSSSSS+....+..++++SSSSSS...?@@@@@@@@@@@@@@@@@@
@@+SSSS...+*@+S+S++......++++..+++SSSSSSSSS+.++++..+++++++S#
@:.+SSSS++++S?SSS..+.......++..+++++SSSSSSSS++++++.++SSSS+@@
@@@@SSSSSSSSSSSS.++.+.........++++++SSSSSSSSS++SSSSSSS?@@@@@
@@@@@?SSSSSSSSSSSS+........+++++++SSSSSSSSSSSSSSSSSS?@@@@@@@
@@@@@@@SSSSSSSSSS:*+.+++++++++++SSSSSSSSSSSSSSSSS.,@@@@@@@@@
@@@@@@@:SSSSSSSS.**.?S+SS++++SSSSSSSSS.SSSSSSSS?@@@@@@@@@@@@
@@@@@@@+SSSSSSSS?**.?.SSSSSSSS+SSSS+.*SSSSSSS?@@@@@@@@@@@@@@
@@@@@@++SSSSS@.SSS....SSSSSSSSS+.....+SSSSSSS?SSSSSSSS.S?@@@
@@@@@@#++SSSS@@SSSSSSSSSSSSSSS*****..SSSSSSSS.SSSSSSSSSSS.@@
@@@@@@%++SS..:@:::#SSSSSSSSSSS.?S%?SSSSSSSSSSSSSSSSSSSSS+@@@
@@@@@@?SSS....*+:::*S:+?SSSSSSSSSSSSS.SSSSSSSSSSSSSS#@@@@@@@
@@@@@@%SSS......::*%::::::*::::*S**SS..........?@@@@@@@@@@@@
@@@@@%%S...%%%%%%.?,:::::**::::::,%........*@@@@@@@@@@@@@@@@
@@@@S.....%%%%%%%%%%%%%#+*+,,S#.%%%%%%%%%%.@@@@@@@@@@@@@@@@@
@@@@#SS.%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@@@@@@@@@@@@@
@@@@@SSSS.%%%%%%%%%%%%%%%%%%%%%%.SSS.%%%@@@@@@@@@@@@@@@@@@@@
@@@@@@#...%%?%%%%%%%%%%%%%%%%SSSSSSSS..%@@@@@@@@@@@@@@@@@@@@
@@@@@@@@#%%%%#....%%%%%%%%%%.SSSSSSSS...@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@%.?,@@@@?.%%%%%%%.......SSSSSS@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@?%%..:@.SSSSSSSSSSS?@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@#,@@@@SS.%.%?.S@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@S%%%%.#@@@@@@@@@@@@@@@@@@@@@@@";
    }
}
