package Final;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class ExternalLinks {
	   private WebDriver driver;
	   
	   
	   @BeforeClass
	    public void set() {
		 System.setProperty("webdriver.chrome.driver","/Users/Clicker/Documents/Apurva 2023/chromedriver_win32/chromedriver.exe");
	 		driver = new ChromeDriver();
		
			// Navigate to the web page
	    	driver.get("https://indianculture.gov.in");
	    	
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }


@Test
public void externallinks () throws InterruptedException {
	
    	
    	WebElement ELsection = driver.findElement(By.id("mocexternal"));
    	WebElement rightButton = ELsection.findElement(By.xpath(".//button[@aria-label='Next']"));
    	
    	 
    	int i=0;
    	ArrayList<String> ELnames = new ArrayList<String>();
			for (int j=5; j>=0; j--)
			{
				
				Thread.sleep(1000);	
				
				List<WebElement> unit = ELsection.findElements(By.className("slick-active"));
				
				for (WebElement EL : unit) 
				{
					//Validate moc title
					
					WebElement title = EL.findElement(By.tagName("h3"));
					
		             String ELText = title.getText();
		             ELnames.add(ELText);
		             
//		             if(categoryText.length()>0)
//		             {
//		            	 
//		            	 System.out.println(categoryText);
//		            	 
//		            	 i++;		            	 
//				     }
		             
		             //Validate moc image
		             WebElement ELicon = EL.findElement(By.tagName("img"));	
		             Assert.assertTrue(ELicon.isDisplayed(), "Thumbnail is missing.");
				}
	    		 rightButton.click();
    		
			}
			
			 Set<String> uniqueElements = new HashSet<>(ELnames);
	        for (String element : uniqueElements) 
	        {
	            System.out.println(element);
	             i++;
             }
	        	
    		 
			
			System.out.println("External links AVAILABLE: " + i);
    
	
}

//@AfterClass
//public void teardown() {
//	driver.quit();
//}

}