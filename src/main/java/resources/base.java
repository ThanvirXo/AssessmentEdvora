package resources;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException {
		prop= new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\thanv\\eclipse-workspace\\Assessment\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\thanv\\Documents\\chromedriver.exe");
			ChromeOptions opt=new ChromeOptions();
			driver=new ChromeDriver(opt);
		}
		else {
			System.setProperty("webdirver.firefox.driver", "C:\\Users\\thanv\\Documents\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		return driver;
		
	}
	public void getScreenshotPath(String methodName,WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"\\reports\\"+methodName+".png";
		FileUtils.copyFile(source,new File(path));
	}
}
