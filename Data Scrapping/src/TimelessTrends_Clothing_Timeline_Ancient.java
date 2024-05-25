import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TimelessTrends_Clothing_Timeline_Ancient {
	private WebDriver driver;


	  @BeforeMethod
	  public void setup() {
		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=");
	  //System.setProperty("webdriver.chrome.driver","/Users/Apurva/chromedriver-win64/chromedriver.exe");
	  driver = new ChromeDriver(co);

	  }

	  @AfterMethod
	  public void teardown() {
	  	driver.quit();
	  }


	//***********Getting list of Results (method 2 perfect)*************//

	  @Test (enabled=true)
	  public void Ancient () throws InterruptedException {

		  driver.get("https://indianculture.gov.in/timeless-trends/accessories-ancient-timeline");
		  System.out.println(driver.getTitle());


		  // Find all pager item links
		  List<WebElement> subcategories = driver.findElements(By.className("timeline__card"));
		  System.out.println(subcategories.size());
		  ArrayList<String> h2Texts = new ArrayList<>();

		  //********Reads the subcat titles**********//
		  for(WebElement subcat : subcategories)
		  {
			  Thread.sleep(500);
			  WebElement Title = subcat.findElement(By.className("time__month"));
			  String h2Text = Title.getText();
			  h2Texts.add(h2Text);
			  System.out.println(Title.getText());

			  List <WebElement> timeline = subcat.findElements(By.className("h--timeline-date"));
			  if(timeline.size()>0)
			  {

				  System.out.println("Sub-results start--");
//				  System.out.println(subcat.findElement(By.xpath("//time[@class='time secd_level']")).getText());

				  WebElement timebox = subcat.findElement(By.className("h--timeline-events"));
				  List <WebElement>	liElements = timebox.findElements(By.className("h--timeline-event"));

				  WebElement datebox = subcat.findElement(By.className("h--timeline-dates"));
				  List <WebElement>	dates = datebox.findElements(By.className("h--timeline-date"));

				  for(int i = 0; i < liElements.size(); i++)
				  {

//					  System.out.println(liElements.get(i).getText());
					  if(i >= 1)
					  {
						  Thread.sleep(500);
						  dates.get(i).click();
					  }

				  Thread.sleep(1000);
				  System.out.println(liElements.get(i).findElement(By.className("time__month")).getText());



				  }
				  System.out.println("Sub-results end--");
			  }
			  else
			  {
				  continue;
			  }

			  //********clicking on the subcat****************//
		  }

	  }

		//***********Medieval*************//

		  @Test (enabled=true)
		  public void Medieval () throws InterruptedException {

			  driver.get("https://indianculture.gov.in/node/2895542");
			  System.out.println(driver.getTitle());


			  // Find all pager item links
			  List<WebElement> subcategories = driver.findElements(By.className("timeline__card"));
			  System.out.println(subcategories.size());
			  ArrayList<String> h2Texts = new ArrayList<>();

			  //********Reads the subcat titles**********//
			  for(WebElement subcat : subcategories)
			  {
				  Thread.sleep(500);
				  WebElement Title = subcat.findElement(By.className("time__month"));
				  String h2Text = Title.getText();
				  h2Texts.add(h2Text);
				  System.out.println(Title.getText());

				  List <WebElement> timeline = subcat.findElements(By.className("h--timeline-date"));
				  if(timeline.size()>0)
				  {

					  System.out.println("Sub-results start--");
//					  System.out.println(subcat.findElement(By.xpath("//time[@class='time secd_level']")).getText());

					  WebElement timebox = subcat.findElement(By.className("h--timeline-events"));
					  List <WebElement>	liElements = timebox.findElements(By.className("h--timeline-event"));

					  WebElement datebox = subcat.findElement(By.className("h--timeline-dates"));
					  List <WebElement>	dates = datebox.findElements(By.className("h--timeline-date"));

					  for(int i = 0; i < liElements.size(); i++)
					  {

//						  System.out.println(liElements.get(i).getText());
						  if(i >= 1)
						  {
							  Thread.sleep(500);
							  dates.get(i).click();
						  }

					  Thread.sleep(1000);
					  System.out.println(liElements.get(i).findElement(By.className("time__month")).getText());



					  }
					  System.out.println("Sub-results end--");
				  }
				  else
				  {
					  continue;
				  }

				  //********clicking on the subcat****************//
			  }

		  }

//***********Medieval*************//

		  @Test (enabled=true)
		  public void Colonial () throws InterruptedException {

			  driver.get("https://indianculture.gov.in/timeless-trends/accessories-colonial-timeline");
			  System.out.println(driver.getTitle());


			  // Find all pager item links
			  List<WebElement> subcategories = driver.findElements(By.className("timeline__card"));
			  System.out.println(subcategories.size());
			  ArrayList<String> h2Texts = new ArrayList<>();

			  //********Reads the subcat titles**********//
			  for(WebElement subcat : subcategories)
			  {
				  Thread.sleep(500);
				  WebElement Title = subcat.findElement(By.className("time__month"));
				  String h2Text = Title.getText();
				  h2Texts.add(h2Text);
				  System.out.println(Title.getText());

				  List <WebElement> timeline = subcat.findElements(By.className("h--timeline-date"));
				  if(timeline.size()>0)
				  {

					  System.out.println("Sub-results start--");
//					  System.out.println(subcat.findElement(By.xpath("//time[@class='time secd_level']")).getText());

					  WebElement timebox = subcat.findElement(By.className("h--timeline-events"));
					  List <WebElement>	liElements = timebox.findElements(By.className("h--timeline-event"));

					  WebElement datebox = subcat.findElement(By.className("h--timeline-dates"));
					  List <WebElement>	dates = datebox.findElements(By.className("h--timeline-date"));

					  for(int i = 0; i < liElements.size(); i++)
					  {

//						  System.out.println(liElements.get(i).getText());
						  if(i >= 1)
						  {
							  Thread.sleep(500);
							  dates.get(i).click();
						  }

					  Thread.sleep(1000);
					  System.out.println(liElements.get(i).findElement(By.className("time__month")).getText());



					  }
					  System.out.println("Sub-results end--");
				  }
				  else
				  {
					  continue;
				  }

				  //********clicking on the subcat****************//
			  }

		  }




}



