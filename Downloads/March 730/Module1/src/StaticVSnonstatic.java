
public class StaticVSnonstatic {
	
	public static int a = 10;//global static variable
	public int b = 20; //global non-static variable

	public static void main(String[] args) {
		//object declaration
		StaticVSnonstatic obj = new StaticVSnonstatic();
		
		System.out.println(a);
		//System.out.println(b);
		System.out.println(obj.b);
		
		sMethod();
		//nsMethod();
		obj.nsMethod();

	}
	
	public static void sMethod() {//user defined static method 
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public void nsMethod() {//user defined non-static method
		System.out.println(a);
		System.out.println(b);

	}

}
