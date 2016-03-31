import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingLinks {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		//driver.findElement(By.linkText("Gmail")).click();
		WebElement gmailLink = driver.findElement(By.partialLinkText("Gmai"));
		System.out.println(gmailLink.isDisplayed());
		
		if(gmailLink.isDisplayed())
			gmailLink.click();
		
		
	}

}
