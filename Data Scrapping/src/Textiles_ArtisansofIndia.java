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


public class Textiles_ArtisansofIndia {
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


	//***********Getting list of Results (method 2 perfect)*************//

	  @Test (enabled=true)
	  public void A () throws InterruptedException {

		  driver.get("https://indianculture.gov.in/textiles-and-fabrics-of-india/artisan");
		  System.out.println(driver.getTitle());

		  System.out.println("Step 2");
		  // Find all pager item links
		  List<WebElement> subcategories = driver.findElements(By.xpath("//div[@class='col-lg-3 col-md-3 p-0 col-sm-6 col-xs-12']"));
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

////***********Getting list of Results (method 2 perfect)*************//
//
//	  @Test (enabled=true)
//	  public void B () throws InterruptedException {
//
//		  driver.get("https://indianculture.gov.in/historic-cities/thanjavur-watch");
//		  System.out.println(driver.getTitle());
//
//		  System.out.println("Step 2");
//		  // Find all pager item links
//		  List<WebElement> subcategories = driver.findElements(By.className("grid-group-item"));
//		  System.out.println(subcategories.size());
//		  ArrayList<String> h2Texts = new ArrayList<>();
//
//		  //********Reads the subcat titles**********//
//		  for(WebElement subcat : subcategories)
//		  {
//			  Thread.sleep(500);
//			  WebElement Title = subcat.findElement(By.tagName("h2"));
//			  String h2Text = Title.getText();
//			  h2Texts.add(h2Text);
//			  System.out.println(Title.getText());
//
//			  //********clicking on the subcat****************//
//		  }
//
//
//	  }
//
//
////***********Getting list of Results (method 2 perfect)*************//
//
//	  @Test (enabled=true)
//	  public void C () throws InterruptedException {
//
//		  driver.get("https://indianculture.gov.in/historic-cities/watch");
//		  System.out.println(driver.getTitle());
//
//		  System.out.println("Step 2");
//		  // Find all pager item links
//		  List<WebElement> subcategories = driver.findElements(By.className("grid-group-item"));
//		  System.out.println(subcategories.size());
//		  ArrayList<String> h2Texts = new ArrayList<>();
//
//		  //********Reads the subcat titles**********//
//		  for(WebElement subcat : subcategories)
//		  {
//			  Thread.sleep(500);
//			  WebElement Title = subcat.findElement(By.tagName("h2"));
//			  String h2Text = Title.getText();
//			  h2Texts.add(h2Text);
//			  System.out.println(Title.getText());
//
//			  //********clicking on the subcat****************//
//		  }
//
//
//	  }

}



