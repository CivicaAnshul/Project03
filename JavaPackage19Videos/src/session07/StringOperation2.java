package session07;

public class StringOperation2 {
	
	public static void main(String[] args) {
		String s="welcome";
//		start Index (w=0,e=1,l=2,c=3,o=4,m=5,e=6)
//		end Index (w=1,e=2,l=3,c=4,o=5,m=6,e=7)
//		substring "come"		
		System.out.println(s.substring(3,7));
//		substring "Wel"
		System.out.println(s.substring(0,3));
		String a="DO YOU KNOW";
		System.out.println(a.substring(3,6));
		System.out.println(a.endsWith("W"));
		System.out.println(a.endsWith("know"));
		System.out.println(a.endsWith("KNOW"));
		}
	}