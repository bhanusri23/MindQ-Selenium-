
public class ExceptionsDemo {
	public static void main(String[] args) {
		System.out.println("ABCD");
		
		try{
			System.out.println(10/0);
		}catch (Exception e){
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Exception rised");
		}
		
		System.out.println("EFGh");
	}
}
