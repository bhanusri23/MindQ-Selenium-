import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
				
		String searchTerm = "Selenium";
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(searchTerm);
		
		WebElement searchBtn = driver.findElement(By.className("lsb"));
		searchBtn.click();
		
		//driver.findElement(By.name("q")).sendKeys("Selenium");
		//driver.findElement(By.className("lsb")).click();
		
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains(searchTerm))
			System.out.println("Search is working fine");
		else
			System.out.println("Not working");
			
		
	}
	
	
	

}
