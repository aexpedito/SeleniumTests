

import java.util.List;

import org.apache.jasper.runtime.TagHandlerPool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Table 
{
	private int lines;
	private int colums;
	private Object[][] table; // line 0 = <th>, line 1 ... n = <td>
	
	public Table(WebElement table, WebDriver driver)
	{
		WebElement tagTHead = table.findElement(By.tagName("thead")); // get table header
		WebElement tagTBody = table.findElement(By.tagName("tbody")); // get table body				
		
		List<WebElement> headRows = tagTHead.findElements(By.tagName("tr")); //get table rows inside thead
		List<WebElement> bodyRows = tagTBody.findElements(By.tagName("tr")); //get table rows inside tbody
		
		List<WebElement> th = headRows.get(0).findElements(By.tagName("th"));
		
		this.lines = headRows.size()+bodyRows.size();
		this.colums = th.size();
		System.out.println(this.lines);
		System.out.println(this.colums);
		this.table = new Object[lines][colums];
		refreshData(table);
		printTable();
	}
	
	public void refreshData(WebElement table)
	{
		
		WebElement tagTHead = table.findElement(By.tagName("thead")); // get table header		
		List<WebElement> headRows = tagTHead.findElements(By.tagName("tr"));		
		
		for(int i=0; i< headRows.size(); i++) //for each head row
		{
			WebElement tr = headRows.get(i);
			List<WebElement> tdList = tr.findElements(By.tagName("th"));
			for(int j=0; j< tdList.size(); j++)
			{
				Cell cell = new Cell(tdList.get(j));
				this.table[i][j]=cell;
				//cell.getText();
			}
		}
		
		WebElement tagTBody = table.findElement(By.tagName("tbody")); // get table body	
		List<WebElement> bodyRows = tagTBody.findElements(By.tagName("tr"));
		
		for(int i=0; i< bodyRows.size(); i++) // for each body row
		{
			WebElement tr = bodyRows.get(i);
			List<WebElement> tdList = tr.findElements(By.tagName("td"));
			for(int j=0; j< tdList.size(); j++)
			{
				Cell cell = new Cell(tdList.get(j));
				this.table[i+headRows.size()][j]=cell;
				//cell.getText();
			}
		}
	}	
	
	public boolean findRowInTable(String... param)
	{
		if(param.length <1 || param.length >this.colums)
		{
			return false;
		}
		//try to find param in some line
		
		return false;
	}
	
	public void printTable()
	{
		for(int i=0; i< this.lines; i++)
		{
			for(int j=0; j< this.colums;j++)
			{
				Cell cell = (Cell) this.table[i][j];
				cell.getText();
			}
			System.out.println();
		}
		
	}
	
}
