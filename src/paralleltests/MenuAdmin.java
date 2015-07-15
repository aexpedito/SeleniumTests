package paralleltests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * @author Thiago Gaspar
 */
public class MenuAdmin implements MenuAdminMap{
	
	private WebDriver driver;
	
	public MenuAdmin(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getClickMenuAdmin(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_ADMIN_MENU));
		return we;
	}
	
	public void clickMenuAdmin(){
		WebElement we = getClickMenuAdmin();
		we.click();
	}
	
	public WebElement getClickItemMenuVJLegalEntity(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_VJ_LEGAL_ENTITIY_ITEM));
		return we;
	}
	
	public void clickItemMenuVJLegalEntity(){
		WebElement we = getClickItemMenuVJLegalEntity();
		we.click();
	}
	
	public WebElement getClickItemMenuLocationsOffice(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_LOCATIONS_OFFICES_ITEM));
		return we;
	}
	
	public void clickItemMenuLocationsOffice(){
		WebElement we = getClickItemMenuLocationsOffice();
		we.click();
	}
	
	public WebElement getClickItemMenuContractGenerations(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_CONTRACT_GENERATIONS_ITEM));
		return we;
	}
	
	public void clickItemMenuContractGenerations(){
		WebElement we = getClickItemMenuContractGenerations();
		we.click();
	}
	
	public WebElement getClickItemMenuAircraftTypes(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_AIRCRAFT_TYPES_ITEM));
		return we;
	}
	
	public void clickItemMenuAircraftTypes(){
		WebElement we = getClickItemMenuAircraftTypes();
		we.click();
	}
	
	public WebElement getClickItemMenuJobFunctions(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_JOB_FUNCTIONS_ITEM));
		return we;
	}
	
	
	public void clickItemMenuJobFunctions(){
		WebElement we = getClickItemMenuJobFunctions();
		we.click();
	}
	
	public WebElement getClickItemMenuPerDiemTables(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_PER_DIEM_TABLES_ITEM));
		return we;
	}
	
	public void clickItemMenuPerDiemTables(){
		WebElement we = getClickItemMenuPerDiemTables();
		we.click();
	}
	
	public WebElement getClickItemMenuDepartments(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_DEPARTMENTS_ITEM));
		return we;
	}
	
	public void clickItemMenuDepartments(){
		WebElement we = getClickItemMenuDepartments();
		we.click();
	}
	
	public WebElement getClickItemMenuLocationsHomebases(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_LOCATIONS_HOMEBASES_ITEM));
		return we;
	}
	
	public void clickItemMenuLocationsHomebases(){
		WebElement we = getClickItemMenuLocationsHomebases();
		we.click();
	}
	
	public WebElement getClickItemMenuPayrollProvider(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_PAYROLL_PROVIDERS_ITEM));
		return we;
	}
	
	public void clickItemMenuPayrollProvider(){
		WebElement we = getClickItemMenuPayrollProvider();
		we.click();
	}
	
	public WebElement getClickItemMenuCrewDocumentCategories(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_CREW_DOCUMENT_CATEGORIES_ITEM));
		return we;
	}
	
	public void clickItemMenuCrewDocumentCategories(){
		WebElement we = getClickItemMenuCrewDocumentCategories();
		we.click();
	}
	
	public WebElement getClickItemMenuCrewDocumentTypes(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_CREW_DOCUMENT_TYPES_ITEM));
		return we;
	}
	
	public void clickItemMenuCrewDocumentTypes(){
		WebElement we = getClickItemMenuCrewDocumentTypes();
		we.click();
	}
	
	public WebElement getClickItemMenuTrainingMaterialCategories(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_TRAINING_MATERIAL_CATEGORIES_ITEM));
		return we;
	}
	
	public void clickItemMenuTrainingMaterialCategories(){
		WebElement we = getClickItemMenuTrainingMaterialCategories();
		we.click();
	}
	
	public WebElement getClickItemMenuCostCenters(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_COST_CENTERS_ITEM));
		return we;
	}
	
	public void clickItemMenuCostCenters(){
		WebElement we = getClickItemMenuCostCenters();
		we.click();
	}
	
	public WebElement getClickItemMenuCommunications(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_COMMUNICATIONS_ITEM));
		return we;
	}
	
	public void clickItemMenuCommunications(){
		WebElement we = getClickItemMenuCommunications();
		we.click();
	}
	
	public WebElement getClickItemMenuRolesPermissions(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_ROLES_PERMISSIONS_ITEM));
		return we;
	}
	
	public void clickItemMenuRolesPermissions(){
		WebElement we = getClickItemMenuRolesPermissions();
		we.click();
	}
	
	public WebElement getClickItemMenuImpersonate(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_IMPERSONATE_ITEM));
		return we;
	}
	
	public void clickItemMenuImpersonate(){
		WebElement we = getClickItemMenuImpersonate();
		we.click();
	}
	
	public WebElement getClickItemMenuSupport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_SUPPORT_ITEM));
		return we;		
	}
	
	public void clickItemMenuSupport(){
		WebElement we = getClickItemMenuSupport();
		we.click();
	}
	
	public WebElement getClickItemMenuAudit(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_AUDIT_ITEM));
		return we;
	}
	
	public void clickItemMenuAudit(){
		WebElement we = getClickItemMenuAudit();
		we.click();
	}
}

