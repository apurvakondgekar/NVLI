import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AllCategories {
	   private WebDriver driver;


@BeforeClass
public void setup() {

System.setProperty("webdriver.chrome.driver","/Users/Clicker/Documents/Apurva 2023/chromedriver_win32/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://indianculture.gov.in/");
}

@AfterClass
public void teardown() {
	driver.quit();
}

@Test
public void allcategories () {


}

}