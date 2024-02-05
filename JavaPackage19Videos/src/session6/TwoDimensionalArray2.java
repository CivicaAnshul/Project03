package session6;
public class TwoDimensionalArray2 {
	public static void main(String[] args) {
//		declaration and initialization
		int [][]a = {{5,8},{12,14},{22,24}};
		a[1][0]=4;
//		read values from array
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
//enhanced for Loop/ advanced for loop/ foreach Loop
		for(int []row:a) {
			for(int colValue:row) {
				System.out.print(colValue);
			}
			System.out.println();
		}		
	}
}
