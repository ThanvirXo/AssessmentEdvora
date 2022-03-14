package project;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.registerPage;
import pageObjects.settings;
import resources.base;

public class registration extends base  {
	public static Logger log=LogManager.getLogger(registration.class.getName());
	public WebDriver driver;
	public WebDriverWait w;
	
	
	@BeforeTest
	public void begin() throws IOException {
		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Test case Number-1");
		log.info("url is Hit");
	}
	@Test
	public void register() throws InterruptedException {
		registerPage rp=new registerPage(driver);
		rp.register().click();
		log.info("switched to registration form");
		Thread.sleep(2000);
		rp.Createuser().sendKeys("vir7");
		log.error("User not able to use special characters");
		log.error("Bug number-1");
		log.error("Bug title- Cannot use any combinations");
		log.info("to reproduce the bug"
				+ " go to the url "
				+ " "+ "1)click sign in"
				+ "2)type username with any special characters");
		log.error("Bug severity:Medium");
		log.error("Bug priority:Medium");
		rp.Createpassword().sendKeys("vir7");
		rp.createAccount().click();
		log.info("Account is created");
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		log.info("test success");
		log.info("Expected result:User able to create account");
		log.info("Actual result:user able to create account");
		
		driver.close();
		
		
	}
}
