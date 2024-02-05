package session07;

public class StringOperation1 {

public static void main(String[] args) {
	String s="Hello Java";// 0=H,1=e,2=l,3=l,4=0;
	System.out.println(s.charAt(4));//charAt Method
	System.out.println(s.length());//length Method
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	System.out.println(s.replace('a', 'i'));
	System.out.println(s.replace("Java", "Python"));
	System.out.println(s.indexOf('J'));
	System.out.println(s.substring(4));
	System.out.println(s.isEmpty());
	String p="";
	System.out.println(p.isEmpty());
	}
}
