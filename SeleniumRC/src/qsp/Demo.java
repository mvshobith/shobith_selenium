package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverBackedSelenium selenium=new
				WebDriverBackedSelenium(driver,"http://localhost");
		
		selenium.open("/login.do");
		selenium.type("id=username", "admin");
		selenium.type("name=pwd", "manager");
		selenium.click("id=loginButton");

	}

}
