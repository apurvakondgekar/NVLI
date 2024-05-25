
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ImageSlider {
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
        // Navigate to the web page
    	driver.get("https://indianculture.gov.in");

        // Find the image slideshow element
        WebElement slideshow = driver.findElement(By.cssSelector("div.field-content"));

        // Find all image elements within the slideshow
        List<WebElement> images = slideshow.findElements(By.tagName("img"));

        // Verify if images are present
        Assert.assertFalse(images.isEmpty(), "No images found in the slideshow");

        ArrayList<String> tE = new ArrayList<String>();
        
        for (WebElement image : images) 
        {
            // Verify if each image is displayed
            Assert.assertTrue(image.isDisplayed(), "Image is not displayed in the slideshow");

            Thread.sleep(500);
            // Find the title element for the image
            WebElement titleElement = driver.findElement(By.xpath("//*[@id=\'slick-views-background-slider-view-block-1-1-slider\']/div/div"));
            String temptE = titleElement.findElement(By.tagName("div")).getText();
            tE.add(temptE);
            
            // Verify if the title is present
            Assert.assertTrue(titleElement.isDisplayed(), "Title is not displayed for the image");
        }
        
        System.out.println(tE);
    }
}
