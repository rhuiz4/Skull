public class Machamp extends Pokemon{

    public Machamp(){
       	_name = "Machamp";
	_hp = (int)(Math.random() *48 + 150);
	_atk = (int)(Math.random() *80 + 121);
	_def = (int)(Math.random() *70 + 76);
	_spatk = (int)(Math.random() *66 + 63);
	_spdef = (int)(Math.random() *70 + 81);
	_speed = (int)(Math.random() *64 + 54);
	_currhp = _hp;
	_type1 = "Fighting";
	_move1 = new Move("Dynamic Punch", "Fighting", 100, 10, true, true, false);
	_move2 = new Move("Stone Edge", "Rock", 100, 10, true, false, false);
	_move3 = new Move("Knock Off", "Dark", 65, 10, true, true, false);
	_move4 = new Move("Earthquake", "Ground", 100, 10, true, false, false);
    }

    public String toString(){
	return "";
    }
}
