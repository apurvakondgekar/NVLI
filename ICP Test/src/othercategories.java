


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import org.openqa.selenium.interactions.Actions;


public class othercategories {
	private WebDriver driver;
	   
	   
	  @BeforeClass
	  public void setup() {

	  System.setProperty("webdriver.chrome.driver","/Users/Clicker/Documents/Apurva 2023/chromedriver_win32/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://indianculture.gov.in/");
	  }

	  @AfterClass
	  public void teardown() {
	  	driver.quit();
	  }	 
	  
	  @Test
	  public void Audiospage () throws InterruptedException
	  {
		  String category ="Audios";
		  
		  WebElement categorybar = driver.findElement(By.id("block-views-block-item-type-block-1"));
		  List<WebElement> categorytitle = categorybar.findElements(By.xpath(".//p[@class='lead']/a"));
		
		  WebElement categorysection = driver.findElement(By.className("views-element-container"));
		  WebElement rightButton = categorysection.findElement(By.xpath("(//button[@type='button'])[12]"));
		  
	    	 List<WebElement> activecat = categorybar.findElements(By.className("slick-active"));
	    	 ArrayList<String> catlist = new ArrayList<String>();
	    	 boolean categoryfound = false;
	    	 int j=0;
	    	 int k=0;
	    	 
	    	 outerloop:
			  while(k<6)
			  {
				  Thread.sleep(500);
	
		activecat = categorybar.findElements(By.className("slick-active"));
			
		for(WebElement cat : activecat )
		  {
			categorytitle = cat.findElements(By.tagName("p"));
			  String catname = cat.getText();
			  
			 
			  if(catname.contains(category))
			  {
				  System.out.println("Clicked on: "+ catname);
				  Thread.sleep(1000);
				  cat.findElement(By.xpath(".//parent::div[@class='pad15']")).click();
				  Assert.assertTrue(driver.getTitle().contains(category), "Audio page has not opened.");
				  Assert.assertTrue(driver.findElement(By.tagName("h3")).getText().contains(category), "Audio page has not opened.");
				  System.out.println("Title of the page: "+ driver.getTitle());
				  System.out.println("URL of the page: "+ driver.getCurrentUrl());
				  
				  categoryfound = true;
				  break outerloop;
			  }
			  
		 }
		if (categoryfound)
			{
			
			}
		else
			{
			rightButton.click();
			k++;
			}
		  }
			 
	  }

	  
	  @Test
	  public void Audiospage1subcat () throws InterruptedException {
		  WebElement subcatbox = driver.findElement(By.xpath("//div[@class='views-view-grid horizontal cols-4 clearfix']"));
		   List<WebElement> subcatlist = subcatbox.findElements(By.xpath(".//div[@class='col-xs-6 col-lg-3 item p-1 grid-group-item']"));
		   
		   // Find the <ul> element
	        WebElement ulElement = subcatbox.findElement(By.xpath("//ul[@class='pager__items js-pager__items']")); // Replace with your desired locator

	        // Find the <li> elements within the <ul> element
	        List<WebElement> liElements = ulElement.findElements(By.tagName("li")); // Replace with your desired locator

	        // Click the <li> elements in sequence
	        for (int i = 1; i < liElements.size(); i++)  {
	        	
	        	Thread.sleep(1000);
	            // Add any additional logic or assertions after each click if needed
	        
			   subcatbox = driver.findElement(By.xpath("//div[@class='views-view-grid horizontal cols-4 clearfix']"));
			   subcatlist = subcatbox.findElements(By.xpath(".//div[@class='col-xs-6 col-lg-3 item p-1 grid-group-item']"));
			   
		   for(WebElement cat : subcatlist)
		   {
			   String idPrefix = "video-embed-html5"; // Initial four characters of the ID
			   WebElement thumbnail = cat.findElement(By.xpath("//*[starts-with(@id, '" + idPrefix + "')]"));
			  // WebElement thumbnail = cat.findElement(By.id("video-embed-html5*"));
			   Assert.assertTrue(thumbnail.isDisplayed());
			   
			   WebElement title = cat.findElement(By.tagName("h2"));
			   System.out.println(title.getText());
			   Assert.assertNotNull(title);
			   
			  // WebElement subt = cat.findElement(By.tagName("p"));
			 //  System.out.println(subt.getText());
			  // Assert.assertNotNull(subt);
			   
			   
		   }
		   ulElement = subcatbox.findElement(By.xpath("//ul[@class='pager__items js-pager__items']")); 
       	liElements = ulElement.findElements(By.tagName("li"));
       	int j= i+1;
       	// Click the current <li> element
           liElements.get(j).click();
		  
		   }
	        liElements.get(1).click();
	  }

