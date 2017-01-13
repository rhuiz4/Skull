public class Pikachu extends Pokemon{
    
    public Pikachu(){
	_hp = (int)(Math.random() *48 + 95);
	_spdef = (int)(Math.random() *64 + 49);
	_spatk = (int)(Math.random() *64 + 49);
	_speed = (int)(Math.random() *72 + 85);
	_atk = (int)(Math.random() *64 + 54);
	_def = (int)(Math.random() *62 + 40);
	_currhp = _hp;
	_type1 = "Electric";
	_move1 = new Move("Thunderbolt", "Electric", 90, 1, false, false);
	_move2 = _move1; //temp
	_move3 = _move1; //temp
	_move4 = _move1; //temp
    }

}
	
