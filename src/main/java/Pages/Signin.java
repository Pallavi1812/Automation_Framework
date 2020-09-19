package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Signin extends TestBase {
	
	public Signin () {
		super();
			PageFactory.initElements(driver, this);
			
		}
		
	@FindBy(xpath="//button[@id='btn1']")
	static WebElement Signin ;
	
	@FindBy(xpath="//input[@ng-model='Email']")
     static WebElement Email;
	
	@FindBy(xpath="//input[@ng-model='Password']")
    static WebElement Password;	
	
	@FindBy(xpath="//img[@id='enterbtn']")
	static WebElement Submit;
	
	@FindBy(xpath="//label[@id='errormsg']")
	static WebElement errormsg;
	
	public static String signIn(String username, String password) {
		Signin.click();
		Email.sendKeys(username);
		Password.sendKeys(password);
		Submit.click();
		String title=driver.getTitle();
		return title;
	}
	
	public static String negativeSignin(String username, String password) {
		Signin.click();
		Email.sendKeys(username);
		Password.sendKeys(password);
		Submit.click();
		String error=errormsg.getText();
		return error;
		
	}


}
