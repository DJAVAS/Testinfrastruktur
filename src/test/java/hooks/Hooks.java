package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private static WebDriver driver;

    @Before
    public void setUp() {
        String currentDirectory = System.getProperty("user.dir");
        System.setProperty("webdriver.gecko.driver", currentDirectory + "/geckodriver");
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
    public static WebDriver getDriver() {
        return driver;
    }
}
