import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://epptest.vistajet.com/login");		
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
		
		WebElement tableWeb = driver.findElement(By.id("show_all"));
		Table table = new Table(tableWeb,driver);
	}

}
