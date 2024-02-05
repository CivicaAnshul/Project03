package practicePrograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferReader {
	public static void main(String[] args) throws IOException {
		BufferedReader obj =new BufferedReader (new InputStreamReader (System.in));
		System.out.println("enter an String value");
		String s=obj.readLine();
		System.out.println("you entered :"+s);
		System.out.println("enter any integer no");
		String s2=obj.readLine();
		int i=Integer.parseInt(s2);
		System.out.println("entered integer: "+i);
		System.out.println("Please enter any double");
		double d=Double.parseDouble(obj.readLine());
		System.out.println("eneterd double: "+d);
		System.out.println("enter any float no.");
		float f=Float.parseFloat(obj.readLine());
		System.out.println("entered float no: "+f);	}	}
