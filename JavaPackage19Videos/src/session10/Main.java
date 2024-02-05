package session10;

public class Main {
	static int x; //attribute of class
	
	Main(){	//constructor
		//initialize object
		x=10;//initialize value to the attribute
	}

	public static void main(String[] args) {
//		Main obj=new Main();//new operator object
// 					ko Memory allocate karata hai
		System.out.println(x);

	}

}
