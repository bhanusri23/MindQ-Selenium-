
public class ExceptionDemo2 {

	public static void main(String[] args) {
		int[] a = new int[3];
		
		System.out.println("ABCD");
		
		try{
			System.out.println(a[3]);
		}
		finally{
			System.out.println("EFGH");
		}
		
		 
		
	}

}
