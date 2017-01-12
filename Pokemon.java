public abstract class Pokemon{
    protected int _hp, _speed, _spatk, _atk, _spdef, _def;
    protected float _currHP;
    protected String _type1, _type2;  //type2 can be Null
    public final String _name;
    protected String _statusEffect;
    protected Object[] _statMods;
    protected Move _move1;
    protected Move _move2;
    protected Move _move3;
    protected Move _move4;

    public void takeDamage(int d){ _currhp -= d}

    public void move1(){
	_move1.use();;
    }
    public void move2(){
	_move2.use();;
    }
    public void move3(){
	_move3.use();;
    }
    public void move4(){
	_move4.use();;
    }
}
