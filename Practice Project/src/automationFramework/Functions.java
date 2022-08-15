package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Functions {

	public static String driverPath ="C";
	public static WebDriver driver;
	public static String url;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		
	@Test
	public static void openBrowser(String url){
		
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath+"/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Navigating to " + url);
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	
	}
}