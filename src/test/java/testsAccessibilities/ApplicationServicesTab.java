package testsAccessibilities;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.Services;
import testBase.AccessibilityBase;
import utilities.ConfigReader;

public class ApplicationServicesTab extends AccessibilityBase {
	Services sv = new Services();
    AccessibilityBase a11y;
    @Test
	public void testWebElementServicesTab() throws IOException {
        webDriver().get(ConfigReader.getProperty("url"));
        webDriver().manage().window().maximize();
        a11y.checkAccessibilityViolationsOfSelector("sv.servicesLink");
    }
}
