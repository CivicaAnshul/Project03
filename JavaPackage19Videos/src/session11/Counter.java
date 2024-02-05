package session11;

public class Counter {
	static int count=0;
	Counter(){
		count++;
	}
	public static void main(String[] args) {
		Counter obj1=new Counter();
		Counter obj2=new Counter();
		Counter obj3=new Counter();
		Counter obj4=new Counter();
		System.out.println(obj1.count);
		System.out.println(Counter.count);
	}
}
