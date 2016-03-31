import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTFandBtns {

	public static void main(String[] args) throws Exception {
		//type, read place holder text, clear
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		
		WebElement element = driver.findElement(By.id("Email"));
		//to retrieve place holder text
		System.out.println(element.getAttribute("placeholder"));
		System.out.println(element.getAttribute("value"));
		//to type
		element.sendKeys("Venkat");
		System.out.println(element.getAttribute("value"));
		//to clear value
		element.clear();
		Thread.sleep(1000);
		element.sendKeys("QTP");
		//to get value entered into text field
		System.out.println(element.getAttribute("value"));
		//handling button
		WebElement btnElement = driver.findElement(By.name("xxxx"));
		//reading button label
		System.out.println(btnElement.getAttribute("xxxx"));
		//clicking button
		btnElement.click();
		
		driver.close();
		
	}

}
