import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MapsPins {

		private WebDriver driver;


		  @BeforeMethod
		  public void setup() {
			  
//			  System.setProperty("webdriver.chrome.driver","/C:/Users/apurva_/chromedriver/chromedriver.exe");
//			driver = new ChromeDriver();
			  ChromeOptions co = new ChromeOptions();
//			  co.addArguments("--remote-allow-origins=");
		 
		  driver = new ChromeDriver(co);

		  }

		  @AfterMethod
		  public void teardown() {
		  	driver.quit();
		  }


		//***********Getting list of Results (method 2 perfect)*************//

		  @Test (enabled=true)
		  public void A () {

			  driver.get("https://indianculture.gov.in/node/2790169");
			  System.out.println(driver.getTitle());

			  System.out.println("Step 2");
			  // Find all pager item links
			  List<WebElement> subcategories = driver.findElements(By.xpath("//img[@class='box mappin red']"));
			  System.out.println(subcategories.size());

			  for(WebElement subcat : subcategories)
			  {
			  subcat.click();
			  WebElement title = driver.findElement(By.xpath("//h3[@class='popover-header popover-title']"));
			  System.out.println(title.getText());

			  //closing the window

			  driver.findElement(By.xpath("//span[@class='close pull-right']")).click();

			  }
		  }



}

