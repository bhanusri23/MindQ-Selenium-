import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		System.out.println("Enter size of the array: ");
		//create scanner class object with input stream as constructor parameter
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		//declaring array with the given size
		int[] a = new int[size];
		System.out.println("Enter values into array: ");
		//filling array by reading values from the keyboard
		for(int i=0; i<size; i++){
			a[i]= s.nextInt();
		}
		//displaying values from array
		for(int j=0; j<size; j++){
			System.out.println(a[j]);
		}
		
		//to find largest number from array
		int largest = a[0];
		
		for(int k=1; k<size; k++){
			if(a[k]>largest)
				largest=a[k];
		}
		
		System.out.println("Largest values is: "+largest);
		
		//to find smallest number from array
		int smallest = a[0];
		
		for(int k=1; k<size; k++){
			if(a[k]<smallest)
				smallest=a[k];
		}
		
		System.out.println("Smallest values is: "+smallest);
		
		
		
		
		
		
		
		
		
		
	}

}
