import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import Base.TestBase;
import Pages.Signin;


public class Sign_in extends TestBase {
	
	public void Sign_in() {
		PageFactory.initElements(driver, this);
	}



@BeforeMethod
public static void Setup() throws IOException, InterruptedException {
	initialization();
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\TestingSite\\src\\main\\java\\Data\\chromedriver.exe");
//	 driver = new ChromeDriver();
	Thread.sleep(1000);
	Signin Login = new Signin();
}

@DataProvider(name = "Authentication")
  public static Object[][] credentials() {
  return new Object[][] {{ "pallavi@yopmail.com", "Pro@12345678" }};
}

@Test(dataProvider="Authentication")
public static void Login(String username ,String password) throws InterruptedException {
   String title= Signin.signIn(username, password);
   Assert.assertEquals(title, "SignIn");	
}

@AfterMethod
public static void tearDown() {
	driver.close();

}}
