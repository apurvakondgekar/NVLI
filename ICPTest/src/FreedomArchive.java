import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.List;

public class FreedomArchive {
	  private WebDriver driver;
	   
	   
	  @BeforeClass
	  public void setup() {

	  System.setProperty("webdriver.chrome.driver","/C:/Users/apurva_/chromedriver/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://indianculture.gov.in/");
	  }

	  @AfterClass
	  public void teardown() {
	  	driver.quit();
	  }

	  @Test
	  public void freedomarchives () {
	  	
	  WebElement section = driver.findElement(By.id("block-sidebarblock-2"));
	  Assert.assertEquals(section.isDisplayed(), "Freedom Archive section is missing");
	  
	  WebElement header = section.findElement(By.className("section-header"));
	  Assert.assertEquals(header, "Freedom Archive");
	  
	  WebElement image = section.findElement(By.tagName("img"));
	  Assert.assertEquals(image.isDisplayed(), "Image is absent");
	  
	  image.click();
	  String url = driver.getCurrentUrl();
	  System.out.println(url);
	  Assert.assertEquals(url, "https://indianculture.gov.in/freedom-archive");
	  
		  
	  }

	  }