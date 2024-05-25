package Final;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Stories {
	private WebDriver driver;



	 @BeforeClass
	    public void set() {
		 System.setProperty("webdriver.chrome.driver","/Users/Clicker/Documents/Apurva 2023/chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();

			// Navigate to the web page
	    	driver.get("https://iciitb.nvli.in/");

	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }

	    @Test
	    public void testStorySlider() throws InterruptedException {

	    	WebElement storysection = driver.findElement(By.id("block-views-block-story-view-block-1"));
	    	WebElement rightButton = storysection.findElement(By.xpath("//*[@id=\"slick-views-story-view-block-1-3\"]/nav/button[2]"));


	    	int i=0;
	    	ArrayList<String> storynames = new ArrayList<>();
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


