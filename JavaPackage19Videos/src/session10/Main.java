package session10;

public class Main {
	int x;  //attribute of class
	Main()	//Constructor without parameter
	{
		x=10;//initialize value to the attribute
	}
	public static void main(String[] args) {
		Main obj=new Main();
//new keyword object ko Memory allocate karta hai
		System.out.println(obj.x);
	}
}
