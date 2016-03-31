
public class PlusOpeDemo {

	public static void main(String[] args) {
		int a = 10;
		int b =20;
		String str1 = "Hello ";
		String str2 = "Class";
		
		System.out.println(a+b);//30
		System.out.println(str1+str2);//Hello CLass
		System.out.println(a+b+str1+str2);//30Hello CLass
		System.out.println(str1+str2+a+b);//Hello Class1020
		System.out.println(a+b+str1+str2+"!");//30Hello Class!
				
	}

}
