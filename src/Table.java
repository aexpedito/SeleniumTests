

import java.util.List;

import org.apache.jasper.runtime.TagHandlerPool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.*;



public class Table
{
	private int lines;
	private int colums;
	private Connection conn;
	private Statement stm;
	private String DATABASE_NAME;
	private String tableName;
	
	public Table(WebElement table, WebDriver driver,String databaseName, String tableName)
	{
		WebElement tagTHead = table.findElement(By.tagName("thead")); // get table header
		WebElement tagTBody = table.findElement(By.tagName("tbody")); // get table body				
		
		List<WebElement> headRows = tagTHead.findElements(By.tagName("tr")); //get table rows inside thead
		List<WebElement> bodyRows = tagTBody.findElements(By.tagName("tr")); //get table rows inside tbody
		
		List<WebElement> th = headRows.get(0).findElements(By.tagName("th"));
		
		this.lines = headRows.size()+bodyRows.size();
		this.colums = th.size();		
				
		try{
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:.\\db\\files\\"+DATABASE_NAME);
			stm = conn.createStatement();
			String sql =  "CREATE TABLE IF NOT EXISTS " + tableName +
	                   " (ID INT PRIMARY KEY NOT NULL," +
	                   " NAME           TEXT    NOT NULL, " + 
	                   " AGE            INT     NOT NULL, " + 
	                   " ADDRESS        CHAR(50), " + 
	                   " SALARY         REAL);";
			stm.executeUpdate(sql);
			sql = "INSERT INTO COMPANY(ID,NAME,AGE,ADDRESS,SALARY) VALUES(1,'aFONSO',12,'ADDRESS',2.1);";
			stm.executeUpdate(sql);
			
			
			stm.close();
			//conn.commit();
			conn.close();
		}catch (ClassNotFoundException e) 
		{			
			e.printStackTrace();
		}catch (SQLException e) 
		{
			e.printStackTrace();
		}
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
	
	public boolean insertRowInTable(String... param)
	{
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
