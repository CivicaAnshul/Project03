package Session3;

public class TwoDimentionalArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a[][];
//		a=new int[5][3];
		int [][]a= {{11,12,21},{13,14,22},{15,16,23},{17,18,24},{19,20,25}};
		//int a[]= {60,70,80,90,100};
//		a[0][0]=11;
//		a[0][1]=12;
//		a[0][2]=13;
//		a[1][0]=14;
//		a[1][1]=15;
//		a[1][2]=16;
//		a[2][0]=17;
//		a[2][1]=18;
//		a[2][2]=19;
//		a[3][0]=20;
//		a[3][1]=21;
//		a[3][2]=22;
//		a[4][0]=23;
//		a[4][1]=24;
//		a[4][2]=25;

		
		
		//a[5]=10;
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a[0].length;j++) {
//				System.out.println(a[i][j]);
//			}
//		}
		
		System.out.println(a[0].length);
		for(int b[]:a)
		{
			for(int c:b)
			{
				System.out.println(c);
			}
			
		}
		

}

}