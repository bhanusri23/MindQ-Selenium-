import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultipleLinks {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		List<WebElement> list = new ArrayList<WebElement>();
		list = driver.findElements(By.tagName("a"));
		//number of links
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getAttribute("href")+"-"+
													list.get(i).isDisplayed());
		}
		
		driver.close();
		
	}

}
