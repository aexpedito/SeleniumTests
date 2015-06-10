import org.openqa.selenium.WebElement;


public class Cell 
{
	private WebElement webContent;
	
	public Cell(WebElement ele)
	{
		this.webContent=ele;
	}
	
	public WebElement getWebElement()
	{
		return this.webContent;
	}
	
	public void getText()
	{
		System.out.print(webContent.getText()+"_");
	}
}
