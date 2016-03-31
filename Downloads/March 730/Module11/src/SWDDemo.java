import org.openqa.selenium.firefox.FirefoxDriver;

public class SWDDemo {

	public static void main(String[] args) {
		//to open firefox browser
		FirefoxDriver driver = new FirefoxDriver();
		//to navigate to google site
		driver.get("http://google.com");
		//to get title of the page
		String title = driver.getTitle();
		System.out.println(title);
		//to check whether google page is opened or not  
		if(title.equalsIgnoreCase("Google"))
			System.out.println("Test is pass");
		else
			System.out.println("Test is fail");
		
		//to close current browser
		driver.close();
		
	}

}
