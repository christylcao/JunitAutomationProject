package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.TechFiosTest105Page;
import util.BrowserFactory;

public class TechFioPageTest2 {

	WebDriver driver;
	TechFiosTest105Page testPage = PageFactory.initElements(driver, TechFiosTest105Page.class);
	
	
	@Test
	public void userRemovedOneItemByCheckingBox() {
		
		driver = BrowserFactory.init();
		TechFiosTest105Page testPage = PageFactory.initElements(driver, TechFiosTest105Page.class);
		
		testPage.checkOneItem();
		testPage.removeButtonAndValidate();
		
		BrowserFactory.tearDown();
		
	}

}
