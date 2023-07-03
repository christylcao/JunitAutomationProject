package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.TechFiosTest105Page;
import util.BrowserFactory;

public class TechFioPageTest3 {

	WebDriver driver;
	
	
	@Test
	public void userRemovedAllItemsByToggleAll() {
		
		driver = BrowserFactory.init();
		TechFiosTest105Page testPage = PageFactory.initElements(driver, TechFiosTest105Page.class);
		testPage.clickToggleAll();
		testPage.removeButtonAndValidate();
		
		BrowserFactory.tearDown();
	}
	
}
