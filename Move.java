public class Move{

    public String _name, _type;
    public int _basePow;
    public float _acc;
    public Boolean _isPhysical, _makesContact;

    public Move(String name, String type, int basePow, float acc, Boolean pyshical, Boolean contact){
	_name = name;
	_type = type;
	_basePow = basePow;
	_acc = acc;
	_isPhysical = physical;
	_makesContact = contact;
    }

    public String toString(){
	return _name;
    }
    
    public void use(Pokemon user, Pokemon foe){
	foe.takeDamage(BattleUtils.calcDamage(user, foe, this));
    }
}
