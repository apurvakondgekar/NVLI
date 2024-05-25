package test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest2 {
	

	@Test
	public void HomePageTest() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("firefox");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://10.129.155.98:4444"), caps);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
