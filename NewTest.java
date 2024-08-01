package Amazontest;

// Ensure this matches your actual package structure

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class NewTest {
    private WebDriver driver;
    private String baseUrl = "https://www.amazon.in";

    @Parameters("browser")
    @BeforeClass
    public void setup(String browser) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
    }

    @Test
    public void testAmazonTitle() {
        driver.get(baseUrl);
        System.out.println("Page Title is: " + driver.getTitle());
        assert driver.getTitle().contains("Amazon");
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
