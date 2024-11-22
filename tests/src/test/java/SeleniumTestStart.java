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
        basePage.e_clickShoppingBagLink();
        assertTrue(basePage.isShoppingBagEmpty());
    }

    @Test
    public void testingThroughBasicScenario() {
        StartPage basePage = new StartPage(this.driver);
        basePage.e_clickOpenENHETPlanner();
        basePage.e_clickStartFromScratch();
        basePage.e_clickWallCabinets();
        basePage.e_clickFirstElement();
        basePage.e_clickCloseButton();
        basePage.e_clickFinalizeButton();
        basePage.e_clickAddToBagButton();
        basePage.e_clickGoToShoppingBagButton();
        basePage.e_clickKitchenConfiguratorLink();
    }
    
    @Test
    public void testingImportingFromMenu() {
        StartPage basePage = new StartPage(this.driver);
        basePage.e_clickOpenENHETPlanner();
        basePage.e_clickStartFromScratch();
        
        basePage.e_clickMenuButton();
        basePage.e_clickMenuCloseButton();
        basePage.e_clickMenuButton();
        basePage.e_clickOpenInMenuButton();
        basePage.e_enterDesignCode(exampleCode);
        basePage.e_clickOpenButtonWithCode();
        basePage.e_clickOpenDesignButton();

        basePage.e_clickFinalizeButton();
        basePage.e_clickAddToBagButton();
        basePage.e_clickGoToShoppingBagButton();
        basePage.e_clickKitchenConfiguratorLink();
    }

    @After
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}