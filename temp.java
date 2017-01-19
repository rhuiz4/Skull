public class temp{
    public static void printPokemon(Pokemon p1, Pokemon p2){
	String s1 = p1.toString();
	String s2 = p2.toString();
	String toPrint = "";
	while (s1.length() > 0 || s2.length() > 0){
	    if (s1.indexOf("\n") == -1){
		toPrint += s1 + "     ";
		s1 = "";}
	    else{
		toPrint += s1.substring(0, s1.indexOf("\n")) + "     ";
		s1 = s1.substring(s1.indexOf("\n") + 1);}
	    if (s2.indexOf("\n") == -1){
		toPrint += s2 + "\n";
		s2 = "";}
	    else{
		toPrint += s2.substring(0, s2.indexOf("\n")) + "\n";
		s2 = s2.substring(s2.indexOf("\n") + 1);}
	    System.out.println(toPrint);
	    toPrint = "";
	}
    }


    public static void main(String [] args){
	Pokemon p1 = new Charizard();
	Pokemon p2 = new Pikachu();
	printPokemon(p1,p2);
    }
}
