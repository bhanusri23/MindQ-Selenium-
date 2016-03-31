import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpecificAreaLinks {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://yahoo.com");
		
		WebElement Box = driver.findElement(By.id("tn-trending"));
		
		List<WebElement> list = Box.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++){
				System.out.println(list.get(i).getText()+"-"+list.get(i).isDisplayed());
		}
		
		list.get(0).click();
		
		driver.close();
		
	}

}
