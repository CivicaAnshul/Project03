package session02;
public class LogicalOperator {
	public static void main(String[] args) {
		boolean x=true,		y=false;
		System.out.println(x&&y);	//false
		System.out.println(x||y);	//true
		System.out.println(!y); 	//true
		System.out.println(!x); 	//false
		System.out.println("--conditional/ternary--");
//variable = (condition) ? expression1 : expression2
		int a=10, b=5;
		int minimum= a>b ? a : b ;
		System.out.println(minimum);
		int min= a<b ? a:b;
		System.out.println(min);
		System.out.println("--String concatenation--");
		String c="Hello", d="java";
		System.out.println(c+ "  " +d);
	}
}
