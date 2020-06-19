package pageObjectModel;

import org.openqa.selenium.WebDriver;

import factories.DriverFactory;

public class Testrun {

	public static void main(String[] args) {

		WebDriver driver = DriverFactory.getBrowser("chrome");
		driver.get("https://cartaxcheck.co.uk/");
		
		QueryPage querypage = new QueryPage(driver);
		ResultsPage resultspage = new ResultsPage(driver);
		querypage.setReg("n2pkk");
		querypage.submitClick();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(resultspage.getCarreg()+","+
				resultspage.getMake()+","+
				resultspage.getModel()+","+
				resultspage.getColor()+","+
				resultspage.getYear());		
		driver.quit();
	}

}
