package session10;

public class MyClass {
//	attributes of class
	String car;
	int year;
//	Constructor with parameter
	MyClass(String carName, int yr){
		//initialize attributes
		car=carName;
		year=yr;
	}
	public static void main(String[]args) {
		MyClass obj=new MyClass("Ferrari",2024);
		System.out.println(obj.car + "  "+obj.year);	
	}
}
