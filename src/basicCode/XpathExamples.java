package basicCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class XpathExamples {


	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Rajesh\\Selenium\\chromedriver_win32_2.1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://gmail.com");
		
		// Absolute xpath - Username
		//driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/form/div[1]/input")).sendKeys("rajesh");
		
		//Relative xpath using name attribute - Username
		//driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("rajesh");
		//driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("rajesh");
		
		// Absolute xpath - Learn More link		
		//driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[3]/div[1]/p/a[2]")).click();
		
		// Relative xpath using href attribute - Learn More link
		//driver.findElement(By.xpath("//a[@href='http://mail.google.com/mail/help/intl/en/features.html']")).click();
		
		//About Gmail - email from Google
		String x = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[3]/div[1]/h5")).getText();
		System.out.println(x);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		

	}

}
