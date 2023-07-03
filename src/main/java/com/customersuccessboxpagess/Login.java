package com.customersuccessboxpagess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login
{    
	WebDriver driver;
       public Login(WebDriver driver)
        { 
        	this.driver=driver;
        }
        public void typeEmailId()
        {
        	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("joan@customersuccessbox.org");
        }
		public void typePassword()
		{
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ideliversuccess");	
		}
		public myPortfolio clickOnLoginButton() throws InterruptedException
		{
			Thread.sleep(2000);
			Actions action=new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//button[@type='submit']"))).click().build().perform();
			return new myPortfolio(driver);
		}
		
		
		
}
