import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchDemo {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter no. of values: ");
		Scanner obj = new Scanner(System.in);
		int size = obj.nextInt();
		//creating array dynamically
		String[] str = new String[size];
		//processing extra newline character after reading integer
		obj.nextLine();
		System.out.println("Enter values to fill array: ");
		//filling array with search terms
		for(int i=0; i<str.length; i++){
			str[i] = obj.nextLine();
		}
		//printing array values
		for(int j=0; j<str.length; j++){
			System.out.println(str[j]);
		}
		//performing search operation for each term in array
		for(int k=0; k<str.length; k++){
			FirefoxDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://google.com");
			driver.findElement(By.name("q")).sendKeys(str[k]);
			driver.findElement(By.className("lsb")).click();
			Thread.sleep(2000);
			
			String title = driver.getTitle();
			
			System.out.println(title);
			//verifying search operation
			if(title.contains(str[k]))
				System.out.println("Search is fine for: "+str[k]);
			else
				System.out.println("Search is not working for; "+str[k]);
			
			driver.close();
		}

		
	}

}
