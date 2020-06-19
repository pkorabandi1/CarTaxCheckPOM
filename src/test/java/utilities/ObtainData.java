package utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factories.DriverFactory;
import pageObjectModel.QueryPage;
import pageObjectModel.ResultsPage;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    


public class ObtainData {
	
	List<String> inputRecArray = new ArrayList<String>();

	static List<String> actualRecordsArray = new ArrayList<String>();
	
	public void setdata(List<String> mylist) throws Exception {
		
		inputRecArray.addAll(mylist);
				
		WebDriver driver = DriverFactory.getBrowser("chrome");
		
		QueryPage querypage = new QueryPage(driver);
		ResultsPage resultspage = new ResultsPage(driver);
		
    	for (int i = 0; i<inputRecArray.size(); i++) {
			
			String regNo = inputRecArray.get(i);
			
			driver.get("https://cartaxcheck.co.uk/");
			
			querypage.txtRegNo.sendKeys(regNo);
			querypage.btnSubmit.click();
			
//			driver.findElement(By.id("vrm-input")).sendKeys(regNo); 
//			
//			driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/div/span/form/button")).click();
//

			Thread.sleep(2000);
			String carreg = resultspage.carreg.getText();
//        	
//        	String carreg = driver.findElement(By.xpath("//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[1]/dd")).getText();
//        	
        	if (carreg.equals("")) {
        		resultspage.popup.click();
//        		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div/dl/div/h5/span")).click();
        		
        		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");  
        		   LocalDateTime now = LocalDateTime.now(); 
        		   
	        		String filename = "Screenshots\\FailedScreenAt-"+dtf.format(now)+".jpg";
	        		System.out.println(filename);
	        		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        		
	        		FileUtils.copyFile(file, new File(filename));
        	}
        	
        	String make = resultspage.make.getText();
        	String model = resultspage.model.getText();
        	String color = resultspage.color.getText();
        	String year = resultspage.year.getText();
        	
//        	String make  = driver.findElement(By.xpath("//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[2]/dd")).getText();
//        	String model = driver.findElement(By.xpath("//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[3]/dd")).getText();
//        	String color = driver.findElement(By.xpath("//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[4]/dd")).getText();
//        	
//        	String year = driver.findElement(By.xpath("//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[5]/dd")).getText();
        		
        	
        	String actualRec = carreg+","+make+","+model+","+color+","+year;
        	actualRecordsArray.add(actualRec);
        	
    	}
    	driver.quit();
		
	}
	
	public static List<String> getactualarray(){
		return (actualRecordsArray);
	}
}
