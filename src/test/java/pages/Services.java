package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.DriverBase;



public class Services {
	public Services() {
		PageFactory.initElements(DriverBase.webDriver(), this);
	}
	
	@FindBy (xpath = "(//span [. ='Services'])[1]")
	public WebElement servicesLink;
	
	}
