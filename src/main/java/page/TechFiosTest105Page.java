package page;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechFiosTest105Page {

	WebDriver driver;
	
	public TechFiosTest105Page(WebDriver driver) {
		this.driver = driver;
	
}
	@FindBy(how = How.NAME, using = "allbox") WebElement TOOGLE_ALL_ELEMENT;
	@FindBy(how = How.NAME, using = "todo[4]") WebElement CHECK_BOX_4_ELEMENT;
	@FindBy(how = How.NAME, using = "todo[6]") WebElement CHECK_BOX_6_ELEMENT;
	@FindBy(how = How.NAME, using = "todo[2]") WebElement CHECK_BOX_2_ELEMENT;
	@FindBy(how = How.NAME, using = "todo[3]") WebElement CHECK_BOX_3_ELEMENT;
	@FindBy(how = How.NAME, using = "todo[5]") WebElement CHECK_BOX_5_ELEMENT;
	@FindBy(how = How.XPATH, using ="//input[@value=\"Remove\"]") WebElement REMOVE_BUTTON_ELEMENT;
	

	public void clickToggleAll() {
		TOOGLE_ALL_ELEMENT.click();
		
	}
	public void validateALLBoxChecked() {
		System.out.println(TOOGLE_ALL_ELEMENT.isSelected());
		System.out.println(CHECK_BOX_4_ELEMENT.isSelected());
		System.out.println(CHECK_BOX_6_ELEMENT.isSelected());
		System.out.println(CHECK_BOX_2_ELEMENT.isSelected());
		System.out.println(CHECK_BOX_3_ELEMENT.isSelected());
		System.out.println(CHECK_BOX_5_ELEMENT.isSelected());
	}
	
	public void checkOneItem() {
		CHECK_BOX_4_ELEMENT.click();
	}
	
	public void removeButtonAndValidate() {
		
		try{
			REMOVE_BUTTON_ELEMENT.click();
			System.out.println("item was removed");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}