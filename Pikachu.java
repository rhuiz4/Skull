public class Pikachu extends Pokemon{
    
    public Pikachu(){
	_hp = (int)(Math.random() *48 + 95);
	_spdef = (int)(Math.random() *64 + 49);
	_spatk = (int)(Math.random() *64 + 49);
	_speed = (int)(Math.random() *72 + 85);
	_atk = (int)(Math.random() *64 + 54);
	_def = (int)(Math.random() *62 + 40);
	_currHP = _hp;
	_type1 = "Electric";
    }

}
	
