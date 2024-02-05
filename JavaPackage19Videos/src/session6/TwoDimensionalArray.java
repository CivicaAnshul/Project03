package session6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
//		declaration and initialization
		int [][]a=new int[3][2];//3 row and 2 cols;
		a[0][0]=10;	//row 0 , col 0;
		a[0][1]=10; //row 0 , col 1;
		a[1][0]=10;	//row 1 , col 0;
		a[1][1]=10;	//row 1 , col 1;
		a[2][0]=10;	//row 2 , col 0;
		a[2][1]=10;	//row 2 , col 1;
//		print size of row and columns
		System.out.println("no. of rows: "+a.length);
		System.out.println("no. of columns: "+a[0].length);
	}
}
