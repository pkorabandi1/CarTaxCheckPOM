package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueryPage {
	
	@FindBy(id = "vrm-input")
	private WebElement txtRegNo;
	
	@FindBy(xpath = "/html/body/div/div/div[1]/div/div/div/div/span/form/button")
	private WebElement btnSubmit;
	
	public QueryPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}


	public void setReg(String regNo) {
		this.txtRegNo.sendKeys(regNo);;
	}

	public void submitClick() {
		this.btnSubmit.click();
	}

	
}
