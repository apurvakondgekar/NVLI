import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Textiles_TypesofTextiles_Weaving {
	private WebDriver driver;


	  @BeforeClass
	  public void setup() {
		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=");
	  //System.setProperty("webdriver.chrome.driver","/Users/Apurva/chromedriver-win64/chromedriver.exe");
	  driver = new ChromeDriver(co);

	  }

	  @AfterClass
	  public void teardown() {
	  	driver.quit();
	  }


	//***********Weaving*************//

	  @Test (enabled=true)
	  public void Weaving () throws InterruptedException {
		  driver.get("https://indianculture.gov.in/textiles-and-fabrics-of-india/type-of-textile/weaving");
		  System.out.println(driver.getTitle());
		  System.out.println("------------------");
		  // Find all pager item links
	       List<WebElement> liElements = driver.findElements(By.xpath("//ul[@class='pager__items js-pager__items']/li"));
		  for (int i = 1; i < liElements.size() - 1; i++) {

	        	Thread.sleep(1000);

	        	WebElement subcatbox = driver.findElement(By.xpath("//div[@class='views-view-grid horizontal cols-3 clearfix']"));
				List<WebElement> subcatlist = subcatbox.findElements(By.xpath(".//div[@class='col-xs-12 col-lg-4 item p-1 grid-group-item']"));

				System.out.println("Page no."+i);
				System.out.println(subcatlist.size());

			   for(WebElement cat : subcatlist)
			   {
//				   String idPrefix = "video-embed-html5"; // Initial four characters of the ID
//				   WebElement thumbnail = cat.findElement(By.xpath("//*[starts-with(@id, '" + idPrefix + "')]"));
				  // WebElement thumbnail = cat.findElement(By.id("video-embed-html5*"));
//				   Assert.assertTrue(thumbnail.isDisplayed());

				   Thread.sleep(500);

				   WebElement title = cat.findElement(By.tagName("h2"));
				   System.out.println(title.getText());
				   Assert.assertNotNull(title);
			   }

			   if( i == liElements.size() - 2) //next and last button
			   {
				  break;
			   }
			   else
			   {
				   driver.findElement(By.xpath("//li[@class='pager__item is-active']/following-sibling::li/a")).click();
			   Thread.sleep(1000);
			   }


		  }

		  System.out.println("------------------");
	  }

//***********Embroidery*************//

	  @Test (enabled=true)
	  public void Embroidery () throws InterruptedException {
		  driver.get("https://indianculture.gov.in/textiles-and-fabrics-of-india/type-of-textile/embroidery");
		  System.out.println(driver.getTitle());
		  System.out.println("------------------");
		  // Find all pager item links
	       List<WebElement> liElements = driver.findElements(By.xpath("//ul[@class='pager__items js-pager__items']/li"));
		  for (int i = 1; i < liElements.size() - 1; i++) {

	        	Thread.sleep(1000);

	        	WebElement subcatbox = driver.findElement(By.xpath("//div[@class='views-view-grid horizontal cols-3 clearfix']"));
				List<WebElement> subcatlist = subcatbox.findElements(By.xpath(".//div[@class='col-xs-12 col-lg-4 item p-1 grid-group-item']"));

				System.out.println("Page no."+i);
				System.out.println(subcatlist.size());

			   for(WebElement cat : subcatlist)
			   {
//				   String idPrefix = "video-embed-html5"; // Initial four characters of the ID
//				   WebElement thumbnail = cat.findElement(By.xpath("//*[starts-with(@id, '" + idPrefix + "')]"));
				  // WebElement thumbnail = cat.findElement(By.id("video-embed-html5*"));
//				   Assert.assertTrue(thumbnail.isDisplayed());

				   Thread.sleep(500);

				   WebElement title = cat.findElement(By.tagName("h2"));
				   System.out.println(title.getText());
				   Assert.assertNotNull(title);
			   }

			   if( i == liElements.size() - 2) //next and last button
			   {
				  break;
			   }
			   else
			   {
				   driver.findElement(By.xpath("//li[@class='pager__item is-active']/following-sibling::li/a")).click();
			   Thread.sleep(1000);
			   }


		  }

		  System.out.println("------------------");
	  }

//***********Painting*************//

	  @Test (enabled=true)
	  public void Painting () throws InterruptedException {
		  driver.get("https://indianculture.gov.in/textiles-and-fabrics-of-india/type-of-textile/painting");
		  System.out.println(driver.getTitle());
		  System.out.println("------------------");
		  WebElement subcatbox = driver.findElement(By.xpath("//div[@class='views-view-grid horizontal cols-3 clearfix']"));
			List<WebElement> subcatlist = subcatbox.findElements(By.xpath(".//div[@class='col-xs-12 col-lg-4 item p-1 grid-group-item']"));

			System.out.println(subcatlist.size());

		   for(WebElement cat : subcatlist)
		   {
//			   String idPrefix = "video-embed-html5"; // Initial four characters of the ID
//			   WebElement thumbnail = cat.findElement(By.xpath("//*[starts-with(@id, '" + idPrefix + "')]"));
			  // WebElement thumbnail = cat.findElement(By.id("video-embed-html5*"));
//			   Assert.assertTrue(thumbnail.isDisplayed());

			   Thread.sleep(500);

			   WebElement title = cat.findElement(By.tagName("h2"));
			   System.out.println(title.getText());
			   Assert.assertNotNull(title);
		   }


		   System.out.println("------------------");
	  }

//***********Dyeing*************//

	  @Test (enabled=true)
	  public void Dyeing () throws InterruptedException {
		  driver.get("https://indianculture.gov.in/textiles-and-fabrics-of-india/type-of-textile/dyeing");
		  System.out.println(driver.getTitle());
		  System.out.println("------------------");
		  // Find all pager item links
	       List<WebElement> liElements = driver.findElements(By.xpath("//ul[@class='pager__items js-pager__items']/li"));
		  for (int i = 1; i < liElements.size() - 1; i++) {

	        	Thread.sleep(1000);

	        	WebElement subcatbox = driver.findElement(By.xpath("//div[@class='views-view-grid horizontal cols-3 clearfix']"));
				List<WebElement> subcatlist = subcatbox.findElements(By.xpath(".//div[@class='col-xs-12 col-lg-4 item p-1 grid-group-item']"));

				System.out.println("Page no."+i);
				System.out.println(subcatlist.size());

			   for(WebElement cat : subcatlist)
			   {
//				   String idPrefix = "video-embed-html5"; // Initial four characters of the ID
//				   WebElement thumbnail = cat.findElement(By.xpath("//*[starts-with(@id, '" + idPrefix + "')]"));
				  // WebElement thumbnail = cat.findElement(By.id("video-embed-html5*"));
//				   Assert.assertTrue(thumbnail.isDisplayed());

				   Thread.sleep(500);

				   WebElement title = cat.findElement(By.tagName("h2"));
				   System.out.println(title.getText());
				   Assert.assertNotNull(title);
			   }

			   if( i == liElements.size() - 2) //next and last button
			   {
				  break;
			   }
			   else
			   {
				   driver.findElement(By.xpath("//li[@class='pager__item is-active']/following-sibling::li/a")).click();
			   Thread.sleep(1000);
			   }


		  }

		  System.out.println("------------------");
	  }


//***********Printing*************//

	  @Test (enabled=true)
	  public void Printing () throws InterruptedException {
		  driver.get("https://indianculture.gov.in/textiles-and-fabrics-of-india/type-of-textile/printing");
		  System.out.println(driver.getTitle());
		  System.out.println("------------------");

	        	WebElement subcatbox = driver.findElement(By.xpath("//div[@class='views-view-grid horizontal cols-3 clearfix']"));
				List<WebElement> subcatlist = subcatbox.findElements(By.xpath(".//div[@class='col-xs-12 col-lg-4 item p-1 grid-group-item']"));

				System.out.println(subcatlist.size());

			   for(WebElement cat : subcatlist)
			   {
//				   String idPrefix = "video-embed-html5"; // Initial four characters of the ID
//				   WebElement thumbnail = cat.findElement(By.xpath("//*[starts-with(@id, '" + idPrefix + "')]"));
				  // WebElement thumbnail = cat.findElement(By.id("video-embed-html5*"));
//				   Assert.assertTrue(thumbnail.isDisplayed());

				   Thread.sleep(500);

				   WebElement title = cat.findElement(By.tagName("h2"));
				   System.out.println(title.getText());
				   Assert.assertNotNull(title);
			   }


			   System.out.println("------------------");
		  }


	  }








