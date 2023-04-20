package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.DriverBase;



public class HomePage {
	public HomePage() {
		PageFactory.initElements(DriverBase.webDriver(), this);
	}
	
	@FindBy (xpath = "(//span [. ='Home'])[1]")
	public WebElement homeLink;
	
	}
