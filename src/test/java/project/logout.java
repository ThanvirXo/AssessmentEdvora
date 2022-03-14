package project;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.logoutPage;
import resources.base;

public class logout extends base{
	public static Logger log=LogManager.getLogger(logout.class.getName());
	public WebDriver driver;
	
	@BeforeTest
	public void begin() throws IOException {
		driver=initializeDriver();
		log.info("test case number-5");
		driver.get(prop.getProperty("url"));
		log.info("url is hit");
		driver.manage().window().maximize();
	}
	@Test
	public void logoutU() throws InterruptedException {
		logoutPage lg=new logoutPage(driver);
		log.info("Expected result: User is able to logout");
		lg.username().sendKeys("vir7");
		lg.password().sendKeys("vir7");
		lg.submit().click();
		log.info("User is logged in");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		lg.logoutUser().click();
		log.info("Actual result: User is able to logout");
		log.fatal("Test success");
		driver.close();
	}
}
