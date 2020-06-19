package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueryPage {
	
	@FindBy(id = "vrm-input")
	public WebElement txtRegNo;
	
	@FindBy(xpath = "/html/body/div/div/div[1]/div/div/div/div/span/form/button")
	public WebElement btnSubmit;
	
	public QueryPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}

}
