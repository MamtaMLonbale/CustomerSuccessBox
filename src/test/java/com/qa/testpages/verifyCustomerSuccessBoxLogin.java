/**
 * 
 */
package com.qa.testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.customersuccessboxpagess.Login;
import com.customersuccessboxpagess.LunchBrowser;
import com.customersuccessboxpagess.myPortfolio;
import com.customersuccessboxpagess.teamManagement;


/**
 * @author Mamta
 *
 */
public class verifyCustomerSuccessBoxLogin {
	Login l1 = null;
	myPortfolio s = null;
	teamManagement a = null;

	// @BeforeTest
	public void setUp() {
		LunchBrowser l = new LunchBrowser();
		l.lunchCustomerSuccessBox();
	}

	@Test(priority = 0)
	void validLogin() throws InterruptedException {
		LunchBrowser l = new LunchBrowser();
		l1 = l.lunchCustomerSuccessBox();
		l1.typeEmailId();
		l1.typePassword();
		s = l1.clickOnLoginButton();

	}

	@Test(priority = 1)
	void validSetting() throws InterruptedException {
		s.clickOnSetting();
		a = s.clickOnTeamManagenment();
	}

	@Test(priority = 2)
	void validTeamMember() throws InterruptedException {
		a.clickOnAddTeamMember();
		a.enterFName();
		a.enterLastName();
		a.enterEmailId();
		a.enterPhoneNo();
		a.clickOnCheckBox();
		//a.selectProfile();
		a.add();
		a.clickOnConfirm();

	}

}
