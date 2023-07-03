package com.qa.testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddTeamMember {

	public static void main(String[] args) throws InterruptedException 
	{
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\eclipse-workspace\\selenium\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ta.staging.customersuccessbox.com/settings/team-management");
		driver.findElement(By.className("bg-input el-input el-input--small")).sendKeys("peter");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jenkins@customersuccessbox.org");
		
	}

	public void clickOnAddTeamMember() {
		// TODO Auto-generated method stub
		//Actions action=new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//button[@class='add-model-btn mt15']"))).click().build().perform();
	
		
	}
}
