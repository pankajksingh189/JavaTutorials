package basicCode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class MultipleWindows {


	public static void main(String[] args) {
	
		// Opens Firefox Browser
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("http://google.com");
		
		//Opens IE Browser
		
		WebDriver driver2 = new InternetExplorerDriver();
		driver2.get("http://bbc.com");
		
		// Opens Chrome Browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Rajesh\\Selenium\\chromedriver_win32_2.1\\chromedriver.exe");
		WebDriver driver3 = new ChromeDriver();
		driver3.get("http://gmail.com");
		
		driver3.close();
		driver2.close();
		driver1.close();
		

	}

}
