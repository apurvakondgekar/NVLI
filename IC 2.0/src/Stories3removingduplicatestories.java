
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


public class Stories3removingduplicatestories {
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

	        ArrayList<String> storyimagelist = new ArrayList<>();
	        // Click the right button to scroll through the images
	       int k=0;
	        for (int i = 21; i>=0; i--) { // Change the loop limit based on the number of times you want to scroll


	            Thread.sleep(1000); // Add a delay to allow the slider to scroll and images to load

	            // Locate the current slide within the slider
		       WebElement firststory = sliderContainer.findElement(By.className("slick-current"));
		       WebElement secondstory = firststory.findElement(By.xpath("following-sibling::div"));



		        	WebElement imageElement1 = firststory.findElement(By.tagName("img"));
		        	WebElement imageElement2 = secondstory.findElement(By.tagName("img"));

		           // WebElement parentDiv = imageElement.findElement(By.xpath("/parent::a")); // Get the parent div element
		            WebElement h5Element1 = firststory.findElement(By.tagName("h5")); // Find the h5 element within the parent div
		            WebElement h5Element2 = secondstory.findElement(By.tagName("h5")); // Find the h5 element within the parent div

		            boolean isImagePresent1 = imageElement1.isDisplayed();

					if(isImagePresent1=true)
		            {
						String storyimageText1 = h5Element1.getText();
						storyimagelist.add(storyimageText1);
						k++;
		            }
//		            System.out.println("Is "+ h5Element1.getText() + " Present:" + isImagePresent1);
		            boolean isImagePresent2 = imageElement2.isDisplayed();
		            if(isImagePresent2=true)
		            {
		            	String storyimageText2 = h5Element2.getText();
						storyimagelist.add(storyimageText2);
		            	k++;
		            }
//		            System.out.println("Is "+ h5Element2.getText() + " Present:" + isImagePresent2);


		        rightButton.click();
	           // Thread.sleep(1000);


	        }
	        int l = 0;
			 Set<String> uniqueimages = new HashSet<>(storyimagelist);
		        for (String unique : uniqueimages)
		        {
		        	if (unique.isBlank()) {
		                System.out.println("---------blank--------");
		            } else {
		            	uniqueimages.add(unique);
		                System.out.println(unique);
		                l++;
		            }
	             }



				System.out.println("STORIES Images: " + l);
	        // Verify and print the presence of images and the associated h5 text in the current slide



		    	ArrayList<String> storynames = new ArrayList<>();
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

					 Set<String> uniqueElements = new HashSet<>(storynames);
					 int t=0;
				        for (String element : uniqueElements)
				        {
				        	if (element.isBlank()) {
				                System.out.println("---------blank--------");
				            } else {
				                uniqueElements.add(element);
				                System.out.println(element);
				                t++;
				            }

			             }

                              int u = uniqueElements.size();

						System.out.println("STORIES AVAILABLE: " + t);

					Assert.assertEquals(l, t, "The number of images is not matching the number of story title");
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


