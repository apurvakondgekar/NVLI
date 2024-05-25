import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AjantaCaves_Caves {
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


	//***********Caves*************//

	  @Test (enabled=true)
	  public void Caves () throws InterruptedException {
		  System.out.println("Step 2");

		  driver.get("https://indianculture.gov.in/ajanta/caves");
		  System.out.println(driver.getTitle());

		  // Find all pager item links
		  List<WebElement> subcategories = driver.findElements(By.className("grid-group-item"));
		  System.out.println(subcategories.size());
		  ArrayList<String> h2Texts = new ArrayList<>();

		  //********Reads the subcat titles**********//
		  for(WebElement subcat : subcategories)
		  {
			  Thread.sleep(500);
			  WebElement Title = subcat.findElement(By.tagName("h2"));
			  String h2Text = Title.getText();
			  h2Texts.add(h2Text);
			  System.out.println(Title.getText());

			  //********clicking on the subcat****************//
		  }

	  }

	//***********Getting list of filters *************//


//***********Painting*************//

	  @Test (enabled=true)
	  public void Paintings () throws InterruptedException {
		  System.out.println("Step 2");

		  driver.get("https://indianculture.gov.in/ajanta/painting");
		  System.out.println(driver.getTitle());


		  WebElement expand = driver.findElement(By.xpath("//div[@class='card'][2]"));
		  System.out.println("Clicking on collapsible menu");
		  expand.click();

		  Thread.sleep(500);
		  WebElement expandbox = expand.findElement(By.xpath(".//div[@class='card-body']"));
		  List <WebElement> cards = expandbox.findElements(By.xpath("//div[@class='col-md-4 p-1']"));

		  for(WebElement card : cards)
		  {

			  WebElement name = card.findElement(By.tagName("h2"));
			  System.out.println(name.getText());
		  }

//		  --------------------------------
		  WebElement subcatbox = driver.findElement(By.xpath("//div[@class='views-view-grid horizontal cols-4 clearfix']"));
		   List<WebElement> subcatlist = subcatbox.findElements(By.xpath(".//div[@class='col-xs-6 col-lg-3 item p-1 grid-group-item']"));

		   // Find the <ul> element
	        WebElement ulElement = subcatbox.findElement(By.xpath("//ul[@class='pager__items js-pager__items']")); // Replace with your desired locator

	        // Find the <li> elements within the <ul> element
	        List<WebElement> liElements = ulElement.findElements(By.tagName("li")); // Replace with your desired locator
	        int countofpages = liElements.size()-2;
	        System.out.println(liElements.size());
	        // Click the <li> elements in sequence
	        for (int i = 1; i < liElements.size() - 1; i++) {

	        	Thread.sleep(1000);
	            // Add any additional logic or assertions after each click if needed

			   subcatbox = driver.findElement(By.xpath("//div[@class='views-view-grid horizontal cols-4 clearfix']"));
			   subcatlist = subcatbox.findElements(By.xpath(".//div[@class='col-xs-6 col-md-3 col-lg-3 item p-1 grid-group-item']"));

		   for(WebElement cat : subcatlist)
		   {

			   WebElement title = cat.findElement(By.tagName("h2"));
			   System.out.println(title.getText());
			   Assert.assertNotNull(title);

			  // WebElement subt = cat.findElement(By.tagName("p"));
			 //  System.out.println(subt.getText());
			  // Assert.assertNotNull(subt);


		   }
		 //  ulElement = subcatbox.findElement(By.xpath("//ul[@class='pager__items js-pager__items']"));
      	//liElements = ulElement.findElements(By.tagName("li"));


		int j= i+1;
		System.out.println("j = "+j);
      	String k = String.valueOf(j);
      	System.out.println("k = "+k);
      	if(j<=countofpages)
      	{
      	driver.findElement(By.xpath("//li[@class='pager__item is-active']/following-sibling::li")).click();
      	}
      	else
      	{
      	break;
      	}
    // Click the current <li> element
      	//  liElements.get(i).click();


		   }
	  }

	//***********Getting list of filters *************//

	  @Test(enabled=false)
	  public void Audiospage3filters () throws InterruptedException {

		  //Verify the filter block and filter title
		//  WebElement filterblock = driver.findElement(By.id("sidefilterview"));

		//  Assert.assertEquals(filterblock.findElement(By.tagName("h2")).getText(), "Filters");

		  List<WebElement> filterULs = driver.findElements(By.className("block-facet--checkbox"));

		  for(WebElement Ul : filterULs)
		  {

		   WebElement filtername = driver.findElement(By.tagName("h3"));
		   Assert.assertNotNull(filtername, "Filter name is missing");

		   ArrayList<String> filters = new ArrayList<>();
		   List<WebElement> filterElements = Ul.findElements(By.className("facet-item__value"));
		   for (WebElement filterElement : filterElements) {

			  if(!filterElement.getText().isBlank())
			  {
		       filters.add(filterElement.getText());
			  }
		   }
		   System.out.println(filters);

		   for (String filter: filters)
		   {
			   WebElement liElement = driver.findElement(By.xpath("//span[contains(text(), '" + filter + "')]"));

			   String filtercount = liElement.findElement(By.xpath("./following-sibling::span[@class='facet-item__count']")).getText();
				//String filtercount = liElement.findElement(By.xpath("//following-sibling::span[@class='facet-item__count']")).getText();
				System.out.println(filtercount);
				String[] countref = filtercount.replaceAll("[^0-9]+", "").split("\\s+");
				//String[] countref = filtercount.replaceAll("[^0-9]", "").split("\\s+");

				//String[] countref = filtercount.split("[()]");
//		   		System.out.println("0 is"+countref[0]);
//		   		System.out.print("1 is"+countref[1]);

		   		//String[] count = countref[1].split(")");
		   		String resultscount = driver.findElement(By.xpath("//a[@class='btntool  btn-outline-secondary'][2]/b")).getText();
		   		liElement.click();

		   		Thread.sleep(1000);
		   		String filterresultscount = driver.findElement(By.xpath("//a[@class='btntool  btn-outline-secondary'][2]/b")).getText();
		   		Assert.assertEquals(countref[0], filterresultscount);

		   		driver.findElement(By.xpath("//input[@checked='checked']")).click();


		   }

//		   List<WebElement> Lis = Ul.findElements(By.tagName("li"));
//
//		   		for (int i = 0; i<Lis.size(); i++)
//		   		{
//
//
//		   	//	WebElement checkbox = Lis.get(i).findElement(By.tagName("input"));
//		   		//Assert.assertTrue(!checkbox.isEnabled());
//
//		   		Thread.sleep(2000);
//		   		WebElement filter = Lis.get(i).findElement(By.tagName("span"));
//		   		Assert.assertNotNull(filter);
//		   		System.out.println(filter.getText());
//
//
//		   		String filtercount = Lis.get(i).findElement(By.className("facet-item__count")).getText();
//		   		String[] countref = filtercount.split("[()]");
////		   		System.out.println("0 is"+countref[0]);
////		   		System.out.print("1 is"+countref[1]);
//
//		   		//String[] count = countref[1].split(")");
//		   		String resultscount = driver.findElement(By.xpath("//a[@class='btntool  btn-outline-secondary'][2]/b")).getText();
//		   		Lis.get(i).click();
//
//		   		Thread.sleep(1000);
//		   		String filterresultscount = driver.findElement(By.xpath("//a[@class='btntool  btn-outline-secondary'][2]/b")).getText();
//		   		Assert.assertEquals(countref[1], filterresultscount);
//
//		   		driver.findElement(By.xpath("//input[@checked='checked']")).click();
//
//		   		String resultscount1 = driver.findElement(By.xpath("//a[@class='btntool  btn-outline-secondary'][2]/b")).getText();
//		   		Assert.assertEquals(resultscount, resultscount1);
//		   		}


		  }

	  }



}

