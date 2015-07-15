package paralleltests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import user.User;

public class ParallelAdminTest 
{
	private User user;
	private WebDriver driver;
	private MenuAdmin menuAdmin;

	@Before
	public void setUp() throws Exception{
		//create and login
		this.user = new User("firefox","aaa", "VistaJet01");		
		this.user.login();
		this.driver= this.user.getDriver();
		
		this.menuAdmin = new MenuAdmin(user.getDriver());		
	}
	
	@After
	public void tearDown() throws Exception{
		this.user.getDriver().quit();
	}
	
	@Test
	public void testAircraftTypes(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		menuAdmin.clickMenuAdmin();
		menuAdmin.getClickItemMenuAircraftTypes();
		long start = System.currentTimeMillis();
		menuAdmin.clickItemMenuAircraftTypes();
		assertEquals("Employee Portal: List Aircraft Type", driver.getTitle());
		AircraftTypeCreate aircraftTypes = new AircraftTypeCreate(driver);
		wait.until(ExpectedConditions.elementToBeClickable(aircraftTypes.getClickFirstOptionSearch()));
		long finish = System.currentTimeMillis();
		long totalTime = finish - start;
		System.out.println("AircraftTypes: " + totalTime + " milliseconds");
	}

	
	@Test 
	public void a()
	{
		System.out.println("AdminA");
	}  
    
	@Test 
	public void b()
	{
		System.out.println("AdminB");
	}
}
