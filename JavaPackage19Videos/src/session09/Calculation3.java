package session09;

public class Calculation3 {
	static double sum(int a, double b) {
		return (a+b);//return keyword ke aate
//		hi method exit ho jata hai
	}

	public static void main(String[] args) {
		
		Calculation3 obj=new Calculation3();
		double c=obj.sum(100,400);
		System.out.println(c);
	}
}
