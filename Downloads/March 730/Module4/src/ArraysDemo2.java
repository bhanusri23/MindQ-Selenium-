
public class ArraysDemo2 {

	public static void main(String[] args) {
		int[][] a = new int[4][3];
		
		a[0][0]=  10;
		a[0][1]=  20;
		a[0][2]=  30;
		
		System.out.println(a.length);//no. of rows (= no. of 1D arrays)
		System.out.println(a[0].length);//no . of columns (= no.of elements in 1D array)
		
		for(int i=0; i<a.length; i++)//iterate in rows
		{
			for(int j=0; j<a[0].length; j++){//iterate columns
				System.out.println(a[i][j]);
			}
			
			
		}
		
		
		
		
	}

}
