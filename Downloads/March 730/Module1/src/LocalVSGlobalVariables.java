
public class LocalVSGlobalVariables {

	public static int a = 10;
	public static int c = 40;
	
	public static void main(String[] args) {
		int b = 20;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("*****************");
		udMethod();
		
	}
	
	public static void udMethod() {
		int c = 30;
		
		System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
	}
	
	

}
