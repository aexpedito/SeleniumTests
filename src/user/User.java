package user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class User 
{
	private String login;
	private String password;
	private WebDriver driver; //one driver per user
	
	public User(String driver, String login, String password)
	{
		this.login = login;
		this.password = password;
		if(driver.equals("firefox"))
		{
			this.driver= new FirefoxDriver();
		}
		else if(driver.equals("chrome"))
		{
			this.driver= new ChromeDriver();
		}
		else if(driver.equals("ie"))
		{
			this.driver= new FirefoxDriver();
		}
		else //default is firefox
		{
			this.driver= new FirefoxDriver();
		}
	}
	
	public void login()
	{
		//loga no sistema
		driver.get("http://192.168.201.127:8084/login");		
		//driver.get("http://192.168.201.101:8085/login");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.id("inputEmail"));
		login.sendKeys(this.login);		
		WebElement password = driver.findElement(By.id("inputPassword"));
		password.sendKeys(this.password);		
		WebElement buttonLogin = driver.findElement(By.cssSelector("input[type='submit'][value='Login']"));		
		buttonLogin.click();
	}
	
	public String getLogin()
	{
		return this.login;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	public WebDriver getDriver()
	{
		return this.driver;
	}
}


