
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MoCOrganisations {
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
	    public void testMOCSlider() throws InterruptedException {

	    	WebElement MOCsection = driver.findElement(By.id("slick-views-all-moc-organization-block-1-5-slider"));
	    	WebElement rightButton = MOCsection.findElement(By.xpath("//*[@id=\'slick-views-all-moc-organization-block-1-5\']/nav/button[2]"));


	    	int i=0;
	    	ArrayList<String> MOCnames = new ArrayList<>();
				for (int j=15; j>=0; j--)
				{

				List<WebElement> MOCicon = MOCsection.findElements(By.tagName("img"));



				for (WebElement icon : MOCicon)
				{
				 Assert.assertTrue(icon.isDisplayed(), "Thumbnail is missing.");

				}



				List<WebElement> MOCs = MOCsection.findElements(By.className("externallink"));

	    		 for (WebElement MOCtitle : MOCs)
				{
	    			 Assert.assertTrue(MOCtitle.isDisplayed(), "Title is missing.");
	    			 String MOCText = MOCtitle.getText();
		             MOCnames.add(MOCText);

//		             if(categoryText.length()>0)
//		             {
//
//		            	 System.out.println(categoryText);
//
//		            	 i++;
//				     }
				}
	    		 rightButton.click();

				}
				 Set<String> uniqueElements = new HashSet<>(MOCnames);
		        for (String element : uniqueElements)
		        {
		            System.out.println(element);
		             i++;
	             }



				System.out.println("MOC ORGANISATIONS AVAILABLE: " + i);
	    }
}


