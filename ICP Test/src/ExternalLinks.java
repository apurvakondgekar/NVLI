import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.List;

public class ExternalLinks {
	   private WebDriver driver;
	   
	   
@BeforeClass
public void setup() {

System.setProperty("webdriver.chrome.driver","/Users/Clicker/Documents/Apurva 2023/chromedriver_win32/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://indianculture.gov.in/");
}

@BeforeClass
public void teardown() {
	driver.quit();
}

@Test
public void externallinks () {
	
	
}

}