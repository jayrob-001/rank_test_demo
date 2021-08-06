package functional.testBase;

import io.github.bonigarcia.seljup.SeleniumJupiter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

@ExtendWith(SeleniumJupiter.class)
public abstract class TestBase {

    public WebDriver driver;

    @BeforeSuite
    public static void setupSuite() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeTest
    public void setupTest() {
        driver = new ChromeDriver();
    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    protected WebDriver getDriver() {
        return driver;
    }

}
