package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerPage {
	public WebDriver driver;
	By register=By.xpath("//button[@class='chakra-button css-33x21s']");
	By createUser=By.cssSelector("input[autocomplete*='username']");
	By createPassword=By.cssSelector("input[autocomplete='current-password']");
	By createAccount=By.cssSelector("button[class='chakra-button css-yen36m']");
	By logIn=By.cssSelector("button[class='chakra-button css-1edauu1']");
			
	public registerPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement register() {
		return driver.findElement(register);
	}
	public WebElement Createuser() {
		return driver.findElement(createUser);
	}
	public WebElement Createpassword() {
		return driver.findElement(createPassword);
	}
	public WebElement createAccount() {
		return driver.findElement(createAccount);
	}
	public WebElement loginPageButton() {
		return driver.findElement(logIn);
	}
}

