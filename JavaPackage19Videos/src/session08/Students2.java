package session08;

public class Students2{
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
	public static void main(String[] args) {
		Students2 std1=new Students2();
		std1.insertData("Priya", 24);
		std1.displayData();
		Students2 std2=new Students2();
		std2.insertData("Avantika", 28);
		std2.displayData();
	}
}
