package paralleltests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import user.User;

public class ParallelReportTest 
{
	private WebDriver driver;
	private User user;
	private MenuReports MenuReports;
	
	@Before
	public void setUp() throws Exception{
		//create and login
		this.user = new User("firefox","aaa", "VistaJet01");		
		this.user.login();
		this.driver= this.user.getDriver();
		
		this.MenuReports = new MenuReports(user.getDriver());		
	}
	
	@After
	public void tearDown() throws Exception{
		this.user.getDriver().quit();
	}
	
	@Test
	public void TestBirhdayReport(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		MenuReports.clickMenuReports();
		MenuReports.getClickItemMenuBirthdayReport();
		long start = System.currentTimeMillis();
		MenuReports.clickItemMenuBirthdayReport();
		assertEquals("Employee Portal: Birthday Report", driver.getTitle());
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("birthday_report_processing")));
		long finish = System.currentTimeMillis();
		long totalTime = finish - start;
		System.out.println("BirthdayReport: " + totalTime + " milliseconds");
	}
	
	@Test
	public void TestCostCenterReport(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		MenuReports.clickMenuReports();
		MenuReports.getClickItemMenuChangesInPositionsReports();
		long start = System.currentTimeMillis();
		MenuReports.clickItemMenuChangesInPositionsReports();
		assertEquals("Employee Portal: Changes In Positions Report", driver.getTitle());
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("changes_in_positions_report_processing")));
		long finish = System.currentTimeMillis();
		long totalTime = finish - start;
		System.out.println("ChangesInPositionsReport: " + totalTime + " milliseconds");
	}

	
	@Test 
	public void a()
	{
		System.out.println("ReportA");
	}  
    
	@Test 
	public void b()
	{
		System.out.println("ReportB");
	}
}
