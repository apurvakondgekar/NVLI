

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


public class Audios2 {
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
	  public void categorylp () throws InterruptedException
	  {
		  String category ="Audios";
		  
		  WebElement categorybar = driver.findElement(By.id("block-views-block-item-type-block-1"));
		  List<WebElement> categorytitle = categorybar.findElements(By.xpath(".//p[@class='lead']/a"));
		 // List<WebElement> totalcat = categorybar.findElements(By.className("itembox"));
		 // System.out.println(totalcat.size());
		  
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
//String first = categorybar.findElement(By.xpath(".//div[@class='slick-slide slick-current slick-active']")).getText();
//if(!catlist.contains(first))
//{
//	  catlist.add(first);
//System.out.println(first);
//j++;
//}		
		
		
		activecat = categorybar.findElements(By.className("slick-active"));
		
		//allcat = categorybar.findElements(By.xpath(".//div[@class='slick-slide slick-active']"));
		//  System.out.println(allcat.size());
		 
		
		for(WebElement cat : activecat )
		  {
			categorytitle = cat.findElements(By.tagName("p"));
			  String catname = cat.getText();
			  System.out.println(catname);
			 
			  if(catname.contains(category))
			  {
				  Thread.sleep(1000);
				  cat.findElement(By.xpath(".//parent::div[@class='pad15']")).click();
				  Assert.assertTrue(driver.getTitle().contains(category), "Audio page has not opened.");
				  System.out.println(driver.getCurrentUrl());
				  
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

	
	  
}
