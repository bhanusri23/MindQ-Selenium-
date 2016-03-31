
public class ReturnTypesDemo {
	
	

	public static void main(String[] args) {
		sum();
		
		int a = sum(200);
		System.out.println(a);

	}
	
	public static void sum(){
		int sum = 0;
		
		for(int i=0; i<=100; i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}
	
	public static int sum(int n){
		int sum = 0;
		
		for(int i=0; i<=n; i++){
			sum=sum+i;
		}
		
		return sum; 
	}

}












