public class temp{
    public static String zipImage(Pokemon p1, Pokemon p2){
	String s1 = p1.toString();
	String s2 = p2.toString();
	String retStr = "";
	while (s1.length() > 0 || s2.length() > 0){
	    if (s1.indexOf("\n") == -1){
		retStr += s1 + "     ";
		s1 = "";}
	    else{
		retStr += s1.substring(0, s1.indexOf("\n")) + "     ";
		s1 = s1.substring(s1.indexOf("\n") + 1);}
	    if (s2.indexOf("\n") == -1){
		retStr += s2 + "\n";
		s2 = "";}
	    else{
		retStr += s2.substring(0, s2.indexOf("\n")) + "\n";
		s2 = s2.substring(s2.indexOf("\n") + 1);}
	}
	return retStr;
    }


    public static void main(String [] args){
	Pokemon p1 = new Charizard();
	Pokemon p2 = new Pikachu();
	System.out.println(zipImage(p1,p2));
    }
}
