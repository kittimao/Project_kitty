package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.Driver;

public class ShopPage {
	
	
	public ShopPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//*[starts-with(@class,'ui-slider')][3]")
	public WebElement maxSliderButton;
	
	@FindBy(xpath="//span[starts-with(@class,'ui-slider')][1]")
	public WebElement minSliderButton;
	
	
	@FindBy (xpath="//button[contains(text(),'Filter')]")
	public WebElement filterButton;
	
	
	// create method for using in testcase
	public void adjustFilterFromMaxButton(int expected) {
		
		for(int i =500 ; i>=expected+1; i--) {
			maxSliderButton.sendKeys(Keys.ARROW_LEFT);
		
		}
	}
		public void adjustFilterFromMinButton(int expected) {
			
			for(int i =150 ; i<=expected-1; i++) {
				minSliderButton.sendKeys(Keys.ARROW_RIGHT);

	}
			
			
			
		}
}