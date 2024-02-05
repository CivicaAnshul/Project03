package PracticePrograms;

import java.util.Scanner;

public class SwapingTwoIntegers {

	public static void main(String[] args) {
		int m,n;
		Scanner obj=new Scanner(System.in);
		System.out.println("please enter the value of m");
		m=obj.nextInt();
		System.out.println("please enter the value of n");
		n=obj.nextInt();
		int a=m;
		m=n;
		n=a;
		System.out.println("AFTER SWAPPING");
		System.out.println("m= "+m +"\n" +"n= "+n );
		
				
;	}

}
