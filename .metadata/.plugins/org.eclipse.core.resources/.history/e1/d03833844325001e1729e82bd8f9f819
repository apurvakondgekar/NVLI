
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


public class Stories2verifyingeachimage {
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
	    	
	    	WebElement storysection = driver.findElement(By.id("slick-views-story-view-block-1-3-slider"));
	    	////div['#block-selectedstory']/div[2]/div/div/div/div/div/div
	    	WebElement rightButton = storysection.findElement(By.xpath("(//button[@type='button'])[14]"));
//****************
	    	
	    	 // Locate the slider container element
	        WebElement sliderContainer = storysection.findElement(By.xpath("//*[@id='slick-views-story-view-block-1-3-slider']/div"));

	        // Click the right button to scroll through the images
	       
	        for (int i = 0; i < 20; i++) { // Change the loop limit based on the number of times you want to scroll
	            
	        	
	            Thread.sleep(1000); // Add a delay to allow the slider to scroll and images to load
	            
	            // Locate the current slide within the slider
		       List <WebElement> currentSlide = storysection.findElements(By.className("slick-active"));
		       
		   
		
		        
		        // Locate the image elements within the current slide
		        

		        for (WebElement slide : currentSlide) {
		        	WebElement imageElement = slide.findElement(By.tagName("img"));
		           // WebElement parentDiv = imageElement.findElement(By.xpath("/parent::a")); // Get the parent div element
		            WebElement h5Element = slide.findElement(By.tagName("h5")); // Find the h5 element within the parent div

		            boolean isImagePresent = imageElement.isDisplayed();
		            System.out.println("Is"+ h5Element.getText() + "Present:" + isImagePresent);
		            
	        }
	        
		        rightButton.click();
	           // Thread.sleep(1000);
	        

	        
		       
	        }
	       
	        // Verify and print the presence of images and the associated h5 text in the current slide
	        
				
	           
		    	ArrayList<String> storynames = new ArrayList<String>();
					for (int j=20; j>=0; j--)
					{
						
						List<WebElement> stories = storysection.findElements(By.className("storybox-title1"));
	    		 for (WebElement story : stories) 
				{
		             String storyText = story.getText();
		             storynames.add(storyText);
	            
	           
	           
	           
	        }
					
		    		 rightButton.click();	
					}
					int i = 0;
					 Set<String> uniqueElements = new HashSet<>(storynames);
				        for (String element : uniqueElements) 
				        {
				            System.out.println(element);
				             i++;
			             }
				        	
			    		 
						
						System.out.println("STORIES AVAILABLE: " + i);
					
					
//****************
//	    	 
//	    	int i=0;
//	    	ArrayList<String> storynames = new ArrayList<String>();
//				for (int j=20; j>=0; j--)
//				{
//					
//								
//				List<WebElement> stories = storysection.findElements(By.className("storybox-title1"));
//				
//	    		 for (WebElement story : stories) 
//				{
//		             String storyText = story.getText();
//		             storynames.add(storyText);
//		             
//		             
//		             
//		            
//	    		 rightButton.click();
//	    		
//				}
//				 Set<String> uniqueElements = new HashSet<>(storynames);
//		        for (String element : uniqueElements) 
//		        {
//		            System.out.println(element);
//		             i++;
//	             }
//		        	
//	    		 
//				
//				System.out.println("STORIES AVAILABLE: " + i);
//	    }
}
	    
}


