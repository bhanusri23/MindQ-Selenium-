
public class ScoreDemo {

	public static void main(String[] args) {
		int m = 90;
		int p = 60;
		int c = 90;
		
		double avg = (m+p+c)/3;
		
		if(m>=40 && p>=40 && c >= 40){
			System.out.println("Pass");
			
			if(avg>=60)
				System.out.println("I div");
			else if(avg>=50 && avg <60)
				System.out.println("II div");
			else
				System.out.println("III div");
			
			
		}else
			System.out.println("Fail");		
	}

}
