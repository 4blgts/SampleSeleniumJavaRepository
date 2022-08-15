package sampleProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_addNewPayee {
	
	@Test
	public static void main(String[] args) {
		
	String payeeName = "AGY Corp";
	String payeeBankNumber = "12";
	String payeeBranchNumber = "1234";
	String payeeAccountNumber = "1234567";
	String payeeAccountSuffix = "12";
		
	
	automationFramework.Functions.openBrowser("https://www.demo.bnz.co.nz/client/");
	automationFramework.Functions.driver.findElement(By.xpath("//span[@class='js-main-menu-button-text']")).click();
	System.out.println("Clicked on Menu side bar");
	automationFramework.Functions.driver.findElement(By.xpath("//span[contains(text(), 'Payees')]")).click();
	System.out.println("Selected Payees");
	automationFramework.Functions.driver.findElement(By.xpath("//button[@class='Button Button--sub Button--translucid js-add-payee']")).click();
	System.out.println("Add a Payee button was clicked");
	
	//Populate details and submit.
	automationFramework.Functions.driver.findElement(By.xpath("//input[@id='ComboboxInput-apm-name']")).sendKeys(payeeName);
	automationFramework.Functions.driver.findElement(By.xpath("//span[contains (text(), 'Someone new')]")).click();
	System.out.println("Payee Name was populated with: " + payeeName);
	automationFramework.Functions.driver.findElement(By.xpath("//div/input[@id='apm-bank']")).sendKeys(payeeBankNumber);
	automationFramework.Functions.driver.findElement(By.xpath("//div/input[@id='apm-branch']")).sendKeys(payeeBranchNumber);
	automationFramework.Functions.driver.findElement(By.xpath("//input[@id='apm-account']")).sendKeys(payeeAccountNumber);
	automationFramework.Functions.driver.findElement(By.xpath("//div/input[@id='apm-suffix']")).sendKeys(payeeAccountSuffix);
	System.out.println("Payee Account Details were populated");
	automationFramework.Functions.driver.findElement(By.xpath("//div/label[contains(text(),'For you')]")).click();
	automationFramework.Functions.driver.findElement(By.xpath("//button[@class='js-submit Button Button--primary']")).click();
	System.out.println("Clicked Add Button");
	
	//Verify new Payee was added
	WebElement payee = automationFramework.Functions.driver.findElement(By.xpath("//p[@class='Avatar-title']/span[contains(text(),'"+payeeName+"')]"));
	boolean bool = payee.isDisplayed();
	Assert.assertEquals(true, bool);
	System.out.println("New Payee was successfully displayed");


}
}