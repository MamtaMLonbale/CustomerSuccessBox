package com.customersuccessboxpagess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class demo {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\eclipse-workspace\\selenium\\Resources\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		// WebDriver driver = new ChromeDriver();

		//driver.manage().timeouts().implicitlyWait(10, Timeouts.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://www.google.com");

		//driver.findElement(By.xpath("//div//input[id='input']")).sendKeys("Hello World"); //
		//driver.findElement(By.cssSelector("input#input")).sendKeys("Google doodle"); //

		WebElement root = driver.findElement(By.tagName("ntp-app"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		

		WebElement shoadowDom1 = (WebElement) js.executeAsyncScript("return argument[0].shadowRoot", root);
		WebElement searchBox = shoadowDom1.findElement(By.xpath("//div[@id='content']"));
		WebElement apptoolbar = searchBox.findElement(By.xpath("//*[@id='realbox']"));
		WebElement inputbox = apptoolbar.findElement(By.xpath("//*[@id='inputWrapper']"));

		inputbox.findElement(By.xpath("//input[@id='input']")).sendKeys("Google doodle");

	}
}
