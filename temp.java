public class temp{
    public static String zipImage(Pokemon p1, Pokemon p2){
	String s1 = p1.toString();
	String s2 = p2.toString();
	String retStr = "";
	int stop = s1.length() + s2.length();
	while (s1.length() > 0 && s2.length() > 0){
	    retStr += s1.substring(0, s1.indexOf("\n"));
	    retStr += s2.substring(0, s2.indexOf("\n"));
	    s1 = s1.substring(s1.indexOf("\n" + 1));
	    s1 = s1.substring(s2.indexOf("\n" + 1));
	}
	return retStr;
    }


    public static void main(String [] args){
	Pokemon p1 = new Pikachu();
	Pokemon p2 = new Charizard();
	System.out.println(zipImage(p1, p2));
    }
}
