package com.hellokoding.account.web;


import static org.junit.Assert.assertTrue;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UserControllerTest{

	    private static WebDriver driver;

	   @BeforeClass
	    public static void setUp(){
	    	System.out.println("start test");
	        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	        driver = new ChromeDriver();   
	    }
	    @Test
	    public void testChromeSelenium() throws InterruptedException {
	        driver.get("http://localhost:8080");
	        driver.findElement(By.name("username")).sendKeys("user_01");
	        driver.findElement(By.name("password")).sendKeys("12345678");
	        Thread.sleep(2000);
	        driver.findElement(By.id("login")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.id("logoutForm"));
	    }	

	    @AfterClass
	    public static void cleanUp(){
	        if (driver != null) {
	            driver.close();
	            driver.quit();
	            System.out.println("Test success ");
	        }
	    }
	
}
