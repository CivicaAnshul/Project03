package session09;

public class Calculation4 {
	static int min(int a, int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}		
	}
	public static void main(String[] args) {
		System.out.println(min(100,200));
	}
}