//		  WebElement subcatbox = driver.findElement(By.xpath("//div[@class='views-view-grid horizontal cols-4 clearfix']"));
//		   List<WebElement> subcatlist = subcatbox.findElements(By.xpath(".//div[@class='col-xs-6 col-lg-3 item p-1 grid-group-item']"));
//
//		   // Find the <ul> element
//	        WebElement ulElement = subcatbox.findElement(By.xpath("//ul[@class='pager__items js-pager__items']")); // Replace with your desired locator
//
//	        // Find the <li> elements within the <ul> element
//	        List<WebElement> liElements = ulElement.findElements(By.tagName("li")); // Replace with your desired locator
//
//	        // Click the <li> elements in sequence
//	        for (int i = 1; i < liElements.size(); i++)  {
//
//	        	Thread.sleep(1000);
//	            // Add any additional logic or assertions after each click if needed
//
//			   subcatbox = driver.findElement(By.xpath("//div[@class='views-view-grid horizontal cols-4 clearfix']"));
//			   subcatlist = subcatbox.findElements(By.xpath(".//div[@class='col-xs-6 col-lg-3 item p-1 grid-group-item']"));
//
//		   for(WebElement cat : subcatlist)
//		   {
//			   String idPrefix = "video-embed-html5"; // Initial four characters of the ID
//			   WebElement thumbnail = cat.findElement(By.xpath("//*[starts-with(@id, '" + idPrefix + "')]"));
//			  // WebElement thumbnail = cat.findElement(By.id("video-embed-html5*"));
//			   Assert.assertTrue(thumbnail.isDisplayed());
//
//			   WebElement title = cat.findElement(By.tagName("h2"));
//			   System.out.println(title.getText());
//			   Assert.assertNotNull(title);
//
//			  // WebElement subt = cat.findElement(By.tagName("p"));
//			 //  System.out.println(subt.getText());
//			  // Assert.assertNotNull(subt);
//
//
//		   }
//		   ulElement = subcatbox.findElement(By.xpath("//ul[@class='pager__items js-pager__items']"));
//       	liElements = ulElement.findElements(By.tagName("li"));
//       	int j= i+1;
//       	// Click the current <li> element
//           liElements.get(j).click();
//		  // navigateToPage(driver, "2");
//		   }



