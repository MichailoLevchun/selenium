package com.epam.lab.hw2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailTest {
	@Test
	public void testSendLetter() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		WebElement mail = driver.findElement(By.xpath("id('identifierId')"));
		mail.sendKeys("abbad5431" + Keys.ENTER);
		WebElement psword = driver.findElement(By.xpath("//input[@name='password']"));
		psword.sendKeys("123rty789" + Keys.ENTER);
		driver.findElement(By.cssSelector("div.T-I.J-J5-Ji.T-I-KE.L3")).click();
		driver.findElement(By.cssSelector("div.wO.nr.l1 > textarea")).sendKeys("e632509@nwytg.net");
		driver.findElement(By.cssSelector("input.aoT")).sendKeys("Tema dlya lysta");
		driver.findElement(By.xpath("//div[@role = 'textbox']")).sendKeys("Ya mayu kota");
		driver.findElement(By.xpath("//div[contains(@data-tooltip,'Надіслати ‪(Ctrl –Enter)‬')]")).click();
		driver.quit();
	}
}
