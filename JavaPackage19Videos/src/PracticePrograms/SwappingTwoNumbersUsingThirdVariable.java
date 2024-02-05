package PracticePrograms;

import java.util.Scanner;

public class SwappingTwoNumbersUsingThirdVariable {
	static void functinforswappingusingthirdvariable(int o,int p) {
		int a=o;
		int m1=p;
		int n1=a;
		System.out.println("value of m: "+m1+"vlaue of n: "+n1);
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter value of m: ");
		int m=obj.nextInt();
		System.out.println("enter value of n: ");
		int n=obj.nextInt();
		functinforswappingusingthirdvariable(m,n);		  
	}
}
