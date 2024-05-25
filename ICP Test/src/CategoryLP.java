
//Alternate code for listing down all categories
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


public class CategoryLP {
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
	  
		  WebElement categorybar = driver.findElement(By.id("block-views-block-item-type-block-1"));
		  List<WebElement> totalcat = categorybar.findElements(By.className("itembox"));
		  System.out.println(totalcat.size());
		  
		  WebElement categorysection = driver.findElement(By.className("views-element-container"));
	    	WebElement rightButton = categorysection.findElement(By.xpath("(//button[@type='button'])[12]"));
		  
	    	 List<WebElement> allcat = categorybar.findElements(By.xpath("//div[@class='slick-slide slick-active']"));
	    	 ArrayList<String> catlist = new ArrayList<String>();
	    	 
	    	 int j=0;
	    	 int k=0;
			  while(k<5)
			  {
		Thread.sleep(500);
String first = categorybar.findElement(By.xpath(".//div[@class='slick-slide slick-current slick-active']")).getText();
if(!catlist.contains(first))
{
	  catlist.add(first);
System.out.println(first);
j++;
}
		
		
		allcat = categorybar.findElements(By.xpath(".//div[@class='slick-slide slick-active']"));
		  System.out.println(allcat.size());
		 
		
		for(WebElement cat : allcat )
		  {
			  
			  String catname = cat.getText();
			  
			 
			  if(!catname.isEmpty())
			  {
				  
				  if(!catlist.contains(catname))
				  {
					  catlist.add(catname);
				  System.out.println(catname);
				  j++;
				  }
				  
			  }
		  }
		  rightButton.click();
		  Thread.sleep(500);
		  k++;
		  }
			  System.out.println(j);
			  
			  System.out.println(catlist.size());
	  }

	
	  
}
