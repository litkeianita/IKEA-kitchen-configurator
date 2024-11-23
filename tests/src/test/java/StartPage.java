import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

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
    private final By v_designCodeInputLocator = By.id("open-design-code-input-input");
    private final By v_openButtonLocatorWithCode = By.xpath("//skapa-140-2-2-button[text()='Open']");
    private final By v_openDesignButtonLocator = By.xpath("//span[text()='Open design']]");


    private final By shoppingBagEmptyLocator = By.xpath("//h1[text()='Your shopping bag is empty']");
    private final By v_shoppingBagLinkLocator = By.xpath("//a[@aria-label[contains(., 'Shopping bag')]]");
    private final By v_kitchenConfiguratorLocator = By.xpath("//a[text()='Kitchen Configurator']");



    public StartPage(WebDriver driver) {
        super(driver);
        this.driver.get("https://www.ikea.com/at/en/planners/");
    }

    public StartPage(WebDriver driver, String url) {
        super(driver);
        this.driver.get(url);
    }

    public void e_clickOpenENHETPlanner() {
        WebElement openENHETPlannerButton = waitForVisibilityAndReturn(v_openENHETPlannerLocator);
        openENHETPlannerButton.click();
    }

    public void e_clickStartFromScratch() {
        WebElement startFromScratchButton = waitForVisibilityAndReturn(v_startFromScratchLocator);
        startFromScratchButton.click();
    }
    public void e_clickAddProduct() {
        WebElement addProductTab = waitForVisibilityAndReturn(v_addProductTabLocator);
        addProductTab.click();
        e_clickOnAProductType();
        e_clickOnItem();
        clickBackButton();

    }
    public void e_clickStyleKitchen() {
        WebElement styleKitchenTab = waitForVisibilityAndReturn(v_styleKitchenTabLocator);
        styleKitchenTab.click();
    }
    public void e_clickOnAProductType() {
        WebElement wallCabinetsElement = waitForVisibilityAndReturn(v_wallCabinetsLocator);
        e_clickAddProduct();
        wallCabinetsElement.click();
    }
    public void e_clickOnItem() {
        WebElement firstElement = waitForVisibilityAndReturn(v_firstElementLocator);
        firstElement.click();
    }
    public void clickBackButton() {
        WebElement backButton = waitForVisibilityAndReturn(backButtonLocator);
        backButton.click();
    }
    public void e_clickX() {
        WebElement closeButton = waitForVisibilityAndReturn(v_closeButtonLocator);
        closeButton.click();
    }
    public void e_clickFinalise() {
        WebElement finalizeButton = waitForVisibilityAndReturn(v_finalizeButtonLocator);
        finalizeButton.click();
        e_clickAddToShoppingBag();
    }
    public void e_clickEditDesign() {
        WebElement editDesignButton = waitForVisibilityAndReturn(v_editDesignButtonLocator);
        editDesignButton.click();
    }
    public void e_clickAddToShoppingBag() {
        WebElement addToBagButton = waitForVisibilityAndReturn(v_addToBagButtonLocator);
        addToBagButton.click();
    }

    public void e_clickGoToShoppingBag() {
        WebElement goToShoppingBagButton = waitForVisibilityAndReturn(v_goToShoppingBagButtonLocator);
        goToShoppingBagButton.click();
    }

    public void e_clickKitchenConfiguratorLink() {
        WebElement kitchenConfiguratorLink = waitForVisibilityAndReturn(v_kitchenConfiguratorLinkLocator);
        kitchenConfiguratorLink.click();
    }

    public void e_clickMenu() {
        WebElement menuButton = waitForVisibilityAndReturn(v_menuButtonLocator);
        menuButton.click();
    }

    public void e_clickMenuCloseButton() {
        WebElement menuCloseButton = waitForVisibilityAndReturn(v_menuCloseButtonLocator);
        menuCloseButton.click();
    }

    public void e_clickOpen() {
        WebElement openButton = waitForVisibilityAndReturn(v_openButtonLocator);
        openButton.click();
    }
    public void e_writeCodeAndClickOpen(String code) {
        WebElement designCodeInput = waitForVisibilityAndReturn(v_designCodeInputLocator);
        designCodeInput.clear();
        designCodeInput.sendKeys(code);
        e_clickOpenButtonWithCode();
        e_clickOpenDesignButton();
    }
    public void e_clickOpenButtonWithCode() {
        WebElement openButton = waitForVisibilityAndReturn(v_openButtonLocatorWithCode);
        openButton.click();
    }
    public void e_clickOpenDesignButton() {
        WebElement openDesignButton = waitForVisibilityAndReturn(v_openDesignButtonLocator);
        openDesignButton.click();
    }
    public void e_clickShoppingBagLink() {
        WebElement shoppingBagLink = waitForVisibilityAndReturn(v_shoppingBagLinkLocator);
        shoppingBagLink.click();
    }
    public void e_clickExitPlanner() {
        WebElement exitPlannerButton = waitForVisibilityAndReturn(v_exitPlannerLocator);
        exitPlannerButton.click();
        clickLeaveButton();
    }
    public void clickLeaveButton() {
        WebElement leaveButton = waitForVisibilityAndReturn(leaveButtonLocator);
        leaveButton.click();
    }

    public void e_clickViewDesingInPlanner() {
        WebElement kitchenConfiguratorLink = waitForVisibilityAndReturn(v_kitchenConfiguratorLocator);
        kitchenConfiguratorLink.click();
    }

}