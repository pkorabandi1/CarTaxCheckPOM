package pageObjectModel;

import org.openqa.selenium.WebDriver;

import factories.DriverFactory;

public class Testrun {

	public static void main(String[] args) {

		WebDriver driver = DriverFactory.getBrowser("chrome");
		driver.get("https://cartaxcheck.co.uk/");
		
		QueryPage querypage = new QueryPage(driver);
		ResultsPage resultspage = new ResultsPage(driver);
		querypage.txtRegNo.sendKeys("n2pkk");
		querypage.btnSubmit.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(resultspage.carreg.getText()+","+
				resultspage.make.getText()+","+
				resultspage.model.getText()+","+
				resultspage.color.getText()+","+
				resultspage.year.getText());		
		driver.quit();
	}

}
