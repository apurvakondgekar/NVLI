import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Textiles_TextilesandFabricsofIndianStates {
	private WebDriver driver;


	  @BeforeClass
	  public void setup() {
		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=");
	  //System.setProperty("webdriver.chrome.driver","/Users/Apurva/chromedriver-win64/chromedriver.exe");
	  driver = new ChromeDriver(co);
	  driver.get("https://indianculture.gov.in/textiles-and-fabrics-of-india/textilestate");
	  System.out.println(driver.getTitle());
	  }

	  @AfterClass
	  public void teardown() {
	  	driver.quit();
	  }


	//***********Weaving*************//

	  @Test (enabled=true)
	  public void IndianStates () throws InterruptedException {

		  System.out.println("------------------");
		  List<WebElement> elements = driver.findElements(By.tagName("area")); // Replace "tagname" with the tag name of the elements you want to retrieve
		  System.out.println("States # "+ elements.size());
		  ArrayList<String> stateurls = new ArrayList<>();

		  for (WebElement element : elements) {
		      String attributeValue = element.getAttribute("title");
		      System.out.println(attributeValue);

		      String href = element.getAttribute("href");
		      stateurls.add(href);
		  }

		  for (String url : stateurls) {

		      driver.get(url);
		      System.out.println(url+driver.getTitle());
		      Thread.sleep(500);

		      WebElement map = driver.findElement(By.id("map-container"));
		      List <WebElement>	pinname = map.findElements(By.tagName("a"));

		      WebElement textbox = driver.findElement(By.xpath("//div[@class='col-md-7 mapinfo-text']"));
		      List <WebElement>	titlebox = textbox.findElements(By.className("mark_info"));


		      System.out.println("Pins # "+ pinname.size());
		      for(int i=0; i<pinname.size(); i++)
		      {
		    	  System.out.println("Pin name and title");
		    	  System.out.println(pinname.get(i).getAttribute("title"));

		    	  WebElement title = titlebox.get(i).findElement(By.tagName("b"));
		    	  System.out.println(title.getText());





//		    	  Thread.sleep(500);
//		    	  try {
//		    		    pin.click();
//		    		    Thread.sleep(1000);
//		    		    WebElement textbox = driver.findElement(By.className("pt-2"));
//				    	  System.out.println(textbox.findElement(By.tagName("b")).getText());
//
////				    	  WebElement slidetrack = driver.findElement(By.className("slick-track"));
////				    	  List <WebElement> subresults = slidetrack.findElements(By.className("thumbnail"));
////					      System.out.println("subresults # "+ subresults.size());
////					      for(WebElement result : subresults)
////					      {
////
////					    	  result.findElement(By.className("slide-caption")).getText();
////
////					      }
//		    		}
//		    	  catch (Exception e) {
//		    		    System.out.println("Failed to click on pin1: " + e.getMessage());
//
//		    		}



		      }

		      System.out.println("------------------");

//			  driver.quit();
			  Thread.sleep(500);


		  }


	  }
}