
public class StringDemo {

	public static void main(String[] args) {
		String str = new String();//creating object of String class
		System.out.println(str);
		str="We are in the classroom";//initializing variable
		String str2 = " Today";//initializing String variable2
		String str3 = "we are in the classroom";
		System.out.println(str.length()); //returns length of the str
		System.out.println(str.charAt(3));//returns character at 4th location
		System.out.println(str.concat(str2));//appends given string to main string
		System.out.println(str.indexOf("a"));//returns index of first occurrence 
															//of the specified char 
		System.out.println(str.indexOf("a", 4));
		System.out.println(str.equals(str3));//compares two strings considering the case
		System.out.println(str.equalsIgnoreCase(str3));//compares two strings 
															//ingnoring the case
		System.out.println(str.substring(14));//returns substring from given index 
	
	}

}
