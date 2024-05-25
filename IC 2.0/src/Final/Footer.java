package Final;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Footer {
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
	  public void footer () throws InterruptedException {
		 driver.get("https://iciitb.nvli.in/");

//		 System.out.println(driver.findElements(By.tagName("a")).size());


			WebElement footerdriver = driver.findElement(By.className("section-md-t3"));// Limiting webdriver scope

//			System.out.println(footerdriver.findElements(By.tagName("a")).size());

			//Quick Links

			WebElement quicklinks = footerdriver.findElement(By.id("block-policies"));
			String qltitle = quicklinks.findElement(By.id("block-policies-menu")).getText();

//			System.out.println(quicklinks.findElements(By.tagName("a")).size());
			Assert.assertEquals(qltitle, "Quick Links");

			//Indian Culture App

			WebElement icapp = footerdriver.findElement(By.id("block-fottterappblock"));
			String icapptitle = icapp.findElement(By.tagName("h2")).getText();

//			System.out.println(icapp.findElements(By.tagName("a")).size());
			Assert.assertEquals(icapptitle, "Indian Culture App");

			//title of each linktext
			ArrayList <String> textarray = new ArrayList<>();
			List<WebElement> textlist = quicklinks.findElements(By.tagName("a"));
		int j=0;
		for (WebElement textname : textlist)
		{
			String text = textname.getText();
			textarray.add(text);
		  System.out.println(text);
		  j++;
		}
		System.out.println("Total linkstext:" + j)	;

			//click on each link and check if the pages are opening-
			for(int i=1;i<quicklinks.findElements(By.tagName("a")).size();i++)
			{

				String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);

				footerdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
				Thread.sleep(2000);

			}// opens all the tabs
			Set<String> abc=driver.getWindowHandles();//4
			Iterator<String> it=abc.iterator();

			ArrayList <String> pagetitlearray = new ArrayList<>();


			 int k = 0;
			 driver.switchTo().window(it.next());
			while(it.hasNext())
			{

			   driver.switchTo().window(it.next());
			   pagetitlearray.add(driver.getTitle());
			    System.out.println(driver.getTitle());
			    k++;

			}
			System.out.println("Total urls:" + k);

			Assert.assertEquals(j,k, "Number of links are not matching with the number of urls opened.");

//			for (int i=0; i<footerdriver.findElements(By.tagName("a")).size(); i++)
////			{
//				boolean containsAll;
//				if (containsAll = pagetitlearray.containsAll(textarray))
//				{
//					System.out.println("Does list1 contain all elements of list2? " + containsAll);
//				}
//
//				else
//				{
//					System.out.println("Title is not matching ");
//				}
////
//			}

//				for (int i=0; i<footerdriver.findElements(By.tagName("a")).size(); i++)
////					{
//					 if (!list1.get(i).equals(list2.get(i))) {
//		                    areEqual = false;
//		                    break;
//	  				}
//

	  }

}

