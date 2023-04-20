package testsAccessibilities;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.HomePage;
import testBase.AccessibilityBase;
import utilities.ConfigReader;

public class ApplicationHomePage extends AccessibilityBase {
	HomePage hp = new HomePage();
    AccessibilityBase a11y;
    @Test
	public void testWebElementHome() throws IOException {
        webDriver().get(ConfigReader.getProperty("url"));
        webDriver().manage().window().maximize();
        a11y.checkAccessibilityViolationsOfSelector("hp.homeLink");
    }
}
