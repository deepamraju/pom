package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import java.util.List;

import objectrepository.RediffLoginpage;

public class Loginapplication {
	

	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:\\ecllip\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpage rd=new RediffLoginpage(driver);
		rd.Email().sendKeys("hello");
		rd.password().sendKeys("hello");
		rd.Signin().click();
		
		
	}
}
