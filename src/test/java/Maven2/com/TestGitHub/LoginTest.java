package Maven2.com.TestGitHub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver; 
	
	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "D:\\Somesh data\\SeleniumWebDriver\\OldVersionOfDrivers\\chromedriver2.36.exe");
		driver=new ChromeDriver();
		
		
	}
	
	@Test
	public void doLogin(){
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("9028549561");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("9604335555");
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
		System.out.println("Ganpati bappa moraya");
			}

	@AfterTest
	public void tearDown(){
		driver.quit();
		
	}
}
