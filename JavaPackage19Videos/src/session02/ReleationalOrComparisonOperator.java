package session02;

public class ReleationalOrComparisonOperator {

	public static void main(String[] args) {
		int a=10,	b=5;
		System.out.println(a==b);	//false
		System.out.println(a!=b);	//true
		System.out.println(a>b);	//true
		System.out.println(a<b);	//false
		System.out.println(a>=b);	//true
		System.out.println(a<=b);	//false
		a=b;	//assignment operator
		System.out.println(b);
	}
}
