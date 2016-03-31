package bhanu;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) throws Exception  {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("#######");
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("*******");
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("html/body/div[10]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[1]/table/tbody/tr[1]/td[2]/div/div/textarea")).sendKeys("$$$$$$$$$$$$$");
		
//		driver.findElement(By.xpath(".//*[@id=':vg']")).sendKeys("My First Test Mail Through Selenium Script");
		driver.findElement(By.xpath("html/body/div[10]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div/div[1]/div[2]/div[1]/div/table/tbody/tr/td[2]/div[2]/div")).sendKeys("Hello Rohith !   Feeling soo excited to send U a mail this way.");
		driver.findElement(By.xpath("html/body/div[10]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]")).click();
		Thread.sleep(3000);
		
		
		
		
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

	

}
