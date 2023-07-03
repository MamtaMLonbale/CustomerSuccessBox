/**
 * 
 */
package com.customersuccessboxpagess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Mamta
 *
 */
public class teamManagement
 {

	WebDriver driver = null;

	public teamManagement
(WebDriver driver) {
		this.driver = driver;

	}

	public void clickOnAddTeamMember() throws InterruptedException {
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//button[contains(text(),'Add Team Member')])"))).click()
				.build().perform();

	}

	public void enterFName() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'First Name')]//following::input[1]")).sendKeys("john");
	}

	public void enterLastName() {
		driver.findElement(By.xpath("//div[contains(text(),'Last Name')]//following::input[1]")).sendKeys("Sharma");
	}

	public void enterEmailId() {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sharma@gmail.com");
	}

	public void enterPhoneNo() {
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("8734555666");
	}

	public void clickOnCheckBox() {
		driver.findElement(By.xpath("//span[@class='el-checkbox__inner']")).click();
	}
	/*public void selectProfile()
	{
		
		driver.findElement(By.xpath("//div[@class='el-select bg-input select-profile el-select--small']")).click();
		Select profile=new Select(driver.findElement(By.xpath("//span[contains(text(),'Developer')]//following::li[@class='el-select-dropdown__item selected']")));
		
		//profile.selectByVisibleText("Developer");
		profile.selectByIndex(1);

	}*/

	public void add() {
		driver.findElement(By.xpath("(//button[contains(text(),'Add') and @class='save-btn'])")).click();

	}

	public void clickOnConfirm() {
		driver.findElement(By.xpath("//button[@class='save-btn btn-compact']")).click();
	}
}
