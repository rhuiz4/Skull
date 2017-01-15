public class AI{
    public static Move findBestMove(Pokemon user, Pokemon foe){
	Move currBestMove = user._move1;
	int currBestDamage = BattleUtils.calcDamage(user, foe, user._move1);
	int m2dmg = BattleUtils.calcDamage(user, foe, user._move2);
	int m3dmg = BattleUtils.calcDamage(user, foe, user._move3);
	int m4dmg = BattleUtils.calcDamage(user, foe, user._move4);
	if (currBestDamage < m2dmg){
	    currBestDamage = m2dmg;
	    currBestMove = user._move2;
	}
	else if (currBestDamage < m3dmg){
	    currBestDamage = m3dmg;
	    currBestMove = user._move3;
	}
	else if (currBestDamage < m4dmg){
	    currBestDamage = m4dmg;
	    currBestMove = user._move4;
	}
	return currBestMove;
    }    
}

	   
