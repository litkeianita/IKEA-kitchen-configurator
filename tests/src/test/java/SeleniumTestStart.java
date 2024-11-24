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
    public void testingRandomPathEdgeCoverage100(){
        
        StartPage basePage = new StartPage(this.driver);
        
        basePage.e_clickOpenENHETPlanner();
        basePage.e_clickStartFromScratch();
        basePage.e_clickMenu();
        basePage.e_clickOpen();
        basePage.e_writeCodeAndClickOpen(exampleCode);
        basePage.e_clickAddProduct();
        basePage.e_clickFinalise();
        basePage.e_clickGoToShoppingBag();
        basePage.e_clickShowIncludedParts();
        //basePage.e_clickRemoveDesing();
        basePage.e_clickViewDesingInPlanner();
        basePage.e_clickMenu();
        basePage.e_clickExitPlanner();
        basePage.e_clickStartFromScratch();
        basePage.e_clickStyleKitchen();
        basePage.e_clickOnAProductType();
        //basePage.e_clickOnDifferentStyle();
        basePage.e_clickOnItem();
        basePage.e_clickMenu();
        basePage.e_clickOpen();
        basePage.e_clickX();
        basePage.e_clickExitPlanner();
        basePage.e_clickPreDefinedENHET(exampleCode2);
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        basePage.e_clickFinalise();
        basePage.e_clickGoToShoppingBag();
        basePage.e_clickShowIncludedParts();
        //basePage.e_clickRemoveDesing();
        //basePage.e_clickShowIncludedParts();
        //basePage.e_clickRemoveDesing();
        //basePage.e_clickShowIncludedParts();
        basePage.e_clickViewDesingInPlanner();
        basePage.e_clickMenu();
        basePage.e_clickOpen();
        basePage.e_clickX();
        basePage.e_clickStartFromScratch();
        basePage.e_clickX();
        basePage.e_clickStartFromScratch();
        basePage.e_clickAddProduct();
        basePage.e_clickStyleKitchen();
        basePage.e_clickFinalise();
        basePage.e_clickGoToShoppingBag();
        //basePage.e_clickShowIncludedParts();
        //basePage.e_clickRemoveDesing();
        //basePage.e_clickShowIncludedParts();
        //basePage.e_clickRemoveDesing();
        //basePage.e_clickShowIncludedParts();
        //basePage.e_clickRemoveDesing();
        //basePage.e_clickShowIncludedParts();
        //basePage.e_clickRemoveDesing();
        //basePage.e_clickShowIncludedParts();
        basePage.e_clickViewDesingInPlanner();
        basePage.e_clickMenu();
        basePage.e_clickExitPlanner();
        basePage.e_clickStartFromScratch();
        basePage.e_clickAddProduct();
        basePage.e_clickStyleKitchen();
        basePage.e_clickAddProduct();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        basePage.e_clickOnAProductType();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        //basePage.e_clickOnDifferentStyle();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        basePage.e_clickGoToShoppingBag();
        basePage.e_clickShowIncludedParts();
        basePage.e_clickViewDesingInPlanner();
        basePage.e_clickStyleKitchen();
        basePage.e_clickAddProduct();
        basePage.e_clickFinalise();
        basePage.e_clickGoToShoppingBag();
        basePage.e_clickShowIncludedParts();
        basePage.e_clickViewDesingInPlanner();
        basePage.e_clickStyleKitchen();
        //basePage.e_clickOnDifferentStyle();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        //basePage.e_clickOnDifferentStyle();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        basePage.e_clickStyleKitchen();
        basePage.e_clickAddProduct();
        basePage.e_clickOnAProductType();
        basePage.e_clickOnItem();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        basePage.e_clickStyleKitchen();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        basePage.e_clickStyleKitchen();
        basePage.e_clickAddProduct();
        basePage.e_clickStyleKitchen();
        //basePage.e_clickOnDifferentStyle();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        basePage.e_clickAddProduct();
        basePage.e_clickOnAProductType();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        //basePage.e_clickOnDifferentStyle();
        basePage.e_clickAddProduct();
        basePage.e_clickStyleKitchen();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        basePage.e_clickAddProduct();
        basePage.e_clickStyleKitchen();
        basePage.e_clickAddProduct();
        basePage.e_clickOnAProductType();
    }
    @Test
    public void testingRandomPathEdgeCoverage50(){

        StartPage basePage = new StartPage(this.driver);

        basePage.e_clickStartFromScratch();
        basePage.e_clickMenu();
        basePage.e_clickOpen();
        basePage.e_clickX();
        basePage.e_clickExitPlanner();
        basePage.e_clickAddProduct();
        basePage.e_clickStyleKitchen();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        basePage.e_clickOnAProductType();
        basePage.e_clickGoToShoppingBag();
        basePage.e_clickShowIncludedParts();
        basePage.e_clickViewDesingInPlanner();
        basePage.e_clickPreDefinedENHET(exampleCode2);
        //basePage.e_clickOnDifferentStyle();//basePage.e_clickRemoveDesing();
        basePage.e_clickOnItem();
    }
    @Test
    public void testingWeightedRandomPathEdgeCoverage100(){
        StartPage basePage = new StartPage(this.driver);
        basePage.e_clickStartFromScratch();
        basePage.e_clickMenu();
        basePage.e_clickOpen();
        basePage.e_clickX();
        basePage.e_clickOpen();
        basePage.e_clickX();
        basePage.e_clickExitPlanner();
        basePage.e_clickStartFromScratch();
        basePage.e_clickMenu();
        basePage.e_clickStartFromScratch();
        basePage.e_clickAddProduct();
        basePage.e_clickStyleKitchen();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        basePage.e_clickAddProduct();
        basePage.e_clickOnAProductType();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        basePage.e_clickFinalise();
        basePage.e_clickGoToShoppingBag();
        basePage.e_clickShowIncludedParts();
        basePage.e_clickViewDesingInPlanner();
        basePage.e_clickMenu();
        basePage.e_clickOpen();
        basePage.e_clickX();
        basePage.e_clickExitPlanner();
        basePage.e_clickPreDefinedENHET(exampleCode2);
        basePage.e_clickStyleKitchen();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        basePage.e_clickFinalise();
        basePage.e_clickGoToShoppingBag();
        basePage.e_clickShowIncludedParts();
        basePage.e_clickViewDesingInPlanner();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        basePage.e_clickAddProduct();
        basePage.e_clickStyleKitchen();
        basePage.e_clickAddProduct();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        basePage.e_clickAddProduct();
        basePage.e_clickFinalise();
        basePage.e_clickGoToShoppingBag();
        basePage.e_clickShowIncludedParts();
        basePage.e_clickViewDesingInPlanner();
        basePage.e_clickStyleKitchen();
        //basePage.e_clickOnDifferentStyle();
        basePage.e_clickAddProduct();
        basePage.e_clickOnAProductType();
        basePage.e_clickFinalise();
        basePage.e_clickGoToShoppingBag();
        basePage.e_clickShowIncludedParts();
        //basePage.e_clickRemoveDesing();
        //basePage.e_clickShowIncludedParts();
        //basePage.e_clickRemoveDesing();
        //basePage.e_clickShowIncludedParts();
        //basePage.e_clickRemoveDesing();
        //basePage.e_clickShowIncludedParts();
        //basePage.e_clickRemoveDesing();
        //basePage.e_clickShowIncludedParts();
        //basePage.e_clickRemoveDesing();
        //basePage.e_clickShowIncludedParts();
        basePage.e_clickViewDesingInPlanner();
        basePage.e_clickFinalise();
        basePage.e_clickGoToShoppingBag();
        basePage.e_clickShowIncludedParts();
        //basePage.e_clickRemoveDesing();
        //basePage.e_clickShowIncludedParts();
        //basePage.e_clickRemoveDesing();
        //basePage.e_clickShowIncludedParts();
        basePage.e_clickViewDesingInPlanner();
        basePage.e_clickMenu();
        basePage.e_clickOpen();
        basePage.e_writeCodeAndClickOpen(exampleCode);
        basePage.e_clickAddProduct();
        basePage.e_clickOnAProductType();
        basePage.e_clickOnItem();
        basePage.e_clickOnItem();
        basePage.e_clickFinalise();
        basePage.e_clickGoToShoppingBag();
        basePage.e_clickShowIncludedParts();
        basePage.e_clickViewDesingInPlanner();
        basePage.e_clickFinalise();
        basePage.e_clickGoToShoppingBag();
        basePage.e_clickShowIncludedParts();
        basePage.e_clickViewDesingInPlanner();
        basePage.e_clickAddProduct();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
    }
    @Test
    public void testingWeightedRandomPathEdgeCoverage50(){
        StartPage basePage = new StartPage(this.driver);
        basePage.e_clickStartFromScratch();
        basePage.e_clickMenu();
        basePage.e_clickExitPlanner();
        basePage.e_clickStartFromScratch();
        basePage.e_clickAddProduct();
        basePage.e_clickStyleKitchen();
        basePage.e_clickAddProduct();
        basePage.e_clickStyleKitchen();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        basePage.e_clickOnAProductType();
        basePage.e_clickOnAProductType();
        basePage.e_clickFinalise();
        basePage.e_clickEditDesign();
        basePage.e_clickMenu();
        basePage.e_clickExitPlanner();
        basePage.e_clickPreDefinedENHET(exampleCode2);
    }
    @After
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}