package qsp;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost");
		String title = driver.getTitle();
		assertEquals(title, "actiTIME - Login");	
		
		
		
		
		}

}
