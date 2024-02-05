package session07;

public class StringOperation3 {

	public static void main(String[] args) {
		
	String s1="Welcome", s2="Welcome";
	System.out.println("Is s1 equals s2:  "+s1.equals(s2));
	String s3="Welcome", s4="WELCOME";
	System.out.println("Is s1 equals s2:  "+s3.equals(s4));
	System.out.println("Is s1 equals s2:  "+s3.equalsIgnoreCase(s4));
	System.out.println(s3.concat(s4));
	System.out.println(s3.concat(" to my HOME"));
	System.out.println(s3+s4);
	}
}
