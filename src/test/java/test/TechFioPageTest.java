package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.TechFiosTest105Page;
import util.BrowserFactory;

public class TechFioPageTest {

	WebDriver driver;
	
	
	@Test
	public void userShouldBeAbletoClickToggleAll() {
		
		
		driver = BrowserFactory.init();
		TechFiosTest105Page testPage = PageFactory.initElements(driver, TechFiosTest105Page.class);
		
		testPage.clickToggleAll();
		testPage.validateALLBoxChecked();
		
		BrowserFactory.tearDown();
	
		
	}

}
