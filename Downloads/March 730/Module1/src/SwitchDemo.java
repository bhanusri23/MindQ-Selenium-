
public class SwitchDemo {

	public static void main(String[] args) {
		char c = 'k';
		
		switch(c){
			case 'a':
				System.out.println("Vowel is a");
				break;
			case 'e':
				System.out.println("Vowel is e");
				break;
			case 'i':
				System.out.println("Vowel is i");
				break;
			case 'o':
				System.out.println("Vowel is o");
				break;
			case 'u':
				System.out.println("Vowel is u");
				break;
			default:
				System.out.println("Consonant is: "+c);				
		}
	}

}
