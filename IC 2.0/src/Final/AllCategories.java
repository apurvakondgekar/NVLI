package Final;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AllCategories {
	private WebDriver driver;


	  @BeforeMethod
	  public void setup() {
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=");
	  //System.setProperty("webdriver.chrome.driver","/Users/Apurva/chromedriver-win64/chromedriver.exe");
	  driver = new ChromeDriver(co);

	  }


@Test
public void allcategories () throws InterruptedException {

	driver.get("http://10.129.103.119/");

	WebElement ViewAll = driver.findElement(By.xpath("//button[@class='catabtn']"));
	Assert.assertTrue(ViewAll.isDisplayed(), "View All button is not present.");
	Assert.assertEquals(ViewAll.getText(), "View All");

	ViewAll.click();
	String url = driver.getCurrentUrl();
	String title = driver.getTitle();

	System.out.println("The title of the page is: " + title);
	System.out.println("The url of the page is: " + url);

	Assert.assertEquals(title, "Categories");

}


@AfterMethod
public void teardown() {
	//driver.quit();
}
}