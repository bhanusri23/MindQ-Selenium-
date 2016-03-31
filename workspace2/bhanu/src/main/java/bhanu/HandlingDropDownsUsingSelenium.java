package bhanu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownsUsingSelenium {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.calculator.net/tax-calculator.html");
		
		WebElement element =  driver.findElement(By.name("cfilestatus"));

		
		Select s = new Select(element);
		List<WebElement> list = s.getOptions();
		System.out.println(list.size());
		
		for (int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText());
		}
		
		
		//System.out.println(s.isMultiple());
		
		if(s.isMultiple()){
			List<WebElement> list1 = s.getAllSelectedOptions();
			System.out.println(list.size());
		}
		
		else
			System.out.println(s.getFirstSelectedOption().getText());
		
		System.out.println("********************************************************");
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		s.selectByIndex(3);
		Thread.sleep(1000);
		
		s.selectByVisibleText("Married Filing Separately");
		Thread.sleep(1000);
		
		s.selectByValue("Single");
		
		

	}

}
