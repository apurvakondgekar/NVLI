import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class filters {
	private WebDriver driver;
	
	  @BeforeClass
	  public void setup() {

	  System.setProperty("webdriver.chrome.driver","/Users/Clicker/Documents/Apurva 2023/chromedriver_win32/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://indianculture.gov.in/audio/");
	  }

		    @Test
		    public void testMultipleCheckboxSelection() throws InterruptedException {
		    	
		    	List<WebElement> checkboxOption = driver.findElements(By.xpath("//div[@class='block-facet--checkbox'] //span[@class='facet-item__value']"));
		    	ArrayList<String> filters = new ArrayList();
		    	
		    	for (WebElement option: checkboxOption)
		    	{
		    		filters.add(option.getText());
		    		System.out.println(option.getText());
		    	}
		    	
		    	for(String filter : filters)
			    	{
		    		Thread.sleep(5000);
		    		selectCheckboxOption(filter);
			    		
			    		// Get the filtered data based on the selected checkboxes
				        int filtercount = getFilteredData(filter);
				        int resultscount = getresultscount(filter);
				        System.out.println(filtercount);
				        System.out.println(resultscount);
			    		Assert.assertEquals(filtercount, resultscount);
			    		
			    		selectCheckboxOption(filter);
			    	}
		    	
		    	
		    }
		    
		
				

		private void deselectCheckboxOption(String filter) {
				// TODO Auto-generated method stub
			driver.findElement(By.xpath("//input[@checked='checked']")).click();
			}

		// Simulates selecting a checkbox option
		    private void selectCheckboxOption(String option) throws InterruptedException {
		    	  // Find the element by its text using XPath
		    	
		    	WebElement element = driver.findElement(By.xpath("//span[@class='facet-item__value'][text()='" + option + "']"));
		        Assert.assertNotNull(element);
		   		System.out.println(option);
		        // Click on the element
		        element.click();
		    }
		    
		 // Retrieves the filtered data based on the selected checkboxes
		    private int getFilteredData(String filter) {
		        // Implement the logic to retrieve the filtered data
		    	 WebElement filtereddata = driver.findElement(By.xpath("//span[@class='facet-item__value' and text()='" + filter + "']/following-sibling::span"));
		    	
		   		
		   		
		   		String filtercount = filtereddata.getText();
		   		String[] countref = filtercount.split("[()]");
//		   		System.out.println("0 is"+countref[0]);
//		   		System.out.print("1 is"+countref[1]);
		   		int count =  Integer.parseInt(countref[1]);
	    	
		        return count;
		    }
		    
		    
		    
		    // Retrieves the results data based on the selected checkboxes
		    private int getresultscount(String filter) {
		        // Implement the logic to retrieve the filtered data
		    	 WebElement filtereddata = driver.findElement(By.xpath("//span[@class='facet-item__value' and text()='" + filter + "']/following-sibling::span"));
		    	 String filterresultscount = driver.findElement(By.xpath("//a[@class='btntool  btn-outline-secondary'][2]/b")).getText();
		   		
		   
		   		int count =  Integer.parseInt(filterresultscount);
	    	
		        return count;
		    }
		    
}
//		    	List<Integer> filtercount = new ArrayList();
//		    	
//		        // Simulate selecting multiple checkbox options
		        
		    	        

		        // Verify that the filter applies the logical AND operation between the selected options
		        // and that the filtered data matches all the selected checkbox options
//		        Assert.assertTrue(filteredData.length > 0, "Filtered data is not displayed.");
//		        Assert.assertTrue(hasOption(filteredData, "Option1"), "Filtered data does not contain Option1.");
//		        Assert.assertTrue(hasOption(filteredData, "Option2"), "Filtered data does not contain Option2.");
//		        Assert.assertTrue(hasOption(filteredData, "Option3"), "Filtered data does not contain Option3.");
		   // }

		    
//
//		    
//
//		    // Checks if a specific option exists in the filtered data
//		    private boolean hasOption(String[] filteredData, String option) {
//		        for (String data : filteredData) {
//		            if (data.equals(option)) {
//		                return true;
//		            }
//		        }
//		        return false;
//		    }
		