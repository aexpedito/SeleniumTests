package paralleltests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * @author Thiago Gaspar
 */
public class MenuReports implements MenuReportsMap {
	
private WebDriver driver;
	
	public MenuReports(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickMenuReports(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_REPORTS_MENU));
		we.click();
	}


	public WebElement getClickItemMenuCostCentersReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_COST_CENTERS_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickCostCentersReportItemMenu(){
		WebElement we = getClickItemMenuCostCentersReport();
		we.click();
	}
	
	public WebElement getClickItemMenuWorkDedicationReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_WORK_DEDICATION_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuWorkDedicationReport(){
		WebElement we = getClickItemMenuWorkDedicationReport();
		we.click();
	}
	
	public WebElement getClickItemMenuVacationsOverviewReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_VACATIONS_OVERVIEW_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuVacationsOverviewReport(){
		WebElement we = getClickItemMenuVacationsOverviewReport();
		we.click();
	}
	
	public WebElement getClickItemMenuBirthdayReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_BIRTHDAY_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuBirthdayReport(){
		WebElement we = getClickItemMenuBirthdayReport();
		we.click();
	}
	
	public WebElement getClickItemMenuLengthOfServicesReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_LENGTH_OF_SERVICES_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuLengthOfServicesReport(){
		WebElement we = getClickItemMenuLengthOfServicesReport();
		we.click();
	}
	
	public WebElement getClickItemMenuHeadCountReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_HEAD_COUNT_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuHeadCountReport(){
		WebElement we = getClickItemMenuHeadCountReport();
		we.click();
	}
	
	public WebElement getClickItemMenuFullTimeEquivalentFteReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_FULL_TIME_EQUIVALENT_FTE_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuFullTimeEquivalentFteReport(){
		WebElement we = getClickItemMenuFullTimeEquivalentFteReport();
		we.click();
	}
	
	public WebElement getClickItemMenuPayrollReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_PAYROLL_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuPayrollReport(){
		WebElement we = getClickItemMenuPayrollReport();
		we.click();
	}
	
	public WebElement getClickItemMenuCompensationReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_COMPENSATION_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuCompensationReport(){
		WebElement we = getClickItemMenuCompensationReport();
		we.click();
	}
	
	public WebElement getClickItemMenuVistaJetOrganizationCHartReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_VISTAJET_ORGANIZATION_CHART_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuVistaJetOrganizationCHartReport(){
		WebElement we = getClickItemMenuVistaJetOrganizationCHartReport();
		we.click();
	}
	
	public WebElement getClickItemMenuDutyReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_DUTY_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuDutyReport(){
		WebElement we = getClickItemMenuDutyReport();
		we.click();
	}
	
	public WebElement getClickItemMenuYearlyCrewReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_YEARLY_CREW_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuYearlyCrewReport(){
		WebElement we = getClickItemMenuYearlyCrewReport();
		we.click();
	}
	
	public WebElement getClickItemMenuExtraDaysReportMonth(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_EXTRA_DAYS_REPORT_MONTH_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuExtraDaysReportMonth(){
		WebElement we = getClickItemMenuExtraDaysReportMonth();
		we.click();
	}
	
	public WebElement getClickItemMenuExtraDaysReportQuarter(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_EXTRA_DAYS_REPORT_QUARTER_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuExtraDaysReportQuarter(){
		WebElement we = getClickItemMenuExtraDaysReportQuarter();
		we.click();
	}
	
	public WebElement getClickItemMenuExtraDaysReportYear(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_EXTRA_DAYS_REPORT_YEAR_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuExtraDaysReportYear(){
		WebElement we = getClickItemMenuExtraDaysReportYear();
		we.click();
	}
	
	public WebElement getClickItemMenuNextOfKinReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_NEXT_OF_KIN_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuNextOfKinReport(){
		WebElement we = getClickItemMenuNextOfKinReport();
		we.click();
	}
	
	public WebElement getClickItemMenuNextOfKinConfirmationReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_NEXT_OF_KIN_CONFIRMATION_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuNextOfKinConfirmationReport(){
		WebElement we = getClickItemMenuNextOfKinConfirmationReport();
		we.click();
	}
	
	public WebElement getClickItemMenuProbationReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_PROBATION_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuProbationReport(){
		WebElement we = getClickItemMenuProbationReport();
		we.click();
	}
	
	public WebElement getClickItemMenuCrewDocumentReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_CREW_DOCUMENT_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuCrewDocumentReport(){
		WebElement we = getClickItemMenuCrewDocumentReport();
		we.click();
	}
	
	public WebElement getClickItemMenuNewRecruitsReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_NEW_RECRUITS_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuNewRecruitsReport(){
		WebElement we = getClickItemMenuNewRecruitsReport();
		we.click();
	}
	
	public WebElement getClickItemMenuTerminationsReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_TERMINATIONS_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuTerminationsReport(){
		WebElement we = getClickItemMenuTerminationsReport();
		we.click();
	}
	
	public WebElement getClickItemMenuChangesInPositionsReports(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_CHANGES_IN_POSITIONS_REPORTS_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuChangesInPositionsReports(){
		WebElement we = getClickItemMenuChangesInPositionsReports();
		we.click();
	}
	
	public WebElement getClickItemMenuMonthlyCrewAirtimeReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_MONTHLY_CREW_AIRTIME_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuMonthlyCrewAirtimeReport(){
		WebElement we = getClickItemMenuMonthlyCrewAirtimeReport();
		we.click();
	}
	
	public WebElement getClickItemMenuYearlyCrewAirtimeReport(){
		WebElement we = driver.findElement(By.linkText(LINK_TEXT_YEARLY_CREW_REPORT_ITEM_MENU));
		return we;
	}
	
	public void clickItemMenuYearlyCrewAirtimeReport(){
		WebElement we = getClickItemMenuYearlyCrewAirtimeReport();
		we.click();
	}
}


