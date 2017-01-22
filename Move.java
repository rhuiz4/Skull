public class Move{

    public String _name, _type;
    public int _basePow;
    public double _acc;
    public Boolean _isPhysical, _makesContact, _heal;

    public Move(String name, String type, int basePow, double acc, Boolean physical, Boolean contact, boolean heal){
	_name = name;
	_type = type;
	_basePow = basePow;
	_acc = acc;
	_isPhysical = physical;
	_makesContact = contact;
	_heal = heal;
    }

    public String toString(){
	return _name;
    }
    
    public void use(Pokemon user, Pokemon foe){
	if (this._heal)
	    user.heal(this._basePow);
	
	else
	    foe.takeDamage(BattleUtils.calcDamage(user, foe, this));
    }
}
