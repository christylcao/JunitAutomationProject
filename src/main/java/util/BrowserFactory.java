package util;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class BrowserFactory {

	static WebDriver driver;
	static String browser = "chrome";
	static String url = "https://techfios.com/test/105/";
	
	@Before
	public static WebDriver init() {
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		return driver;
	}
	
	@After
	public static void tearDown() {
		
		driver.close();
		driver.quit();
	}
}
