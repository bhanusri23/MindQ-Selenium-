package bhanu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingDropdowns {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.calculator.net/tax-calculator.html");
	
		WebElement element =  driver.findElement(By.name("cfilestatus"));
		
		List<WebElement> list = element.findElements(By.tagName("option"));
		System.out.println(list.size());
		
		for(int i = 0; i<list.size(); i++){
			System.out.println(list.get(i).getText()+"-"+list.get(i).isSelected());
		}
		System.out.println("*********************************");
		list.get(3).click();
		Thread.sleep(1000);
		
		for(int i = 0; i<list.size(); i++){
			System.out.println(list.get(i).getText()+"-"+list.get(i).isSelected());
		}
		System.out.println("*********************************");
		element.sendKeys("Married Filing Separately");
		for(int i = 0; i<list.size(); i++){
			System.out.println(list.get(i).getText()+"-"+list.get(i).isSelected());
		}
		
		
	
	}

}
