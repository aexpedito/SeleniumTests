import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TableTest 
{
	Table table;
	WebDriver driver;
	
	@Before
	public void setUp()
	{
		this.driver = new FirefoxDriver();
		driver.get("http://192.168.201.127:8084/login");		
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.id("inputEmail"));
		login.sendKeys("aaa");
		
		WebElement password = driver.findElement(By.id("inputPassword"));
		password.sendKeys("VistaJet01");
		
		WebElement buttonLogin = driver.findElement(By.cssSelector("input[type='submit'][value='Login']"));		
		buttonLogin.click();
		
		WebElement adminMenuItem = driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/div[2]/div[2]/ul[1]/li[2]/a"));//Click on Admin
		WebElement costCenterItem = driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/div[2]/div[2]/ul[1]/li[2]/ul/li[14]/a"));//Click on Cost centers
		assertEquals("Employee Portal: Home", driver.getTitle());
		adminMenuItem.click();
		costCenterItem.click();		
	}
	
	@After
	public void tearDown()
	{
		
	}

	@Test
	public void findRowInTable() 
	{
		
	}
	
	@Test
	public void test00() 
	{
		WebElement tableWeb = driver.findElement(By.id("show_all"));
		this.table = new Table(tableWeb,driver,"database.db","TABLE","coluna1","coluna2");
		//assertEquals("CREATE TABLE IF NOT EXISTS \"TABLE\"(");
	}

}
