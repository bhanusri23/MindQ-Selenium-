
public class Do_WhileDemo {

	public static void main(String[] args) {
		int i =1;
		int sum = 0;
		//repeat until condition becomes false
		do{
			sum=sum+i;
			i++;
		}while(i<=100);
		
		System.out.println(sum);
	}

}
