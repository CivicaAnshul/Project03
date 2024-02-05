package session12;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter your Name, Age, Salary");
		String name=obj.nextLine();
		int age=obj.nextInt();
		double salary=obj.nextDouble();
		System.out.println("Your Name is : "+name);
		System.out.println("Your age is : "+age);
		System.out.println("Your salary is : "+salary);
	}
}
