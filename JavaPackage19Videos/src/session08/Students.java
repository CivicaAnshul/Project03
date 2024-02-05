package session08;

public class Students {
	String name; // instance variable
	int rollno;
	void displayInformation() {
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rollno);
	}
	public static void main(String[] args) {
		Students student1=new Students();
		Students student2=new Students();
//initialize object/store data to the object student1
		student1.name="Priya";
		student1.rollno=24;
		student2.name="Rahul";
		student2.rollno=28;
		student1.displayInformation();
		student2.displayInformation();
	}
}
