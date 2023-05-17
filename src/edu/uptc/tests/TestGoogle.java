package edu.uptc.tests;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {
	private WebDriver driver;
		
	@Before
	public void setUp() {
		System.out.println("Inicio de prueba");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
	}
	
	@Test
	public void testSignIn() {
		WebElement elem = driver.findElement(By.id("user-name"));
		elem.click();
		elem.sendKeys("standard_user");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		elem= driver.findElement(By.id("password"));
		elem.sendKeys("secret_sauce");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		elem=driver.findElement(By.id("login-button"));
		elem.click();
	}
	
	
	
	
}

