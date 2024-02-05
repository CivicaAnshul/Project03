package session05;

public class SingleDimentionArray {

	public static void main(String[] args) {
//		declaration and instantiation
		int []roll=new int[5];
		roll[0]=10;
		roll[1]=20;
		roll[2]=30;
		roll[3]=40;
		roll[4]=50;
		System.out.println("size of an Array: "+roll.length);
		System.out.println("value of 4th element: "+roll[3]);
		System.out.println("--read all values of roll array--");
		for(int i=0; i<roll.length; i++) {
			System.out.println(roll[i]);
		}		
	}
}
