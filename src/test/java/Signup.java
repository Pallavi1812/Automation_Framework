import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;

import Pages.Signup_Main;

public class Signup extends TestBase {
	
	static Signup_Main su;
   static Logger log = Logger.getLogger(Signup.class);

	
	public Signup() throws IOException {
	       super();
			PageFactory.initElements(driver, this);
			}
	

		@BeforeMethod
		public static void Setup() throws IOException, InterruptedException {
			log.info("************Testcase start");
			initialization();
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\TestingSite\\src\\main\\java\\Data\\chromedriver.exe");
//			 driver = new ChromeDriver();
			Thread.sleep(1000);
			su=new Signup_Main();
			log.warn("Warning messgae");
			log.fatal("Fatal message");
			log.debug("This is debug message");
			log.info("*****Testcase End***************");
		}

		@Test
		public static void Sign_Up() throws InterruptedException {
			log.info("************Testcase start");
		 Signup_Main.signup();
		 log.warn("Warning messgae");
			log.fatal("Fatal message");
			log.debug("This is debug message");
			log.info("*****Testcase End***************");
		

		}

		@AfterMethod
		public static void tearDown() {
			log.info("************Testcase start");
			driver.close();
			
			log.warn("Warning messgae");
			log.fatal("Fatal message");
			log.debug("This is debug message");
			log.info("*****Testcase End***************");
		
			

		}


}
