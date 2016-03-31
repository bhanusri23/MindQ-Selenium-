package pack2;

import pack1.ClassA;

public class ClassC {

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		
		System.out.println(obj.a);//public
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}

}
