package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage {
	
	@FindBy(xpath = "//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[1]/dd")
	private WebElement carreg;
	
	@FindBy(xpath = "//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[2]/dd")
	private WebElement make;
	
	@FindBy(xpath = "//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[3]/dd")
	private WebElement model;
	
	@FindBy(xpath = "//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[4]/dd")
	private WebElement color;
	
	@FindBy(xpath = "//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[5]/dd")
	private WebElement year;
	
	@FindBy (xpath = "/html/body/div/div/div/div[1]/div/div/dl/div/h5/span")
	private WebElement popup;
	
	public ResultsPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String getCarreg() {
		return this.carreg.getText();
	}

	public String getMake() {
		return this.make.getText();
	}

	public String getModel() {
		return this.model.getText();
	}

	public String getColor() {
		return this.color.getText();
	}

	public String getYear() {
		return this.year.getText();
	}

	public void clickPopup() {
		this.popup.click();;
	}

}
