package week2.day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click(); 
		driver.findElement(By.linkText("Find Leads")).click(); 
		driver.findElement(By.xpath("//ul[@class = 'x-tab-strip x-tab-strip-top']//span[text() = 'Phone']")).click();
	    driver.findElement(By.name("phoneNumber")).sendKeys("825348432342");
		driver.findElement(By.linkText("Find Leads")).click();  
		
		//WebElement LeadID = driver.findElement(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a[contains(@id,'ext-gen')][1]"));
		WebElement LeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'][1]"));
		//This element is not getting identified
		String value = LeadID.getText();
		System.out.println(value);
		
		LeadID.click();
		driver.findElement(By.linkText("Delete")).click();  
		driver.findElement(By.linkText("Find Leads")).click(); 
		
		WebElement LeadIdField = driver.findElement(By.xpath("//div[@class = 'x-tab-panel-bwrap']//div[@class = 'x-form-element']/input[1]"));
		LeadIdField.sendKeys("value");
	}

}