	  @Test
	  public void Audiospage2filters () throws InterruptedException {
		  
		  //Verify the filter block and filter title
		  WebElement filterblock = driver.findElement(By.id("sidefilterview"));
		  
		  Assert.assertEquals(filterblock.findElement(By.tagName("h2")).getText(), "Filters");
		  
		  List<WebElement> filterULs = driver.findElements(By.className("block-facet--checkbox"));
		  
		  for(WebElement Ul : filterULs)
		  {
			  
		   WebElement filtername = driver.findElement(By.tagName("h3"));
		   Assert.assertNotNull(filtername, "Filter name is missing");
		  
		   List<WebElement> filterLIs = Ul.findElements(By.tagName("li"));
		   
		   		for (WebElement Li : filterLIs)
		   		{
		   		WebElement checkbox = Li.findElement(By.tagName("input"));
		   		Assert.assertTrue(!checkbox.isEnabled());
		   		
		   		
		   		WebElement filter = Li.findElement(By.tagName("span"));
		   		Assert.assertNotNull(filter);
		   		
		   		String filtercount = Li.findElement(By.tagName("span:nth-of-type(2)")).getText();
		   		String[] countref = filtercount.split("(");
		   		String[] count = countref[1].split(")");
		   		
		   		Li.click();
		   		
		   		Thread.sleep(1000);
		   		String filterresultscount = driver.findElement(By.xpath("//a[@class='btntool  btn-outline-secondary']/b")).getText();
		   		Assert.assertEquals(count[0], filterresultscount);
		   		
		   		Li.click();
		   				   		
		   		}
		   
		   
		  }
		  
		  		  
		  
//		  WebElement subcatbox = driver.findElement(By.xpath("//div[@class='views-view-grid horizontal cols-4 clearfix']"));
//		   List<WebElement> subcatlist = subcatbox.findElements(By.xpath(".//div[@class='col-xs-6 col-lg-3 item p-1 grid-group-item']"));
//		   
//		   // Find the <ul> element
//	        WebElement ulElement = subcatbox.findElement(By.xpath("//ul[@class='pager__items js-pager__items']")); // Replace with your desired locator
//
//	        // Find the <li> elements within the <ul> element
//	        List<WebElement> liElements = ulElement.findElements(By.tagName("li")); // Replace with your desired locator
//
//	        // Click the <li> elements in sequence
//	        for (int i = 1; i < liElements.size(); i++)  {
//	        	
//	        	Thread.sleep(1000);
//	            // Add any additional logic or assertions after each click if needed
//	        
//			   subcatbox = driver.findElement(By.xpath("//div[@class='views-view-grid horizontal cols-4 clearfix']"));
//			   subcatlist = subcatbox.findElements(By.xpath(".//div[@class='col-xs-6 col-lg-3 item p-1 grid-group-item']"));
//			   
//		   for(WebElement cat : subcatlist)
//		   {
//			   String idPrefix = "video-embed-html5"; // Initial four characters of the ID
//			   WebElement thumbnail = cat.findElement(By.xpath("//*[starts-with(@id, '" + idPrefix + "')]"));
//			  // WebElement thumbnail = cat.findElement(By.id("video-embed-html5*"));
//			   Assert.assertTrue(thumbnail.isDisplayed());
//			   
//			   WebElement title = cat.findElement(By.tagName("h2"));
//			   System.out.println(title.getText());
//			   Assert.assertNotNull(title);
//			   
//			  // WebElement subt = cat.findElement(By.tagName("p"));
//			 //  System.out.println(subt.getText());
//			  // Assert.assertNotNull(subt);
//			   
//			   
//		   }
//		   ulElement = subcatbox.findElement(By.xpath("//ul[@class='pager__items js-pager__items']")); 
//       	liElements = ulElement.findElements(By.tagName("li"));
//       	int j= i+1;
//       	// Click the current <li> element
//           liElements.get(j).click();
//		  // navigateToPage(driver, "2");
//		   }
	  }
	  
}