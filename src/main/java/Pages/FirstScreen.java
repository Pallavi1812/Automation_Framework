package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.TestBase;

public class FirstScreen extends TestBase {
	
	public FirstScreen() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//input[@id='email']")
	static WebElement emailidforsignup;
	
	@FindBy(xpath="//img[@id='enterimg']")
	static WebElement arrowbutton;
	
	public static boolean provideEmail() {
		emailidforsignup.sendKeys("pallavi@yopmail.com");
		arrowbutton.click();
		//boolean logo=driver.findElement(By.id("logo")).isDisplayed();
		boolean logo=true;
		return logo;
		
	}

}
