package Final;

import java.util.ArrayList;
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

public class HomePageHeader {
	private WebDriver driver;

	@BeforeClass
	public void launch()
	{
		  System.setProperty("webdriver.chrome.driver","/Users/Clicker/Documents/Apurva 2023/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void HomePage1Title()
	{
		driver.get("https://iciitb.nvli.in/");


        String pageTitle = driver.getTitle();

        assert pageTitle.contains("INDIAN CULTURE");
	}

	@Test
	public void HomePage2Search() throws InterruptedException
	{



	        // Enter search keyword
	        WebElement searchInput = driver.findElement(By.id("edit-search-api-fulltext"));
	        searchInput.sendKeys("music");

	        // Submit the search form
	        WebElement searchButton = driver.findElement(By.className("form-submit"));
	        searchButton.click();

	        Thread.sleep(2000);
	        // Verify search results

	        WebElement searchResults = driver.findElement(By.cssSelector("div#block-filters"));
	     // WebElement searchResults = driver.findElement(By.xpath("//*[@id=\'block-filters\']/h3/text()"));
	     // String result = searchResults.getText();

	        // Verify search results are displayed
	        Assert.assertTrue(searchResults.isDisplayed());
	}

//	 @Test
//	    public void testAutoSuggestiveSearch() {
//	        // Navigate to the page with auto-suggestive search
//	        driver.get("https://example.com");
//
//	        // Locate the search input field
//	        WebElement searchInput = driver.findElement(By.id("edit-search-api-fulltext"));
//	        String searchTerm = "Dance";
//	        searchInput.sendKeys(searchTerm);
//
//	        // Wait for the auto-suggestive options to appear
//	        List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='suggestions']/li"));
//	        Assert.assertTrue(suggestions.size() > 0, "Auto-suggestive options not found");
//
//	        // Select the first suggestion
//	        WebElement firstSuggestion = suggestions.get(0);
//	        Actions actions = new Actions(driver);
//	        actions.moveToElement(firstSuggestion).click().perform();
//
//	        // Verify that the selected suggestion is populated in the search input field
//	        String selectedSuggestion = firstSuggestion.getText();
//	        Assert.assertEquals(searchInput.getAttribute("value"), selectedSuggestion,
//	        "Selected suggestion is not populated in the search input field");

	@Test
	public void HomePage4GoI () throws InterruptedException
	{
	        // Navigate to the page that contains the link
	    	driver.get("https://indianculture.gov.in");

	        // Get the current window handle
	        String currentWindowHandle = driver.getWindowHandle();

	        // Click on the link
	        WebElement GoI = driver.findElement(By.cssSelector("a[href='https://www.india.gov.in/']"));
			GoI.click();
			Thread.sleep(2000);

	        // Get all window handles
	        Set<String> windowHandles = driver.getWindowHandles();

	        // Find the new tab window handle
	        String newTabWindowHandle = "";
	        for (String handle : windowHandles) {
	            if (!handle.equals(currentWindowHandle)) {
	                newTabWindowHandle = handle;
	                break;
	            }
	        }

	        // Switch to the new tab
	        driver.switchTo().window(newTabWindowHandle);

	        // Verify if the new tab URL is not equal to the original tab URL
	        String originalURL = driver.switchTo().window(currentWindowHandle).getCurrentUrl();
	        String newTabURL = driver.switchTo().window(newTabWindowHandle).getCurrentUrl();
	        Assert.assertNotEquals(newTabURL, originalURL, "The link does not open in a new tab by default");

	        // Close the new tab
	        //driver.close();
	    }

	@Test
	public void HomePage5Skip () throws InterruptedException
	{
    	driver.get("https://indianculture.gov.in");

    	WebElement Skip = driver.findElement(By.id("skipdiv"));
			Skip.click();
			Thread.sleep(2000);
		WebElement SkiptoCat = driver.findElement(By.cssSelector("div.section-header"));
		String SkiptoCattext = SkiptoCat.getText();
		Assert.assertEquals(SkiptoCattext, "Categories");
	}

	@Test
    public void HomePage6MenuButton() throws InterruptedException {
        // Navigate to the web page
    	driver.get("https://indianculture.gov.in");

        // Find the menu button element
        WebElement menuButton = driver.findElement(By.xpath("//*[@id='header']/div/div/nav/div[5]/button"));

        Thread.sleep(1000);
        //Verify the menuicon1
//        WebElement menuicon1 = driver.findElement(By.cssSelector("div.pull-right"));
//        Assert.assertTrue(menuicon1.isDisplayed());

        // Click on the menu button
        menuButton.click();

        // Wait for the menu bar to appear (You may need to add an appropriate wait here)
        Thread.sleep(1000);
        // Verify if the menu bar is displayed
        WebElement menuBar = driver.findElement(By.id("navbarSupportedContent20"));
        Assert.assertTrue(menuBar.isDisplayed(), "The menu bar is not displayed after clicking the menu button");

        //Verify the menuicon2
        WebElement menuicon2 = driver.findElement(By.xpath("//*[@id=\'header\']/div/div/nav/div[5]/button/div"));
    	Assert.assertTrue(menuicon2.isDisplayed());

        // Verify if the menu items are listed in the menu bar
        WebElement menuItem1 = menuBar.findElement(By.cssSelector("#block-nvlicollections > ul > li:nth-child(1) > a"));
        Assert.assertTrue(menuItem1.isDisplayed(), "Menu item 1 is not displayed in the menu bar");

        //Verify is the menu bar disappears on second click
        menuButton.click();
        Assert.assertTrue(menuBar.isDisplayed(), "The menu bar did not close after clicking the menu button again.");

        }

	 @Test (enabled = false)
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

	        ArrayList<String> tE = new ArrayList<>();

	        for (WebElement image : images)
	        {
	            // Verify if each image is displayed
	            Assert.assertTrue(image.isDisplayed(), "Image is not displayed in the slideshow");

	            Thread.sleep(500);
	            // Find the title element for the image
	            WebElement titleElement = driver.findElement(By.cssSelector("div.views-field-title"));
	            String temptE = driver.findElement(By.cssSelector("div.views-field-title")).getText();
	            tE.add(temptE);

	            // Verify if the title is present
	            Assert.assertTrue(titleElement.isDisplayed(), "Title is not displayed for the image");
	        }

	        System.out.println(tE);
	    }

	@AfterClass
	public void close()
	{
		driver.quit();
	}

}
