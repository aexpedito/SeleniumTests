

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
	private String[] headers;
	
	public Table(WebElement table, WebDriver driver,String databaseName, String tableName, String... headers)
	{
		this.DATABASE_NAME=databaseName;
		this.tableName=tableName;
		
		WebElement tagTHead = table.findElement(By.tagName("thead")); // get table header
		WebElement tagTBody = table.findElement(By.tagName("tbody")); // get table body		
		List<WebElement> headRows = tagTHead.findElements(By.tagName("tr")); //get table rows inside thead
		List<WebElement> th = headRows.get(0).findElements(By.tagName("th"));		
		List<WebElement> bodyRows = tagTBody.findElements(By.tagName("tr")); //get table rows inside tbody		
		
		this.lines = headRows.size()+bodyRows.size();
		this.colums = th.size();
		
		this.headers = new String[headers.length];
		for(int i=0; i< headers.length; i++)
			this.headers[i]= headers[i];
		
		try{
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:.\\db\\files\\"+DATABASE_NAME);
			stm = conn.createStatement();
		}catch (ClassNotFoundException e) 
		{			
			e.printStackTrace();
		}catch (SQLException e) 
		{
			e.printStackTrace();
		}
		loadTable(headers);
	}
	
	public void loadTable(String... headers)
	{
		String sql ="CREATE TABLE IF NOT EXISTS \"" + this.tableName.toString().trim().toUpperCase() + "\"(ROW_ID INTEGER PRIMARY KEY AUTOINCREMENT, ";
			
		for(int i=0; i< headers.length; i++)
		{
			if(i== headers.length-1)
				sql=sql.concat(headers[i]+" TEXT");
			else
				sql=sql.concat(headers[i]+" TEXT, ");			
		}
		sql=sql.concat(");");	
		
		System.out.println(sql);
			
		try{
			stm.executeUpdate(sql);					
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}		
	}
	
	public void closeDatabase() //drop table
	{
		String sql = "DROP TABLE " +tableName;
		
		try{
			stm.executeUpdate(sql);
			stm.close();
			conn.close();
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void loadData(WebElement table) //read data from table in html
	{

		WebElement tagTBody = table.findElement(By.tagName("tbody")); // get table body	
		List<WebElement> bodyRows = tagTBody.findElements(By.tagName("tr"));
		
		for(int i=0; i< bodyRows.size(); i++) // for each body row
		{
			WebElement tr = bodyRows.get(i);
			List<WebElement> tdList = tr.findElements(By.tagName("td"));
			for(int j=0; j< tdList.size(); j++)
			{
				insertRowInTable();
			}
		}
	}	
	
	public boolean findRowInTable(String... param) //select from table, VALUES TO FIND IN ROW
	{
		if(param.length <1 || param.length >this.colums)
		{
			return false;
		}
		//try to find param in some line
		String sql = "SELECT ";
		for(int i=0; i< headers.length; i++)
		{
			if(i== headers.length-1)
				sql=sql.concat(headers[i]+" ");
			else
				sql=sql.concat(headers[i]+", ");
		}
		sql=sql.concat("FROM "+tableName+ " WHERE(");
		
		
		return false;
	}
	
	public boolean insertRowInTable(String... param) //insert into table
	{
		try {
			String sql="INSERT INTO \""+this.tableName+ "\" ";
			//add headers
			
			//values from param
			
			PreparedStatement ps = this.conn.prepareStatement(sql);
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
}
