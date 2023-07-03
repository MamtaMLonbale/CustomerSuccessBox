/**
 * 
 */
package com.customersuccessboxpagess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.testpages.AddTeamMember;

/**
 * @author Mamta
 *
 */
public class myPortfolio {
	WebDriver driver = null;

	public myPortfolio(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnSetting() throws InterruptedException {
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//i[@class='fal fa-cog']"))).click().build().perform();
	}

	public teamManagement clickOnTeamManagenment() throws InterruptedException {
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Team Management"))).click().build().perform();
		return new teamManagement(driver);

	}
}
