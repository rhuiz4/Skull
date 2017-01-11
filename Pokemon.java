public abstract class Pokemon{
    protected int _hp, _speed, _spatk, _atk, _spdef, _def;
    protected float _currHP;
    protected String _type1, _type2;  //type2 can be Null
    public final String _name;
    protected String _statusEffect;
    protected Object[] _statMods;

    public void takeDamage(int d){ _currhp -= d}

    abstract void move1();
    abstract void move2();
    abstract void move3();
    abstract void move4();
}
