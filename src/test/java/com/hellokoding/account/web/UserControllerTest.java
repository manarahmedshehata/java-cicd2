package com.hellokoding.account.web;


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
	    public void testChromeSelenium() {
	        driver.get("http://localhost:8080");
	        driver.findElement(By.name("username")).sendKeys("test1234");
	        driver.findElement(By.name("password")).sendKeys("test1234");
	        driver.findElement(By.id("login")).click();
	        driver.findElement(By.id("logout")).click();
	    }

	    @AfterClass
	    public static void cleanUp(){
	        if (driver != null) {
	            driver.close();
	            driver.quit();
	        }
	    }
	
}
