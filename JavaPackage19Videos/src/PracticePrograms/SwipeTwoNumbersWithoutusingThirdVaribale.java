package PracticePrograms;

import java.util.Scanner;

public class SwipeTwoNumbersWithoutusingThirdVaribale {

		static void swipewithoutthirdvariable(int a, int b) {
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("value of A: "+a  + "\n" + "Value of B:" +b);
		}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter first number: ");
		int a=obj.nextInt();
		System.out.println("enter second number: ");
		int b=obj.nextInt();
		swipewithoutthirdvariable(a,b);
		

	}

}
