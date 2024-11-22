import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class StartPage extends BasePage {

    private final By v_openENHETPlannerLocator = By.xpath("//a[contains(@class, 'pub__btn') and contains(@href, 'ikea.com/addon-app/coro3/planner')]");
    private final By v_startFromScratchLocator = By.xpath("//p[text()='Start from scratch']");
    private final By v_wallCabinetsLocator = By.xpath("//h2[text()='Wall cabinets']");
    private final By v_firstElementLocator = By.xpath("//h2[text()='ENHET']");
    private final By v_closeButtonLocator = By.xpath("//span[text()='Close']");
    private final By v_finalizeButtonLocator = By.xpath("//skapa-140-2-2-button[text()='Finalize']");
    private final By v_addToBagButtonLocator = By.xpath("//skapa-140-2-2-button[text()='Add to bag']");
    private final By v_goToShoppingBagButtonLocator = By.xpath("//skapa-140-2-2-button[text()='Go to shopping bag']");
    private final By v_kitchenConfiguratorLinkLocator = By.xpath("//a[text()='Kitchen Configurator']");

    private final By v_menuButtonLocator = By.xpath("//skapa-140-2-2-icon-button[text()='Menu']");
    private final By v_menuCloseButtonLocator = By.xpath("//skapa-140-2-2-icon-button//slot[@name='closebutton-label' and text()='Close dialog']");
    private final By v_openButtonLocator = By.xpath("//button[@id='openButtonClick' and text()='Open']");
    private final By v_designCodeInputLocator = By.id("open-design-code-input-input");
    private final By v_openButtonLocatorWithCode = By.xpath("//skapa-140-2-2-button[text()='Open']");
    private final By v_openDesignButtonLocator = By.xpath("//span[text()='Open design']]");


    private final By v_shoppingBagEmptyLocator = By.xpath("//h1[text()='Your shopping bag is empty']");
    private final By v_shoppingBagLinkLocator = By.xpath("//a[@aria-label[contains(., 'Shopping bag')]]");




    public StartPage(WebDriver driver) {
        super(driver);
        this.driver.get("https://www.ikea.com/at/en/planners/");
    }

    public StartPage(WebDriver driver, String url) {
        super(driver);
        this.driver.get(url);
    }

    public void e_clickOpenENHETPlanner() {
        WebElement openENHETPlannerButton = waitForVisibilityAndReturn(openENHETPlannerLocator);
        openENHETPlannerButton.click();
    }

    public void e_clickStartFromScratch() {
        WebElement startFromScratchButton = waitForVisibilityAndReturn(startFromScratchLocator);
        startFromScratchButton.click();
    }

    public void e_clickWallCabinets() {
        WebElement wallCabinetsElement = waitForVisibilityAndReturn(wallCabinetsLocator);
        wallCabinetsElement.click();
    }

    public void e_clickFirstElement() {
        WebElement firstElement = waitForVisibilityAndReturn(firstElementLocator);
        firstElement.click();
    }

    public void e_clickCloseButton() {
        WebElement closeButton = waitForVisibilityAndReturn(closeButtonLocator);
        closeButton.click();
    }

    public void e_clickFinalizeButton() {
        WebElement finalizeButton = waitForVisibilityAndReturn(finalizeButtonLocator);
        finalizeButton.click();
    }

    public void e_clickAddToBagButton() {
        WebElement addToBagButton = waitForVisibilityAndReturn(addToBagButtonLocator);
        addToBagButton.click();
    }

    public void e_clickGoToShoppingBagButton() {
        WebElement goToShoppingBagButton = waitForVisibilityAndReturn(goToShoppingBagButtonLocator);
        goToShoppingBagButton.click();
    }

    public void e_clickKitchenConfiguratorLink() {
        WebElement kitchenConfiguratorLink = waitForVisibilityAndReturn(kitchenConfiguratorLinkLocator);
        kitchenConfiguratorLink.click();
    }

    public void e_clickMenuButton() {
        WebElement menuButton = waitForVisibilityAndReturn(menuButtonLocator);
        menuButton.click();
    }

    public void e_clickMenuCloseButton() {
        WebElement menuCloseButton = waitForVisibilityAndReturn(menuCloseButtonLocator);
        menuCloseButton.click();
    }

    public void e_clickOpenInMenuButton() {
        WebElement openButton = waitForVisibilityAndReturn(openButtonLocator);
        openButton.click();
    }
    public void e_enterDesignCode(String code) {
        WebElement designCodeInput = waitForVisibilityAndReturn(designCodeInputLocator);
        designCodeInput.clear();
        designCodeInput.sendKeys(code);
    }
    public void e_clickOpenButtonWithCode() {
        WebElement openButton = waitForVisibilityAndReturn(openButtonLocatorWithCode);
        openButton.click();
    }
    public void e_clickOpenDesignButton() {
        WebElement openDesignButton = waitForVisibilityAndReturn(openDesignButtonLocator);
        openDesignButton.click();
    }
    public boolean e_isShoppingBagEmpty() {
        WebElement shoppingBagEmptyMessage = waitForVisibilityAndReturn(shoppingBagEmptyLocator);
        return shoppingBagEmptyMessage.isDisplayed();
    }
    public void e_clickShoppingBagLink() {
        WebElement shoppingBagLink = waitForVisibilityAndReturn(shoppingBagLinkLocator);
        shoppingBagLink.click();
    }
}