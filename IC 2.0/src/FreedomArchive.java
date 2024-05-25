import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FreedomArchive {
	  private WebDriver driver;


	  @BeforeClass
	  public void setup() {

	  System.setProperty("webdriver.chrome.driver","/Users/Clicker/Documents/Apurva 2023/chromedriver_win32/chromedriver.exe");
	  driver = new ChromeDriver();

	  }

	  @AfterClass
	  public void teardown() {
	  	driver.quit();
	  }

	  @Test
	  public void freedomarchives () {
		 driver.get("https://indianculture.gov.in/");
	  WebElement section = driver.findElement(By.id("block-sidebarblock-2"));
	  Assert.assertTrue(section.isDisplayed(), "Freedom Archive section is missing");


	  WebElement header = section.findElement(By.className("section-header"));
	  String title = header.findElement(By.tagName("h3")).getText();
	  Assert.assertEquals(title, "Freedom Archive");

	  WebElement image = section.findElement(By.tagName("img"));
	  Assert.assertTrue(image.isDisplayed(), "Image is absent");

	  image.click();
	  String url = driver.getCurrentUrl();
	  System.out.println("On clicking Freedom Archives, this url opens:"+url);
	  Assert.assertEquals(url, "https://indianculture.gov.in/freedom-archive");


	  }

	  }