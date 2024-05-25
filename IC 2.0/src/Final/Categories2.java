package Final;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Categories2 {
	private WebDriver driver;


	  @BeforeClass
	  public void setup() {

	  System.setProperty("webdriver.chrome.driver","/Users/Clicker/Documents/Apurva 2023/chromedriver_win32/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://iciitb.nvli.in/");
	  }

	  @AfterClass
	  public void teardown() {
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

				// opening each link

		    	for (int j=5; j>=0; j--)
					{
						Thread.sleep(1000);

					List<WebElement> categories = driver.findElements(By.className("pad15"));
					int k=0;

		    		 for (WebElement category : categories)
					{
//			             String categoryText = category.getText();
//			             categorynames.add(categoryText);
//
////			             if(categoryText.length()>0)
////			             {
////
////			            	 System.out.println(categoryText);
////
////			            	 i++;
////					     }
		    			 String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);

							category.sendKeys(clickonlinkTab);
							Thread.sleep(2000);
							k++;

					}
		    		 rightButton.click();

					}

				//gets links
					Set<String> abc=driver.getWindowHandles();//4
					Iterator<String> it=abc.iterator();

					ArrayList <String> pagetitlearray = new ArrayList<>();



					 driver.switchTo().window(it.next());
					while(it.hasNext())
					{

					   driver.switchTo().window(it.next());
					   pagetitlearray.add(driver.getTitle());
					    System.out.println(driver.getTitle());


					}

					 int l = 0;
					Set<String> uniqueURL = new HashSet<>(pagetitlearray);
			        for (String element : uniqueURL)
			        {
			            System.out.println(element);
			             l++;
		             }

	  }



//				//opening category links in a new tab
//		int m;
//				for(m=1;m<driver.findElements(By.className("itembox")).size();m++)
//				{
//
//					String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
//
//					driver.findElements(By.className("itembox")).get(m).sendKeys(clickonlinkTab);
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
//				Assert.assertEquals(m,k, "Number of links are not matching with the number of urls opened.");
//
//
//
//	    }
//

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

		  }





