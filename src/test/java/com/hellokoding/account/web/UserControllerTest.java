package com.hellokoding.account.web;


import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class UserControllerTest{
//	 @Before
//	    public void prepare() {
//	        setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT); 
//	        //setBaseUrl("http://localhost:8080");
//	    }
//
//      @Test
//	    public void testLoginPage() {
	    	//fail("not");
//	    	assertEquals("t", "Q", "Q");
//	        beginAt("login"); 
//	        assertTitleEquals("Log in");
//	        assertLinkPresent("registration");//Create an account id
//	        clickLink("registration");
//	        assertTitleEquals("Create an account");
//	    }
	    
//	    @Test
//	    public void testHomePage() {
//	        beginAt("home.jsp"); 
//	        assertTitleEquals("Home");
//	        assertLinkPresent("login");
//	        clickLink("login");
//	        assertTitleEquals("Login");
//	    }

	    private static WebDriver driver;

	   @BeforeClass
	    public static void setUp(){
	    	System.out.println("start test");
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HassanM\\Desktop\\manar\\devops\\code\\registration-login-spring-xml-maven-jsp-mysql-master\\Java-CICD\\drivers\\chromedriver.exe");
	        driver = new ChromeDriver();   
	    }
//
	    @Test
	    public void testChromeSelenium() {
	        driver.get("http://localhost:8080");
	    
	    }

//	    @AfterClass
//	    public static void cleanUp(){
//	        if (driver != null) {
//	            driver.close();
//	            driver.quit();
//	        }
//	    }
	
}
