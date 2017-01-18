public class Pokemon{
    protected int _hp, _speed, _spatk, _atk, _spdef, _def, _currhp;
    protected String _type1, _type2, _name;  //type2 can be Null
    protected String _statusEffect;
    protected Object[] _statMods;
    public Move _move1;
    public Move _move2;
    public Move _move3;
    public Move _move4;

    public void takeDamage(int d){ _currhp -= d;}


    //Move using methods
    public void move1(Pokemon p){
	_move1.use(this, p);
    }
    public void move2(Pokemon p){
	_move2.use(this, p);
    }
    public void move3(Pokemon p){
	_move3.use(this, p);
    }
    public void move4(Pokemon p){
	_move4.use(this, p);
    }

    //Accessor methods
    public int getMaxHP(){
	return _hp;}
    public int getCurrHP(){
	return _currhp;}
    public int getSpeed(){
	return _speed;}
    public int getAtk(){
	return _atk;}
    public int getDef(){
	return _def;}
    public int getSpAtk(){
	return _spatk;}
    public int getSpDef(){
	return _spdef;}
    public String getName(){
	return _name;}
    public String getType1(){
	return _type1;}
    public String getType2(){
	return _type2;}
}
