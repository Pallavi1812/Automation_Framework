import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.Signin;

public class Sign_negativeCase extends TestBase {
	
	public void Sign_negativeCase() {
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
  return new Object[][] {{ "pallavigoel@yopmail.com", "Pro@12345678" }};
}

@Test(dataProvider="Authentication")
public static void Login(String username ,String password) throws InterruptedException {
  String error= Signin.negativeSignin(username, password);
  System.out.println(error);
  Assert.assertEquals(error, "Invalid User Name or PassWord");
   
}

@AfterMethod
public static void tearDown() {
	driver.close();

}

}
