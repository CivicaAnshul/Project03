package practicePrograms;
import java.util.Scanner;
public class ScannnerProgram {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter roll no");
		int a=obj.nextInt();
		System.out.println(a);
		System.out.println("enter float roll no");
		float b=obj.nextFloat();
		System.out.println(b);
		System.out.println("enter your double no.");
		double c=obj.nextDouble();
		System.out.println(c);
		System.out.println("pls enter any string");
		String d=obj.nextLine();
		System.out.println(d);
	}
}
