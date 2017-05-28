package basicCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class LoginForm {


	public static void main(String[] args) {
		
		// Step1
		System.setProperty("webdriver.chrome.driver","C:\\Rajesh\\Selenium\\chromedriver_win32_2.1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		
		// Step 2 - WebElements have control on all html tags
		
		WebElement username = driver.findElement(By.id("Email")); 
		username.sendKeys("rajesh.reddy.acc"); // sendkeys is to enter text in the field.
		
		WebElement password = driver.findElement(By.name("Passwd"));
		password.sendKeys("Test!234");
		
		WebElement submit = driver.findElement(By.xpath("//*[@id='signIn']"));
		submit.click();
		
		//Step3
		//driver.close();
		
		
		/*WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.findElement(By.id("Email")).sendKeys("rajesh.reddy.acc");
		driver.findElement(By.name("Passwd")).sendKeys("Test!234");
		driver.findElement(By.xpath("//*[@id='signIn']")).click(); */
		
		
		
		
		

	}

}
