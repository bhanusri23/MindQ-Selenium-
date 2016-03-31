public class SumAll {

	public static void main(String[] args) {
		sum(50);
		sum();
		sum(200);
		sum(300);
		sum(400);
	}
	
	public static void sum(){
		int sum = 0;
		
		for(int i=0; i<=100; i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}
	
	public static void sum(int n){
		int sum = 0;
		
		for(int i=0; i<=n; i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
