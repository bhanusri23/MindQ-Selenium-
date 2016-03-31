
public class ArraysDemo {

	public static void main(String[] args) {
		//declaration
		int[] a = new int[5];
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		a[0]=10;
		a[1]=20;
				
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println(a.length);
		
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]); 
		}
				
		
	}

}
