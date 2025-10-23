package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https:www.facebook.com"); driver.manage().window().maximize();
		  //driver.close();
		 
		/*
		 * FirefoxDriver driver1 = new FirefoxDriver();
		 * driver1.get("https:www.youtube.com"); driver1.manage().window().maximize();
		 * driver1.close();
		 */
		  
		 driver.findElement(By.id("email")).sendKeys("xxx@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("xxxx");
		 //driver.findElement(By.name("login")).click();
		 driver.findElement(By.linkText("Create new account")).click();
		 
		  
	}

}
