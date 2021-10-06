package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import java.util.List;

public class RediffLoginpage {
	WebDriver driver;
	public  RediffLoginpage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	 
	By username=By.xpath("//input[@id='login1']");
	By password=By.xpath("//input[@id='password']");
	By signin=By.xpath("//input[@class='signinbtn']");
	
	public WebElement Email()
	{
		return (WebElement) driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Signin()
	{
		return driver.findElement(signin);
	}
	
}
