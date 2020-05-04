import java.security.PublicKey;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class FacebookLoginTest {

	 static WebDriver driver;
	 
	 @BeforeClass
	 public void Setup(){
	 System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebdriver\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	 }
	 
	@Test 
	public void fblogin(){
		System.out.println("Executing login Test");
		driver.findElement(By.id("email")).sendKeys("mangesh.sontake@gmail.com");
	
		driver.findElement(By.name("pass")).sendKeys("mange");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	 }
	 
	 @AfterClass
	 @Test
		public void tearDown() {
			driver.quit();
		}
	 
}
