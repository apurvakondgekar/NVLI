import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Textiles_FreedomMovementandTextiles {
	private WebDriver driver;


	  @BeforeClass
	  public void setup() {
		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=");
	  //System.setProperty("webdriver.chrome.driver","/Users/Apurva/chromedriver-win64/chromedriver.exe");
	  driver = new ChromeDriver(co);
	  driver.get("https://indianculture.gov.in/node/2790124");
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
		  WebElement titlebox = driver.findElement(By.xpath("//ul[@class='nav fighter fighter-tabs col-md-3']")); // Replace "tagname" with the tag name of the elements you want to retrieve
		  List<WebElement> title = titlebox.findElements(By.tagName("li"));

		  System.out.println("titles # "+ title.size());
//		  ArrayList<String> stateurls = new ArrayList<>();

		  for (WebElement one : title) {
//		      String attributeValue = one.getAttribute("title");
		      System.out.println(one.getText());

		      one.click();
		      Thread.sleep(500);


//		      List<WebElement> resultbox = driver.findElements(By.xpath("//div[@class='col-xs-18 col-sm-6 col-md-3 p-1']"));
//
//
//		  for (WebElement result : resultbox) {
//			  Thread.sleep(500);
//		      WebElement resultTitle = result.findElement(By.xpath("//*[@id='videodiv2790158']/div[1]/a/div/div"));
//		    		  System.out.println(resultTitle.getText());
//
//		    		  int i = 0;
//		      if(i>0)
//		      {
//		    result.findElement(By.className("fighteroverlay")).click();
//		      Thread.sleep(1000);
//
//		      WebElement count = driver.findElement(By.xpath("//a[@class='btn btn-outline-secondary'][2]/b"));
//
//		      System.out.println("count is "+count.getText());
//
//		      driver.navigate().back();
//		      Thread.sleep(500);
//		      }
//		      else
//		      {
//		    	  continue;
//		      }
//
//		   i++;
//		  }

//		      System.out.println("------------------");

//


		  }


	  }
}