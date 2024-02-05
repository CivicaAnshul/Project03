package practicePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputProgram {

	public static void main(String[] args) throws IOException {
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter your name");
		String s1=obj.readLine();
		System.out.println(s1);
		System.out.println("please enter your roll no.");
		String s2=obj.readLine();
		int i1=Integer.parseInt(s2);
		System.out.println(i1);
		double d1=Double.parseDouble(s2);
		
		

	}

}
