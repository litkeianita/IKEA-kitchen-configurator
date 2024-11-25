import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import java.util.Random;
public class StartPage extends BasePage {
    private final By v_openENHETPlannerLocator = By.xpath("//a[contains(@class, 'pub__btn') and contains(@href, 'ikea.com/addon-app/coro3/planner')]");
    private final By v_startFromScratchLocator = By.xpath("//p[text()='Start from scratch'] or //button[text()='Start from scratch']");
    private final By v_addProductTabLocator = By.xpath("//button[text()='Add product']");
    private final By v_styleKitchenTabLocator = By.xpath("//button[text()='Style kitchen']");
    private final By backButtonLocator = By.xpath("//span[text()='Back']");

    private final By v_wallCabinetsLocator = By.xpath("//h2[text()='Wall cabinets']");
    private final By v_firstElementLocator = By.xpath("//h2[text()='ENHET']");
    private final By v_closeButtonLocator = By.xpath("//span[text()='Close']");
    private final By v_finalizeButtonLocator = By.xpath("//skapa-140-2-2-button[text()='Finalize']");
    private final By v_editDesignButtonLocator = By.xpath("//span[text()='Edit design']");

    private final By v_addToBagButtonLocator = By.xpath("//skapa-140-2-2-button[text()='Add to bag']");
    private final By v_goToShoppingBagButtonLocator = By.xpath("//skapa-140-2-2-button[text()='Go to shopping bag']");
    private final By v_kitchenConfiguratorLinkLocator = By.xpath("//a[text()='Kitchen Configurator']");

    private final By v_menuButtonLocator = By.xpath("//skapa-140-2-2-icon-button[text()='Menu']");
    private final By v_menuCloseButtonLocator = By.xpath("//skapa-140-2-2-icon-button//slot[@name='closebutton-label' and text()='Close dialog']");
    private final By v_exitPlannerLocator = By.xpath("//span[normalize-space(text())='Exit planner']");
    private final By leaveButtonLocator = By.xpath("//span[text()='Leave']");

    private final By v_openButtonLocator = By.xpath("//button[@id='openButtonClick' and text()='Open']");
    private final By designCodeInputLocator = By.id("open-design-code-input-input");
    private final By v_openButtonLocatorWithCode = By.xpath("//skapa-140-2-2-button[text()='Open']");
    private final By v_openDesignButtonLocator = By.xpath("//span[text()='Open design']]");


    private final By shoppingBagEmptyLocator = By.xpath("//h1[text()='Your shopping bag is empty']");
    private final By v_shoppingBagLinkLocator = By.xpath("//a[@aria-label[contains(., 'Shopping bag')]]");
    private final By v_viewDesignInPlannerLocator = By.xpath("//span[text()='View design in planner']");
    private final By v_showIncludedPartsLocator = By.xpath("//a[@class='cart-ingka-link' and text()='Show included parts']");

