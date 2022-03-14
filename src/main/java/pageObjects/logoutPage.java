package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logoutPage {
	public WebDriver driver;
	By username=By.cssSelector("div [autocomplete='username']");
	By password=By.cssSelector("div [autocomplete='current-password']");
	By login=By.cssSelector("button[class='chakra-button css-yen36m']");
	By logout=By.xpath("(//button[normalize-space()='Logout'])[1]");
	
	public logoutPage(WebDriver driver) {
		this.driver=driver;
		
		
	}
	public WebElement username() {
		 return driver.findElement(username);
	}
	public WebElement password() {
		return driver.findElement(password);
		
	}
	public WebElement submit() {
		return driver.findElement(login);
	}
	
	public WebElement logoutUser() {
		return driver.findElement(logout);
		
	}
	
}
