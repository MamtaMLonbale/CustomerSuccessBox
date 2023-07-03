package com.customersuccessboxpagess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LunchBrowser {
	WebDriver driver = null;

	public Login lunchCustomerSuccessBox() {
		WebDriverManager.chromedriver().driverVersion("103.0.5060.66").setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ta.staging.customersuccessbox.com");
		return new Login(driver);
	}
}
