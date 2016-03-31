
public class PalindromeDemo {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome(123));
		System.out.println(isPalindrome(12345));
		System.out.println(isPalindrome(12321));
		
	}
	
	public static boolean isPalindrome(int n){
		int num = n;
		int gvnNum = num;
		int rev = 0;
		int rem = 0;
		
		while(num>0){
			
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		
		System.out.println(rev);
		
		if(gvnNum==rev)
			return true;
		else
			return false;
	}

}
