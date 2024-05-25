package Final;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ImageSliderAll {
	 private WebDriver driver;

	 @BeforeClass
	    public void setUp() {
		 System.setProperty("webdriver.chrome.driver","/Users/Clicker/Documents/Apurva 2023/chromedriver_win32/chromedriver.exe");
	 		driver = new ChromeDriver();
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }

	    @Test
	    public void testImageSlideshow() throws InterruptedException
	    {

        // Navigate to the website
        driver.get("https://iciitb.nvli.in/");

        // Wait for the image slider to load (you may need to adjust the wait time)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find the image slider container element
        WebElement imageSlider = driver.findElement(By.cssSelector("div.field-content"));

        ArrayList<String> tE = new ArrayList<>();

        for(int i=0; i<40; i++)
        {

        	 driver.findElement(By.xpath("//div[@id='slick-views-background-slider-view-block-1-1']/nav/button[2]")).click();

        // Find all the image elements within the image slider
        //java.util.List<WebElement> images = imageSlider.findElements(By.tagName("img"));
        	List<WebElement> images = imageSlider.findElements(By.tagName("img"));
        // Verify if images are appearing on the image slider
//        if (images.size() > 0) {
//            System.out.println("Images are appearing on the image slider.");
//        } else {
//            System.out.println("No images are appearing on the image slider.");
//        }
        	Thread.sleep(1000);
        	 Assert.assertFalse(images.isEmpty(), "No images found in the slideshow");

        	 Thread.sleep(500);
             // Find the title element for the image
             WebElement titleElement = driver.findElement(By.xpath("//*[@id=\'slick-views-background-slider-view-block-1-1-slider\']/div"));
             String temptE = titleElement.findElement(By.tagName("div")).getText();
             System.out.println(temptE);
            // tE.add(temptE);


             // Verify if the title is present
             Assert.assertTrue(titleElement.isDisplayed(), "Title is not displayed for the image");

        }

      // System.out.println(tE);

    }
}