    private final By openADesignButtonLocator = By.xpath("//span[@class='btn__label' and text()='Open a design']");

    
    public StartPage(WebDriver driver) {
        super(driver);
        this.driver.get("https://www.ikea.com/at/en/planners/");
        System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public StartPage(WebDriver driver, String url) {
        super(driver);
        this.driver.get(url);
        System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void e_clickOpenENHETPlanner() {
        WebElement openENHETPlannerButton = waitForVisibilityAndReturn(v_openENHETPlannerLocator);
        openENHETPlannerButton.click();
        System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void e_clickStartFromScratch() {
        WebElement startFromScratchButton = waitForVisibilityAndReturn(v_startFromScratchLocator);
        startFromScratchButton.click();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}
    public void e_clickAddProduct() {
        WebElement addProductTab = waitForVisibilityAndReturn(v_addProductTabLocator);
        addProductTab.click();
        e_clickOnAProductType();
        e_clickOnItem();
        clickBackButton();

    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}
    public void e_clickStyleKitchen() {
        WebElement styleKitchenTab = waitForVisibilityAndReturn(v_styleKitchenTabLocator);
        styleKitchenTab.click();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}
    public void e_clickOnAProductType() {
        WebElement wallCabinetsElement = waitForVisibilityAndReturn(v_wallCabinetsLocator);
        e_clickAddProduct();
        wallCabinetsElement.click();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}
    public void e_clickOnItem() {
        WebElement firstElement = waitForVisibilityAndReturn(v_firstElementLocator);
        firstElement.click();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}
    public void clickBackButton() {
        WebElement backButton = waitForVisibilityAndReturn(backButtonLocator);
        backButton.click();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}
    public void e_clickX() {
        WebElement closeButton = waitForVisibilityAndReturn(v_closeButtonLocator);
        closeButton.click();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}
    public void e_clickFinalise() {
        WebElement finalizeButton = waitForVisibilityAndReturn(v_finalizeButtonLocator);
        finalizeButton.click();
        e_clickAddToShoppingBag();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}
    public void e_clickEditDesign() {
        WebElement editDesignButton = waitForVisibilityAndReturn(v_editDesignButtonLocator);
        editDesignButton.click();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}
    public void e_clickAddToShoppingBag() {
        WebElement addToBagButton = waitForVisibilityAndReturn(v_addToBagButtonLocator);
        addToBagButton.click();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}

    public void e_clickGoToShoppingBag() {
        WebElement goToShoppingBagButton = waitForVisibilityAndReturn(v_goToShoppingBagButtonLocator);
        goToShoppingBagButton.click();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}

    public void e_clickKitchenConfiguratorLink() {
        WebElement kitchenConfiguratorLink = waitForVisibilityAndReturn(v_kitchenConfiguratorLinkLocator);
        kitchenConfiguratorLink.click();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}

    public void e_clickMenu() {
        WebElement menuButton = waitForVisibilityAndReturn(v_menuButtonLocator);
        menuButton.click();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}

    public void e_clickMenuCloseButton() {
        WebElement menuCloseButton = waitForVisibilityAndReturn(v_menuCloseButtonLocator);
        menuCloseButton.click();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}

    public void e_clickOpen() {
        WebElement openButton = waitForVisibilityAndReturn(v_openButtonLocator);
        openButton.click();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}
    public void e_writeCodeAndClickOpen(String code) {
        WebElement designCodeInput = waitForVisibilityAndReturn(designCodeInputLocator);
        designCodeInput.clear();
        designCodeInput.sendKeys(code);
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}
    public void e_clickOpenButtonWithCode() {
        WebElement openButton = waitForVisibilityAndReturn(v_openButtonLocatorWithCode);
        openButton.click();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}
    public void e_clickOpenDesignButton() {
        WebElement openDesignButton = waitForVisibilityAndReturn(v_openDesignButtonLocator);
        openDesignButton.click();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}
    public void e_clickShoppingBagLink() {
        WebElement shoppingBagLink = waitForVisibilityAndReturn(v_shoppingBagLinkLocator);
        shoppingBagLink.click();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}
    public void e_clickExitPlanner() {
        WebElement exitPlannerButton = waitForVisibilityAndReturn(v_exitPlannerLocator);
        exitPlannerButton.click();
        clickLeaveButton();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}
    public void clickLeaveButton() {
        WebElement leaveButton = waitForVisibilityAndReturn(leaveButtonLocator);
        leaveButton.click();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}

    public void e_clickViewDesingInPlanner() {
        WebElement kitchenConfiguratorLink = waitForVisibilityAndReturn(v_viewDesignInPlannerLocator);
        kitchenConfiguratorLink.click();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}
    public void e_clickShowIncludedParts() {
        WebElement showIncludedPartsButton = waitForVisibilityAndReturn(v_showIncludedPartsLocator);
        showIncludedPartsButton.click();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}

    public void e_clickPreDefinedENHET(String code) {
        WebElement openADesignButton = waitForVisibilityAndReturn(openADesignButtonLocator);
        openADesignButton.click();
        WebElement designCodeInput = waitForVisibilityAndReturn(designCodeInputLocator);
        designCodeInput.clear();
        designCodeInput.sendKeys(code);
        e_clickOpenButtonWithCode();
    System.out.println("Running: " + Thread.currentThread().getStackTrace()[1].getMethodName());}
}