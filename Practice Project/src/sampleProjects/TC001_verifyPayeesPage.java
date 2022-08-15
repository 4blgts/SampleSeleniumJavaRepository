package sampleProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_verifyPayeesPage {
	
	@Test
	public static void main(String[] args) {
		
	
	automationFramework.Functions.openBrowser("https://www.demo.bnz.co.nz/client/");
	automationFramework.Functions.driver.findElement(By.xpath("//span[@class='js-main-menu-button-text']")).click();
	System.out.println("Clicked on Menu side bar");
	automationFramework.Functions.driver.findElement(By.xpath("//span[contains(text(), 'Payees')]")).click();
	System.out.println("Selected Payees");
	WebElement payee = automationFramework.Functions.driver.findElement(By.xpath("//span[contains(text(), 'Payees')]"));
	boolean bool = payee.isDisplayed();
	Assert.assertEquals(true, bool);
	System.out.println("Payees Page was successfully displayed");
	
	
	
	
	
	

}
}