

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class CategoriesFinal {
	private WebDriver driver;



	 @BeforeClass
	    public void set() {
		 System.setProperty("webdriver.chrome.driver","/Users/Clicker/Documents/Apurva 2023/chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();

			// Navigate to the web page
	    	driver.get("https://indianculture.gov.in");

	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }

	    @Test
	    public void testCategorySlider() throws InterruptedException {

	    	WebElement categorysection = driver.findElement(By.className("views-element-container"));
	    	WebElement rightButton = categorysection.findElement(By.xpath("(//button[@type='button'])[12]"));


	    	int i=0;
	    	ArrayList<String> categorynames = new ArrayList<>();
				for (int j=5; j>=0; j--)
				{
					Thread.sleep(1000);

				List<WebElement> categories = driver.findElements(By.className("pad15"));

	    		 for (WebElement category : categories)
				{
		             String categoryText = category.getText();
		             categorynames.add(categoryText);

//		             if(categoryText.length()>0)
//		             {
//
//		            	 System.out.println(categoryText);
//
//		            	 i++;
//				     }
				}
	    		 rightButton.click();

				}
				 Set<String> uniqueElements = new HashSet<>(categorynames);
		        for (String element : uniqueElements)
		        {
		            System.out.println(element);
		             i++;
	             }



				System.out.println(i);
				System.out.println("Categories available:");
	    }
}


