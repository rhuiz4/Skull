
public class Mewtwo extends Pokemon{
    
    public Mewtwo(){
	_name = "Mewtwo";
	_hp = (int)(Math.random() *48 + 166);
	_atk = (int)(Math.random() *76 + 103);
	_def = (int)(Math.random() *72 + 85);
	_spatk = (int)(Math.random() *84 + 143);
	_spdef = (int)(Math.random() *72 + 85);
	_speed = (int)(Math.random() *80 + 121);
	_currhp = _hp;
	_type1 = "Psychic";
	_move1 = new Move("Psychic", "Psychic", 90, 1, false, false);
	_move2 = new Move("Thunderbolt", "Electric", 90, 1, false, false);
	_move3 = new Move("Ice Beam", "Ice", 90 , 1, false, false);
	_move4 = new Move("Flamethrower", "Fire", 90, 1, false, false);
    }

    public String toString(){
	return "";
   }
}

	
