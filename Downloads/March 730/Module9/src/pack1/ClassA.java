package pack1;

public class ClassA {
	
	public int a  =10;
	private int b = 20;
	protected int c = 30;
	int d = 40;
	
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		
	}
	

}
