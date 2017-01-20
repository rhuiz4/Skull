public class Dragonite extends Pokemon{
    
    public Dragonite(){
	_name = "Dragonite";
	_hp = (int)(Math.random() *48 + 151);
	_atk = (int)(Math.random() *80 + 125);
	_def = (int)(Math.random() *72 + 90);
	_spatk = (int)(Math.random() *74 + 94);
	_spdef = (int)(Math.random() *74 + 94);
	_speed = (int)(Math.random() *70 + 76);
	_currhp = _hp;
	_type1 = "Dragon";
	_type2 = "Flying";
	_move1 = new Move("Hurricane", "Flying", 110, .7, false, false);
	_move2 = new Move("Dragon Claw", "Dragon", 80, 1, true, true);
	_move3 = new Move("Earthquake", "Ground", 100, 1, true, false);
	_move4 = new Move("Thunderbolt", "Electric", 90, 1, false, false);
    }

    public String toString(){
	return "";
    }
}
