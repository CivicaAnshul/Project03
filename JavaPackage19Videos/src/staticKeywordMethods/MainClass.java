package staticKeywordMethods;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello ");
		StaticKeywordMethodClass obj1=new StaticKeywordMethodClass();
		StaticKeywordMethodClass obj2=new StaticKeywordMethodClass();
		StaticKeywordMethodClass obj3=new StaticKeywordMethodClass();
		StaticKeywordMethodClass obj4=new StaticKeywordMethodClass();
		System.out.println(obj1.count+"    "+obj1.schoolName);
		System.out.println(StaticKeywordMethodClass.count+"    "+obj2.schoolName);
		System.out.println(obj3.count+"    "+obj3.schoolName);
		System.out.println(obj4.count+"    "+obj4.schoolName);
		
		System.out.println("complete ");
		
		
	}

}
