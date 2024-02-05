package session08;

public class Students3 {
	String name;
	int rollno;
void insertData(String studentName,int studentRollno){
		name=studentName;
		rollno=studentRollno;
	}
	void displayData() {
		System.out.println("Name: "+name);
		System.out.println("Roll no.: "+rollno);
	}
}