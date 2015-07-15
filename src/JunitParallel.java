import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JunitParallel 
{
	
	@Test  
	 public void test90() 
	 {      
	      Class[] cls={ParallelTest1.class,ParallelTest2.class };  

	      //Parallel among classes  
	      //JUnitCore.runClasses(ParallelComputer.classes(), cls);  

	      //Parallel among methods in a class  
	      JUnitCore.runClasses(ParallelComputer.methods(), cls);  

	      //Parallel all methods in all classes  
	      //JUnitCore.runClasses(new ParallelComputer(true, true), cls);     
	 } 

	
	 public static class ParallelTest1 
	 {  
		 WebDriver driver = new FirefoxDriver();
		 @Before
			public void setUp() throws Exception {
				driver.get("http://192.168.201.127:8084/login?");	
				driver.manage().window().maximize();
				WebElement login = driver.findElement(By.id("inputEmail"));
				login.sendKeys("aaa");
				
				WebElement password = driver.findElement(By.id("inputPassword"));
				password.sendKeys("VistaJet01");
				
				WebElement buttonLogin = driver.findElement(By.cssSelector("input[type='submit'][value='Login']"));		
				buttonLogin.click();
			} 

			@After
			public void tearDown() throws Exception {
				driver.quit();
			}
			
			@Test public void test04()
			{}
			
			@Test public void test05()
			{}
			
			@Test public void test06()
			{}
	  }  

	   public static class ParallelTest2 
	   {  
		   WebDriver driver = new FirefoxDriver();
			 @Before
				public void setUp() throws Exception {
					driver.get("http://192.168.201.101:8084/login?override=devtesthr1");		
					driver.manage().window().maximize();
					WebElement login = driver.findElement(By.id("inputEmail"));
					login.sendKeys("aaa");
					
					WebElement password = driver.findElement(By.id("inputPassword"));
					password.sendKeys("VistaJet01");
					
					WebElement buttonLogin = driver.findElement(By.cssSelector("input[type='submit'][value='Login']"));		
					buttonLogin.click();
				} 

				@After
				public void tearDown() throws Exception {
					driver.quit();
				}
				
				@Test public void test00()
				{}
				
				@Test public void test01()
				{}
				
				@Test public void test03()
				{}
	   } 
}
