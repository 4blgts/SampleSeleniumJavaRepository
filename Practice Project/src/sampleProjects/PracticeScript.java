package sampleProjects;

import org.openqa.selenium.By;

public class PracticeScript {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		automationFramework.Functions.openBrowser("https://balsamhill.com");
		automationFramework.Functions.driver.findElement(By.xpath("//div/a[@class = 'title title--lv1-menubar nav-menu-1']")).click();
		System.out.println("Selected Artificial Christmas Tree");
		automationFramework.Functions.driver.findElement(By.xpath("//div/span[contains (text(),'Decoration Options')]")).click(); 
		System.out.println("Clicked Decoration Options");
		automationFramework.Functions.driver.findElement(By.xpath("//span[@class='facet-name peri-header']/span[contains (text(), 'Undecorated')]")).click();
		System.out.println("Clicked Undecorated");
		automationFramework.Functions.driver.findElement(By.xpath("//div/select[@id = 'sortOptions2']")).click();
		automationFramework.Functions.driver.findElement(By.xpath("//div/select/option[@value = 'priceSort-asc']")).click();
		System.out.println("Sorted from Price Low to High");
		String item1 = automationFramework.Functions.driver.findElement(By.xpath("//div[@data-sku='5022199']/a/div[3]/span")).getText();
		System.out.println("First item is " + item1);
		String item3 = automationFramework.Functions.driver.findElement(By.xpath("//div[@data-sku='5021444']/a/div[3]/span")).getText();
		System.out.println("Second item is "+ item3);
		String item4 = automationFramework.Functions.driver.findElement(By.xpath("//div[@data-sku='2807867']/a/div[3]/span")).getText();
		System.out.println("Second item is " + item4);
		System.out.println("Test Complete");
		

	}

}
