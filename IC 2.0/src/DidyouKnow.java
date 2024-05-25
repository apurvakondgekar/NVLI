import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DidyouKnow {
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
	public void didyouknow () {
		 driver.get("https://indianculture.gov.in/");

	WebElement section = driver.findElement(By.id("block-eventname-2"));
	Assert.assertTrue(section.isDisplayed(), "Did you know section is missing");

	WebElement header = section.findElement(By.tagName("h3"));
	  String title = header.getText();
	  Assert.assertEquals(title, "Did You Know?");

	  WebElement image = driver.findElement(By.xpath("//*[@id=\"block-views-block-did-you-know-block-1\"]/div/div/div/div[1]/span/div/div[2]/img"));
	 // WebElement img = image.findElement(By.tagName("img"));
	  Assert.assertTrue(image.isDisplayed(), "Image is absent");

//	  image.click();
//	  String url = driver.getCurrentUrl();
//	  System.out.println("On clicking Did you know?, this url opens:"+url);
//	  Assert.assertEquals(url, "https://indianculture.gov.in/freedom-archive");
//	  Assert.assertEquals(driver.getTitle(), "Did you Know?");


	}
}
