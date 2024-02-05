package session11;
public class Student2 {
	int roll;
	String studentName;
	static String collegeName="Bharti College";
	Student2(int rollno, String name){
		roll=rollno;
		studentName=name;
	}
	void display() {
		System.out.println(studentName+"  "+roll+"  "+collegeName);
	}
	static void changeValue() {
		collegeName="ShyaamLaal college";
	}
	public static void main(String[] args) {
		Student2 obj1=new Student2(101, "Radha");
		Student2 obj2=new Student2(102, "Krishna");
		obj1.display();
		obj2.display();
		changeValue();
		obj1.display();
		obj2.display();
	}
}
