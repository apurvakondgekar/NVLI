import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class FortsofIndia_AlsoExploreslider {
	private WebDriver driver;


	  @BeforeClass
	  public void setup() {

		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=");
	  //System.setProperty("webdriver.chrome.driver","/Users/Apurva/chromedriver-win64/chromedriver.exe");
	  driver = new ChromeDriver(co);

	  driver.get("https://indianculture.gov.in/forts-of-india");
	  System.out.println(driver.getTitle());
	  }


//*************NOT WORKING***************//
	  @Test
	    public void testCategorySlider() throws InterruptedException {

	    	WebElement categorysection = driver.findElement(By.className("views-element-container"));
	    	WebElement rightButton = categorysection.findElement(By.xpath("(//button[@class='slick-next slick-arrow'])"));


	    	int i=0;
	    	ArrayList<String> categorynames = new ArrayList<>();
				for (int j=5; j>=0; j--)
				{
					Thread.sleep(1000);

				List<WebElement> categories = driver.findElements(By.className("thumbnail"));


	    		 for (WebElement category : categories)
				{

	    			 WebElement name = category.findElement(By.tagName("a"));
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

	    		 System.out.println("Categories available:" + i);

	  }

	  @AfterClass
	  public void teardown() {
	  	driver.quit();
	  }
}

//			for (int l=5; l>=0; l--)
//					{
//						Thread.sleep(1000);
//
//						List<WebElement> categories1 = categorybar.findElements(By.className("slick-active"));
//
//		    		 for (WebElement category : categories1)
//					{
//
//
//
////		    			 Actions actions = new Actions(driver);
////
////		    		        // Perform the middle button click action
////		    		        actions.click(category.findElement(By.tagName("a"))).contextClick().build().perform();
//
//
//
//
////		    			String clickonlinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
////
////							category.findElement(By.tagName("a")).sendKeys(clickonlinkTab);
////					int p = 1;
////
////		    			 String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
////
////		 				category.sendKeys(clickonlinkTab);
////		 				Thread.sleep(2000);
////		 				p++;
////
//					}

//		    		 for(int h=1;h<categorybar.findElements(By.tagName("img")).size();i++)
//		 			{

//		 				String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
//
//		 				categorybar.findElements(By.tagName("img")).get(h).sendKeys(clickonlinkTab);
//		 				Thread.sleep(2000);

//		 			}// o


		    		// rightButton.click();

					//}

//
//					//gets links
//					Set<String> abc=driver.getWindowHandles();//4
//					Iterator<String> it=abc.iterator();
//
//					ArrayList <String> pagetitlearray = new ArrayList<String>();
//
//
//
//					 int l1 = 0;
//					while(it.hasNext())
//					{
//
//					   driver.switchTo().window(it.next());
//					   pagetitlearray.add(driver.getTitle());
//					    System.out.println(driver.getTitle());
//					    l1++;
//
//					}
//
//
//					Set<String> uniqueURL = new HashSet<>(pagetitlearray);
//			        for (String element : uniqueURL)
//			        {
//			            System.out.println(element);
//
//		             }
//
//				System.out.println("Total urls:" + l1);
//
//				Assert.assertEquals(i,l1, "Number of links are not matching with the number of urls opened.");
//
//					}
//
//	    }
//}

//	private WebElement findElements(By id) {
//		// TODO Auto-generated method stub
//		return null;
//	}


//	  public void categoryclick()
//	  {
//
//		 WebElement footerdriver = driver.findElement(By.className("section-md-t3"));// Limiting webdriver scope
//
////				System.out.println(footerdriver.findElements(By.tagName("a")).size());
//
//				//Quick Links
//
//		 WebElement categorysection = driver.findElement(By.className("views-element-container"));
//	    	WebElement rightButton = categorysection.findElement(By.xpath("(//button[@type='button'])[12]"));
//
//				//title of each
//
//				//title of each linktext
//				ArrayList <String> textarray = new ArrayList<String>();
//				List<WebElement> textlist = quicklinks.findElements(By.tagName("a"));
//			int j=0;
//			for (WebElement textname : textlist)
//			{
//				String text = textname.getText();
//				textarray.add(text);
//			  System.out.println(text);
//			  j++;
//			}
//			System.out.println("Total linkstext:" + j)	;
//
//				//click on each link and check if the pages are opening-
//				for(int i=1;i<quicklinks.findElements(By.tagName("a")).size();i++)
//				{
//
//					String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
//
//					footerdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
//					Thread.sleep(2000);
//
//				}// opens all the tabs
//				Set<String> abc=driver.getWindowHandles();//4
//				Iterator<String> it=abc.iterator();
//
//				ArrayList <String> pagetitlearray = new ArrayList<String>();
//
//
//				 int k = 0;
//				 driver.switchTo().window(it.next());
//				while(it.hasNext())
//				{
//
//				   driver.switchTo().window(it.next());
//				   pagetitlearray.add(driver.getTitle());
//				    System.out.println(driver.getTitle());
//				    k++;
//
//				}
//				System.out.println("Total urls:" + k);
//
//				Assert.assertEquals(j,k, "Number of links are not matching with the number of urls opened.");
//
//				for (int i=0; i<footerdriver.findElements(By.tagName("a")).size(); i++)
////				{
//					boolean containsAll;
//					if (containsAll = pagetitlearray.containsAll(textarray))
//					{
//						System.out.println("Does list1 contain all elements of list2? " + containsAll);
//					}
//
//					else
//					{
//						System.out.println("Title is not matching ");
//					}
////
//				}

//					for (int i=0; i<footerdriver.findElements(By.tagName("a")).size(); i++)
////						{
//						 if (!list1.get(i).equals(list2.get(i))) {
//			                    areEqual = false;
//			                    break;
//		  				}
//






