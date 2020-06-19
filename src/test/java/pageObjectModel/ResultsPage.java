package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage {
	
	@FindBy(xpath = "//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[1]/dd")
	public WebElement carreg;
	
	@FindBy(xpath = "//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[2]/dd")
	public WebElement make;
	
	@FindBy(xpath = "//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[3]/dd")
	public WebElement model;
	
	@FindBy(xpath = "//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[4]/dd")
	public WebElement color;
	
	@FindBy(xpath = "//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[5]/dd")
	public WebElement year;
	
	@FindBy (xpath = "/html/body/div/div/div/div[1]/div/div/dl/div/h5/span")
	public WebElement popup;
	
	public ResultsPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	


}
