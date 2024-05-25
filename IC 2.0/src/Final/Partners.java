package Final;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Partners {

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
	  public void partners () {
		  driver.get("https://iciitb.nvli.in/");

		  WebElement section = driver.findElement(By.xpath("//*[@id='block-partnerinstitutions']/div/div[3]"));
			Assert.assertTrue(section.isDisplayed(), "Partners section is missing");

			WebElement header = section.findElement(By.className("section-header"));
			  String title = header.getText();
			  Assert.assertEquals(title, "Partners");

			// partners individual icon test not written as one is image and another is an icon and text


	  }
}
