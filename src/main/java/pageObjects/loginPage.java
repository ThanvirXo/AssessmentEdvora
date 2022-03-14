package pageObjects;

import org.openqa.selenium.*;

public class loginPage {	
	public WebDriver driver;
	By username=By.cssSelector("div [autocomplete='username']");
	By password=By.cssSelector("div [autocomplete='current-password']");
	By login=By.cssSelector("button[class='chakra-button css-yen36m']");
	
	
	
	public loginPage(WebDriver driver) {
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
	

}
