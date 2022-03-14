package project;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.loginPage;
import pageObjects.settings;
import resources.base;


public class login extends base{
	
	public WebDriver driver;
	public WebDriverWait w;
	public static Logger log=LogManager.getLogger(login.class.getName());
	@BeforeTest
	public void start() throws IOException {
		driver=initializeDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void loginPage() throws InterruptedException {
		log.info("Test case number-2(user login and editing settings");
		driver.get(prop.getProperty("url"));
		log.info("url is hit");
		log.info("Expected result: user logged in successfully with the account created");
		loginPage l=new loginPage(driver);
		l.username().sendKeys("vir7");
		l.password().sendKeys("vir7");
		l.submit().click();
		log.info("Actual result: user logged in successfully with the account created");
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		settings st=new settings(driver);
		
		Thread.sleep(2000);
		log.info("Test case number-3");
		log.info("Expected result: User able to edit their profile");
		st.profileEdit().click();
		st.editName().sendKeys("Thanvir Ibrahim");
		st.date().sendKeys("11102000");
		st.gender().selectByIndex(2);
		st.mobileNumber().sendKeys("9384687587");
		st.address().sendKeys("address");
		st.savePro().click();
		log.info("Actual result: User successfully edited their profile");
		log.fatal("Test Success");
		
		
		Thread.sleep(2000);
		log.info("test case number-4");
		log.info("Actual result: user not able to change password and screenshot has been attached in reports");
		st.editPass().click();
		st.editPass().click();
		st.newPass().sendKeys("vir7");
		log.info("Riderected to anoter page");
		log.info("Screenshot has been attached");
		}
		
		@AfterTest
		public void close() {
		driver.close();
	}
}

