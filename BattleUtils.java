public class BattleUtuils{
    public static float computeEffectiveness (String atktype, String deftype1, String deftype2){
	float effectiveness = 1;
	if (atktype.equals("Electric"))
	    {
		if  (deftype1.equals("Electric") || deftype2.equals("Electric")) effectiveness *= 0.5;
		if  (deftype1.equals("Grass") || deftype2.equals("Grass")) effectiveness *= 0.5;
		if  (deftype1.equals("Water") || deftype2.equals("Water")) effectiveness *= 2;
		if  (deftype1.equals("Flying") || deftype2.equals("Flying")) effectiveness *= 2;
		if  (deftype1.equals("Ground") || deftype2.equals("Ground")) effectiveness *= 0;
		if  (deftype1.equals("Dragon") || deftype2.equals("Dragon")) effectiveness *= 0.5;
		return effectiveness; }
	if (atktype.equals("Grass"))
	    {
		if (deftype1.equals("Grass") || deftype2.equals("Grass"))   effectiveness *= .5;
		if (deftype1.equals("Poison") || deftype2.equals("Poison"))   effectiveness *= .5;
		if (deftype1.equals("Fire") || deftype2.equals("Fire"))   effectiveness *= .5;
		if (deftype1.equals("Water") || deftype2.equals("Water"))   effectiveness *= 2;
		if (deftype1.equals("Bug") || deftype2.equals("Bug"))   effectiveness *= .5;
		if (deftype1.equals("Flying") || deftype2.equals("Flying"))   effectiveness *= .5;
		if (deftype1.equals("Rock") || deftype2.equals("Rock"))   effectiveness *= 2;
		if (deftype1.equals("Ground") || deftype2.equals("Ground"))   effectiveness *= 2;
		if (deftype1.equals("Dragon") || deftype2.equals("Dragon"))   effectiveness *= .5;
		if (deftype1.equals("Steel") || deftype2.equals("Steel"))   effectiveness *= .5;
		return effectiveness; }
	if (atktype.equals("Poison"))
	    {
		if (deftype1.equals("Grass") || deftype2.equals("Grass")) effectiveness *= 2;
		if (deftype1.equals("Poison") || deftype2.equals("Poison")) effectiveness *= 0.5;
		if (deftype1.equals("Ghost") || deftype2.equals("Ghost")) effectiveness *= 0.5;
		if (deftype1.equals("Rock") || deftype2.equals("Rock")) effectiveness *= 0.5;
		if (deftype1.equals("Ground") || deftype2.equals("Ground")) effectiveness *= 0.5;
		if (deftype1.equals("Steel") || deftype2.equals("Steel")) effectiveness *= 0;
		return effectiveness; }
	if (atktype.equals("Fire"))
	    {
		if (deftype1.equals("Grass") || deftype2.equals("Grass")) effectiveness *= 2;
		if (deftype1.equals("Fire") || deftype2.equals("Fire")) effectiveness *= 0.5;
		if (deftype1.equals("Water") || deftype2.equals("Water")) effectiveness *= 0.5;
		if (deftype1.equals("Bug") || deftype2.equals("Bug")) effectiveness *= 2;
		if (deftype1.equals("Rock") || deftype2.equals("Rock")) effectiveness *= 0.5;
		if (deftype1.equals("Dragon") || deftype2.equals("Dragon")) effectiveness *= 0.5;
		if (deftype1.equals("Ice") || deftype2.equals("Ice")) effectiveness *= 2;
		if (deftype1.equals("Steel") || deftype2.equals("Steel")) effectiveness *= 2;
		return effectiveness; }
	if (atktype.equals("Water"))
	    {
		if (deftype1.equals("Grass") || deftype2.equals("Grass")) effectiveness *= 0.5;
		if (deftype1.equals("Fire") || deftype2.equals("Fire")) effectiveness *= 2;
		if (deftype1.equals("Water") || deftype2.equals("Water")) effectiveness *= 0.5;
		if (deftype1.equals("Rock") || deftype2.equals("Rock")) effectiveness *= 2;
		if (deftype1.equals("Ground") || deftype2.equals("Ground")) effectiveness *= 2;
		if (deftype1.equals("Dragon") || deftype2.equals("Dragon")) effectiveness *= 0.5;
		return effectiveness; }
	if (atktype.equals("Bug"))
	    {
		if (deftype1.equals("Grass") || deftype2.equals("Grass")) effectiveness *= 2;
		if (deftype1.equals("Poison") || deftype2.equals("Poison")) effectiveness *= 0.5;
		if (deftype1.equals("Fire") || deftype2.equals("Fire")) effectiveness *= 0.5;
		if (deftype1.equals("Flying") || deftype2.equals("Flying")) effectiveness *= 0.5;
		if (deftype1.equals("Ghost") || deftype2.equals("Ghost")) effectiveness *= 0.5;
		if (deftype1.equals("Fighting") || deftype2.equals("Fighting")) effectiveness *= 0.5;
		if (deftype1.equals("Psychic") || deftype2.equals("Psychic")) effectiveness *= 2;
		if (deftype1.equals("Dark") || deftype2.equals("Dark")) effectiveness *= 2;
		if (deftype1.equals("Steel") || deftype2.equals("Steel")) effectiveness *= 0.5;
		return effectiveness; }
	if (atktype.equals("Flying"))
	    {
		if (deftype1.equals("Electric") || deftype2.equals("Electric")) effectiveness *= 0.5;
		if (deftype1.equals("Grass") || deftype2.equals("Grass")) effectiveness *= 2;
		if (deftype1.equals("Bug") || deftype2.equals("Bug")) effectiveness *= 2;
		if (deftype1.equals("Fighting") || deftype2.equals("Fighting")) effectiveness *= 2;
		if (deftype1.equals("Rock") || deftype2.equals("Rock")) effectiveness *= 0.5;
		if (deftype1.equals("Steel") || deftype2.equals("Steel")) effectiveness *= 0.5;
		return effectiveness; }
	if (atktype.equals("Normal"))
	    {
		if (deftype1.equals("Ghost") || deftype2.equals("Ghost")) effectiveness *= 0;
		if (deftype1.equals("Rock") || deftype2.equals("Rock")) effectiveness *= 0.5;
		if (deftype1.equals("Steel") || deftype2.equals("Steel")) effectiveness *= 0.5;
		return effectiveness; }
	if (atktype.equals("Ghost"))
	    {
		if (deftype1.equals("Normal") || deftype2.equals("Normal")) effectiveness *= 0;
		if (deftype1.equals("Ghost") || deftype2.equals("Ghost")) effectiveness *= 2;
		if (deftype1.equals("Psychic") || deftype2.equals("Psychic")) effectiveness *= 2;
		if (deftype1.equals("Dark") || deftype2.equals("Dark")) effectiveness *= 0.5;
		if (deftype1.equals("Steel") || deftype2.equals("Steel")) effectiveness *= 0.5;
		return effectiveness; }
	if (atktype.equals("Fighting"))
	    {
		if (deftype1.equals("Poison") || deftype2.equals("Poison")) effectiveness *= 0.5;
		if (deftype1.equals("Bug") || deftype2.equals("Bug")) effectiveness *= 0.5;
		if (deftype1.equals("Flying") || deftype2.equals("Flying")) effectiveness *= 0.5;
		if (deftype1.equals("Normal") || deftype2.equals("Normal")) effectiveness *= 2;
		if (deftype1.equals("Ghost") || deftype2.equals("Ghost")) effectiveness *= 0;
		if (deftype1.equals("Rock") || deftype2.equals("Rock")) effectiveness *= 2;
		if (deftype1.equals("Psychic") || deftype2.equals("Psychic")) effectiveness *= 0.5;
		if (deftype1.equals("Dark") || deftype2.equals("Dark")) effectiveness *= 2;
		if (deftype1.equals("Ice") || deftype2.equals("Ice")) effectiveness *= 2;
		if (deftype1.equals("Steel") || deftype2.equals("Steel")) effectiveness *= 2;
		return effectiveness; }
	if (atktype.equals("Rock"))
	    {
		if (deftype1.equals("Fire") || deftype2.equals("Fire")) effectiveness *= 2;
		if (deftype1.equals("Bug") || deftype2.equals("Bug")) effectiveness *= 2;
		if (deftype1.equals("Flying") || deftype2.equals("Flying")) effectiveness *= 2;
		if (deftype1.equals("Fighting") || deftype2.equals("Fighting")) effectiveness *= 0.5;
		if (deftype1.equals("Ground") || deftype2.equals("Ground")) effectiveness *= 0.5;
		if (deftype1.equals("Ice") || deftype2.equals("Ice")) effectiveness *= 2;
		if (deftype1.equals("Steel") || deftype2.equals("Steel")) effectiveness *= 0.5;
		return effectiveness; }
	if (atktype.equals("Ground"))
	    {
		if (deftype1.equals("Electric") || deftype2.equals("Electric")) effectiveness *= 2;
		if (deftype1.equals("Grass") || deftype2.equals("Grass")) effectiveness *= 0.5;
		if (deftype1.equals("Poison") || deftype2.equals("Poison")) effectiveness *= 2;
		if (deftype1.equals("Fire") || deftype2.equals("Fire")) effectiveness *= 2;
		if (deftype1.equals("Bug") || deftype2.equals("Bug")) effectiveness *= 0.5;
		if (deftype1.equals("Flying") || deftype2.equals("Flying")) effectiveness *= 0;
		if (deftype1.equals("Rock") || deftype2.equals("Rock")) effectiveness *= 2;
		if (deftype1.equals("Steel") || deftype2.equals("Steel")) effectiveness *= 2;
		return effectiveness; }
	if (atktype.equals("Psychic"))
	    {
		if (deftype1.equals("Poison") || deftype2.equals("Poison")) effectiveness *= 2;
		if (deftype1.equals("Fighting") || deftype2.equals("Fighting")) effectiveness *= 2;
		if (deftype1.equals("Psychic") || deftype2.equals("Psychic")) effectiveness *= 0.5;
		if (deftype1.equals("Dark") || deftype2.equals("Dark")) effectiveness *= 0;
		if (deftype1.equals("Steel") || deftype2.equals("Steel")) effectiveness *= 0.5;
		return effectiveness; }
	if (atktype.equals("Dragon"))
	    {
		if (deftype1.equals("Dragon") || deftype2.equals("Dragon")) effectiveness *= 2;
		if (deftype1.equals("Steel") || deftype2.equals("Steel")) effectiveness *= 0.5;
		return effectiveness; }
	if (atktype.equals("Dark"))
	    {
		if (deftype1.equals("Ghost") || deftype2.equals("Ghost")) effectiveness *= 2;
		if (deftype1.equals("Fighting") || deftype2.equals("Fighting")) effectiveness *= 0.5;
		if (deftype1.equals("Psychic") || deftype2.equals("Psychic")) effectiveness *= 2;
		if (deftype1.equals("Dark") || deftype2.equals("Dark")) effectiveness *= 0.5;
		if (deftype1.equals("Steel") || deftype2.equals("Steel")) effectiveness *= 0.5;
		return effectiveness; }
	if (atktype.equals("Ice"))
	    {
		if (deftype1.equals("Grass") || deftype2.equals("Grass")) effectiveness *= 2;
		if (deftype1.equals("Fire") || deftype2.equals("Fire")) effectiveness *= 0.5;
		if (deftype1.equals("Water") || deftype2.equals("Water")) effectiveness *= 0.5;
		if (deftype1.equals("Flying") || deftype2.equals("Flying")) effectiveness *= 2;
		if (deftype1.equals("Ground") || deftype2.equals("Ground")) effectiveness *= 2;
		if (deftype1.equals("Dragon") || deftype2.equals("Dragon")) effectiveness *= 2;
		if (deftype1.equals("Ice") || deftype2.equals("Ice")) effectiveness *= 0.5;
		if (deftype1.equals("Steel") || deftype2.equals("Steel")) effectiveness *= 0.5;
		return effectiveness; }
	if (atktype.equals("Steel"))
	    {
		if (deftype1.equals("Electric") || deftype2.equals("Electric")) effectiveness *= 0.5;
		if (deftype1.equals("Fire") || deftype2.equals("Fire")) effectiveness *= 0.5;
		if (deftype1.equals("Water") || deftype2.equals("Water")) effectiveness *= 0.5;
		if (deftype1.equals("Rock") || deftype2.equals("Rock")) effectiveness *= 2;
		if (deftype1.equals("Ice") || deftype2.equals("Ice")) effectiveness *= 2;
		if (deftype1.equals("Steel") || deftype2.equals("Steel")) effectiveness *= 0.5;
		return effectiveness; }
	return effectiveness;
    }

    public static float calcModifier(Pokemon attacker, Pokemon defender, Move m){ //Doesn't account for held items/abilities
	return 0.0; //temp	
    }

    public static int calcDamage(Pokemon attacker, Pokemon defender, Move m){
	float mod = calcModifier(attacker, defender, m);

	//assumes Pokemon level is always 50
	if (m._isPhysical)
	    return (int) (mod * (.44 * attacker.getAtk() / defender.getDef() * m._basePow + 2));
	else
	    return (int) (mod * (.44 * attacker.getSpAtk() / defender.getSpDef() * m._basePow + 2));
    }
}
