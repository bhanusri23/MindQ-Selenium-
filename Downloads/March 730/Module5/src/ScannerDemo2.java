import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		System.out.println("Enter string value: ");
		Scanner obj = new Scanner(System.in);
		//to read string from keyboard
		//String str = obj.next();
		String str = obj.nextLine();
		//calling method which performs string reverse
		System.out.println(isSame(str));
		
	}
	
	public static boolean isSame(String givenStr){
		String revStr = "";
		//to reverse the given string
		for(int i=givenStr.length()-1; i>=0; i--){
			revStr = revStr+givenStr.charAt(i);
			
		}
		System.out.println(revStr);
		//compare reversed string and given string to check both are same or not
		if(revStr.equals(givenStr))
			return true;
		else
			return false;	
		
	}

}
