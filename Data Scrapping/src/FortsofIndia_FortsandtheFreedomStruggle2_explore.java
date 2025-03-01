import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FortsofIndia_FortsandtheFreedomStruggle2_explore {
	private WebDriver driver;


	  @BeforeMethod
	  public void setup() {
		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=");
	  //System.setProperty("webdriver.chrome.driver","/Users/Apurva/chromedriver-win64/chromedriver.exe");
	  driver = new ChromeDriver(co);

	  }

	  @AfterMethod
	  public void teardown() {
	  	driver.quit();
	  }


	//***********Ahemdabad*************//

	  @Test (enabled=true)
	  public void A () throws InterruptedException {

		  driver.get("https://indianculture.gov.in/forts-and-the-freedom-struggle-ahmednagar-fort");
		  System.out.println(driver.getTitle());

		  System.out.println("Step 2");
		  // Find all pager item links
		  WebElement subcatbox = driver.findElement(By.xpath("//div[@class='views-view-grid horizontal cols-1 clearfix']"));
			List<WebElement> subcategories = subcatbox.findElements(By.xpath(".//div[@class='databox row mb-2']"));

		  System.out.println(subcategories.size());
		  ArrayList<String> h2Texts = new ArrayList<>();

		  //********Reads the subcat titles**********//
		  for(WebElement subcat : subcategories)
		  {
			  Thread.sleep(500);
			  WebElement Title = subcat.findElement(By.tagName("h2"));
			  String h2Text = Title.getText();
			  h2Texts.add(h2Text);
			  System.out.println(Title.getText());

			  //********clicking on the subcat****************//
		  }

	  }

	//***********Jhansi*************//

	  @Test (enabled=true)
	  public void B () throws InterruptedException {

		  driver.get("https://indianculture.gov.in/forts-and-the-freedom-struggle-jhnasi-fort");
		  System.out.println(driver.getTitle());

		  System.out.println("Step 2");
		  // Find all pager item links
		  WebElement subcatbox = driver.findElement(By.xpath("//div[@class='views-view-grid horizontal cols-1 clearfix']"));
			List<WebElement> subcategories = subcatbox.findElements(By.xpath(".//div[@class='databox row mb-2']"));

		  System.out.println(subcategories.size());
		  ArrayList<String> h2Texts = new ArrayList<>();

		  //********Reads the subcat titles**********//
		  for(WebElement subcat : subcategories)
		  {
			  Thread.sleep(500);
			  WebElement Title = subcat.findElement(By.tagName("h2"));
			  String h2Text = Title.getText();
			  h2Texts.add(h2Text);
			  System.out.println(Title.getText());

			  //********clicking on the subcat****************//
		  }

	  }

//***********Panchalankurichi Fort*************//

	  @Test (enabled=true)
	  public void C () throws InterruptedException {

		  driver.get("https://indianculture.gov.in/forts-and-the-freedom-struggle-panchalankurichi-fort");
		  System.out.println(driver.getTitle());

		  System.out.println("Step 2");
		  // Find all pager item links
		  WebElement subcatbox = driver.findElement(By.xpath("//div[@class='views-view-grid horizontal cols-1 clearfix']"));
			List<WebElement> subcategories = subcatbox.findElements(By.xpath(".//div[@class='databox row mb-2']"));

		  System.out.println(subcategories.size());
		  ArrayList<String> h2Texts = new ArrayList<>();

		  //********Reads the subcat titles**********//
		  for(WebElement subcat : subcategories)
		  {
			  Thread.sleep(500);
			  WebElement Title = subcat.findElement(By.tagName("h2"));
			  String h2Text = Title.getText();
			  h2Texts.add(h2Text);
			  System.out.println(Title.getText());

			  //********clicking on the subcat****************//
		  }

	  }


//***********Red Fort*************//

	  @Test (enabled=true)
	  public void D () throws InterruptedException {

		  driver.get("https://indianculture.gov.in/forts-and-the-freedom-struggle-red-fort");
		  System.out.println(driver.getTitle());

		  System.out.println("Step 2");
		  // Find all pager item links
		  WebElement subcatbox = driver.findElement(By.xpath("//div[@class='views-view-grid horizontal cols-1 clearfix']"));
			List<WebElement> subcategories = subcatbox.findElements(By.xpath(".//div[@class='databox row mb-2']"));

		  System.out.println(subcategories.size());
		  ArrayList<String> h2Texts = new ArrayList<>();

		  //********Reads the subcat titles**********//
		  for(WebElement subcat : subcategories)
		  {
			  Thread.sleep(500);
			  WebElement Title = subcat.findElement(By.tagName("h2"));
			  String h2Text = Title.getText();
			  h2Texts.add(h2Text);
			  System.out.println(Title.getText());

			  //********clicking on the subcat****************//
		  }

	  }


//***********Salimgarh Fort*************//

	  @Test (enabled=true)
	  public void E () throws InterruptedException {

		  driver.get("https://indianculture.gov.in/forts-and-the-freedom-struggle-salimgarh-fort");
		  System.out.println(driver.getTitle());

		  System.out.println("Step 2");
		  // Find all pager item links
		  WebElement subcatbox = driver.findElement(By.xpath("//div[@class='views-view-grid horizontal cols-1 clearfix']"));
			List<WebElement> subcategories = subcatbox.findElements(By.xpath(".//div[@class='databox row mb-2']"));

		  System.out.println(subcategories.size());
		  ArrayList<String> h2Texts = new ArrayList<>();

		  //********Reads the subcat titles**********//
		  for(WebElement subcat : subcategories)
		  {
			  Thread.sleep(500);
			  WebElement Title = subcat.findElement(By.tagName("h2"));
			  String h2Text = Title.getText();
			  h2Texts.add(h2Text);
			  System.out.println(Title.getText());

			  //********clicking on the subcat****************//
		  }

	  }

//***********Salimgarh Fort*************//

	  @Test (enabled=true)
	  public void F () throws InterruptedException {

		  driver.get("https://indianculture.gov.in/forts-and-the-freedom-struggle-vellore-fort");
		  System.out.println(driver.getTitle());

		  System.out.println("Step 2");
		  // Find all pager item links
		  WebElement subcatbox = driver.findElement(By.xpath("//div[@class='views-view-grid horizontal cols-1 clearfix']"));
			List<WebElement> subcategories = subcatbox.findElements(By.xpath(".//div[@class='databox row mb-2']"));

		  System.out.println(subcategories.size());
		  ArrayList<String> h2Texts = new ArrayList<>();

		  //********Reads the subcat titles**********//
		  for(WebElement subcat : subcategories)
		  {
			  Thread.sleep(500);
			  WebElement Title = subcat.findElement(By.tagName("h2"));
			  String h2Text = Title.getText();
			  h2Texts.add(h2Text);
			  System.out.println(Title.getText());

			  //********clicking on the subcat****************//
		  }

	  }

}

