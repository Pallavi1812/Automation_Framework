package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class Signup_Main extends TestBase{
	
	public Signup_Main (){
		
	super();
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	static WebElement firstName;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	static WebElement lastName;
	
	@FindBy(xpath="//input[@type='email']")
	static WebElement emailaddress;
	
	@FindBy(xpath="//input[@type='tel']")
	static WebElement phonenumber;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	static WebElement gender;
	
	@FindBy(xpath="//select[@id='countries']")
	static WebElement countries;
	
	@FindBy(xpath="//select[@id='yearbox']")
	static WebElement year;
	
	@FindBy(xpath="//select[@placeholder='Month']")
	static WebElement month;
	
	@FindBy(xpath="//select[@id='daybox']")
	static WebElement day;
	
	@FindBy(xpath="//input[@id='firstpassword']")
	static WebElement password;
	
	@FindBy(xpath="//input[@id='secondpassword']")
	static WebElement secondpassword;
	
	@FindBy(xpath="//button[@id='submitbtn']")
	static WebElement submit;
	
	@FindBy(xpath="//input[@id='email']")
	static WebElement emailidforsignup;
	
	@FindBy(xpath="//img[@id='enterimg']")
	static WebElement arrowbutton;

	
	public static void signup() {
		emailidforsignup.sendKeys("pallavi@yopmail.com");
		arrowbutton.click();
		
		firstName.sendKeys("pallavi");
		lastName.sendKeys("Goel");
		emailaddress.sendKeys("pallavi123@yopmail.com");
		phonenumber.sendKeys("1234567890");
		gender.click();
		Select Country=new Select(countries);
		Country.selectByVisibleText("India");
		Select YR=new Select(year);
		YR.selectByVisibleText("1990");
		Select MON=new Select(month);
		MON.selectByVisibleText("December");
		Select DY=new Select(day);
		DY.selectByVisibleText("12");
		password.sendKeys("123456789");
		secondpassword.sendKeys("123456789");
		submit.click();
		
		
	}

	

}
