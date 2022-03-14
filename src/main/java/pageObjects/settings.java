package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class settings {
	public WebDriver driver;
	
	By editProfile=By.xpath("(//button[@type='button'][1])[1]");
	By fullname=By.xpath("//input[@name='fullname']");
	By dob=By.xpath("//input[@name='dateOfBirth']");
	By mobileNum=By.xpath("//input[@name='mobileNumber']");
	By add=By.cssSelector("input[name='address']");
	By saveProfile=By.xpath("//button[@class='chakra-button css-8d7f11'][1]");	
	By editPass=By.xpath("(//button[@class='chakra-button css-1hdzu0m'])[2]");
	By enterNewPass=By.cssSelector("input[name*='Password']");
	By savePass=By.xpath("//div/button[text()='Save'][2]");
	
	public settings(WebDriver driver) {
		this.driver=driver;

	}
	
	public WebElement profileEdit() {
		return driver.findElement(editProfile);
	}
	public WebElement editName() {
		return driver.findElement(fullname);
	}
	public WebElement date() {
		return driver.findElement(dob);
	}
	
	public Select gender() {
		WebElement staticDrop=driver.findElement(By.xpath("//select[@class='chakra-select css-vx8fqt']"));
		Select sd=new Select(staticDrop);
		return sd;
	}
	public WebElement mobileNumber() {
		return driver.findElement(mobileNum);
	}
	public WebElement address() {
		return driver.findElement(add);
	}
	public WebElement savePro() {
		return driver.findElement(saveProfile);
	}
	
	public WebElement editPass() {
		return driver.findElement(editPass);
	}
	public WebElement newPass() {
		return driver.findElement(enterNewPass);
	}
	
	public WebElement savePassword() {
		return driver.findElement(savePass);
	}
	
	
	
}
