import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.net.MalformedURLException;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.ArrayList;
import java.util.List;

public class SeleniumTestStart {

    private WebDriver driver;

    private final String exampleCode = "s4dy2m";
    private final String exampleCode2 = "S4DHCW";
    private static final List<String> successfulTests = new ArrayList<>();
    private static final List<String> unSuccessfulTests = new ArrayList<>();

    @Before
    public void setup() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        this.driver = new RemoteWebDriver(new URL("http://selenium:4444/wd/hub"), options);
        this.driver.manage().window().maximize();
    }

    @Test
    public void testingRandomPathEdgeCoverage100(){
        try {
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
            successfulTests.add("testingRandomPathEdgeCoverage100");
        } catch (Exception e) {
            System.out.println("Test 'testingRandomPathEdgeCoverage100' failed: " + e.getMessage());
            unSuccessfulTests.add(e.getMessage());
            throw e;
        }
    }
    @Test
    public void testingRandomPathEdgeCoverage50(){
        try {
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
            successfulTests.add("testingRandomPathEdgeCoverage50");
        } catch (Exception e) {
            System.out.println("Test 'testingRandomPathEdgeCoverage50' failed: " + e.getMessage());
            unSuccessfulTests.add(e.getMessage());
            throw e;
        }
    }
    @Test
    public void testingWeightedRandomPathEdgeCoverage100(){
        try {
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
            successfulTests.add("testingWeightedRandomPathEdgeCoverage100");
        } catch (Exception e) {
            System.out.println("Test 'testingWeightedRandomPathEdgeCoverage100' failed: " + e.getMessage());
            unSuccessfulTests.add(e.getMessage());
            throw e; // Ensure the test still fails in JUnit
        }
    }
    @Test
    public void testingWeightedRandomPathEdgeCoverage50(){
        try {
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
        successfulTests.add("testingWeightedRandomPathEdgeCoverage50");
        } catch (Exception e) {
            System.out.println("Test 'testingWeightedRandomPathEdgeCoverage50' failed: " + e.getMessage());
            unSuccessfulTests.add(e.getMessage());
            throw e;
        }
    }

    @After
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
    @AfterClass
    public static void printSuccessfulTests() {
        System.out.println("Successful tests:");
        for (String testName : successfulTests) {
            System.out.println("+ " + testName);
        }
    }
    @AfterClass
    public static void printUnSuccessfulTests() {
        System.out.println("Unsuccessful tests with error message:");
        for (String testName : unSuccessfulTests) {
            System.out.println("- " + testName);
        }
    }
}