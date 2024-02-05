package session11;

public class Students {
	int roll;	//non-static variable
	String studentName;	//non-static variable
	static String collegeName="Bharti College";	//static variable
	static int count=0;

	public static void main(String[] args) {
		Students obj=new Students();
		obj.studentName="Shaifali";
		obj.roll=101;
		System.out.println(obj.studentName);
		System.out.println(obj.roll);
		System.out.println(obj.collegeName);
		System.out.println(Students.collegeName);
		Students obj2=new Students();
		obj2.studentName="Amit";
		obj2.roll=102;
		System.out.println(obj2.studentName+"  "+obj2.roll);
		System.out.println(obj2.collegeName);
	}
}
