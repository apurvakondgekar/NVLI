
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


public class Stories {
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
	    public void testStorySlider() throws InterruptedException {
	    	
	    	WebElement storysection = driver.findElement(By.id("block-views-block-story-view-block-1"));
	    	WebElement rightButton = storysection.findElement(By.xpath("(//button[@type='button'])[14]"));

	    	 
	    	int i=0;
	    	ArrayList<String> storynames = new ArrayList<String>();
				for (int j=20; j>=0; j--)
				{
					
								
				List<WebElement> stories = storysection.findElements(By.className("storybox-title1"));
				
	    		 for (WebElement story : stories) 
				{
		             String storyText = story.getText();
		             storynames.add(storyText);
		             
		            
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
				 Set<String> uniqueElements = new HashSet<>(storynames);
		        for (String element : uniqueElements) 
		        {
		            System.out.println(element);
		             i++;
	             }
		        	
	    		 
				
				System.out.println("STORIES AVAILABLE: " + i);
	    }
}
	    

