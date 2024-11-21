import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.net.MalformedURLException;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTestStart {

    private WebDriver driver;

    private final String exampleCode = "s4dy2m";
    private final String exampleCode2 = "S4DHCW";

    @Before
    public void setup() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        this.driver = new RemoteWebDriver(new URL("http://selenium:4444/wd/hub"), options);
        this.driver.manage().window().maximize();
    }

    @Test
    public void testingEmptyCart() {
        StartPage basePage = new StartPage(this.driver);
       
    }

    @Test
    public void testingThroughBasicScenario() {
        StartPage basePage = new StartPage(this.driver);
        basePage.clickOpenENHETPlanner();
        basePage.clickStartFromScratch();
        basePage.clickWallCabinets();
        basePage.clickFirstElement();
        basePage.clickCloseButton();
        basePage.clickFinalizeButton();
        basePage.clickAddToBagButton();
        basePage.clickGoToShoppingBagButton();
        basePage.clickKitchenConfiguratorLink();
    }
    
    @Test
    public void testingImportingFromMenu() {
        StartPage basePage = new StartPage(this.driver);
        basePage.clickOpenENHETPlanner();
        basePage.clickStartFromScratch();
        
        basePage.clickMenuButton();
        basePage.clickMenuCloseButton();
        basePage.clickMenuButton();
        basePage.clickOpenInMenuButton();
        basePage.enterDesignCode(exampleCode);
        basePage.clickOpenButtonWithCode();
        basePage.clickOpenDesignButton();

        basePage.clickFinalizeButton();
        basePage.clickAddToBagButton();
        basePage.clickGoToShoppingBagButton();
        basePage.clickKitchenConfiguratorLink();
    }

    @After
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}