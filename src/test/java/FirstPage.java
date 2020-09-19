import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import Base.TestBase;
import Pages.FirstScreen;

public class FirstPage extends TestBase {

	//static WebDriver driver;

	public FirstPage() throws IOException {
       super();
		PageFactory.initElements(driver, this);
	}

	@BeforeMethod
	public static void Setup() throws IOException, InterruptedException {
		initialization();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\TestingSite\\src\\main\\java\\Data\\chromedriver.exe");
//		 driver = new ChromeDriver();
		Thread.sleep(1000);
		FirstScreen Firstpage = new FirstScreen();
	}

	@Test
	public static void FirstPageTest1() throws InterruptedException {
		boolean logo = FirstScreen.provideEmail();
		Assert.assertTrue(logo);

	}

	@AfterMethod
	public static void tearDown() {
		driver.close();

	}

}
