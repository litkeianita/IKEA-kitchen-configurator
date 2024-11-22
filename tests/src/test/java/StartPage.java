import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class StartPage extends BasePage {

    private final By openENHETPlanner = By.xpath("//a[contains(@class, 'pub__btn') and contains(@href, 'ikea.com/addon-app/coro3/planner')]");
    private final By startFromScratchLocator = By.xpath("//p[text()='Start from scratch']");
    private final By wallCabinetsLocator = By.xpath("//h2[text()='Wall cabinets']");
    private final By firstElementLocator = By.xpath("//h2[text()='ENHET']");
    private final By closeButtonLocator = By.xpath("//span[text()='Close']");
    private final By finalizeButtonLocator = By.xpath("//skapa-140-2-2-button[text()='Finalize']");
    private final By addToBagButtonLocator = By.xpath("//skapa-140-2-2-button[text()='Add to bag']");
    private final By goToShoppingBagButtonLocator = By.xpath("//skapa-140-2-2-button[text()='Go to shopping bag']");
    private final By kitchenConfiguratorLinkLocator = By.xpath("//a[text()='Kitchen Configurator']");

    private final By menuButtonLocator = By.xpath("//skapa-140-2-2-icon-button[text()='Menu']");
    private final By menuCloseButtonLocator = By.xpath("//skapa-140-2-2-icon-button//slot[@name='closebutton-label' and text()='Close dialog']");
    private final By openButtonLocator = By.xpath("//button[@id='openButtonClick' and text()='Open']");
    private final By designCodeInputLocator = By.id("open-design-code-input-input");
    private final By openButtonLocatorWithCode = By.xpath("//skapa-140-2-2-button[text()='Open']");
    private final By openDesignButtonLocator = By.xpath("//span[text()='Open design']]");


    private final By shoppingBagEmptyLocator = By.xpath("//h1[text()='Your shopping bag is empty']");
    private final By shoppingBagLinkLocator = By.xpath("//a[@aria-label[contains(., 'Shopping bag')]]");




    public StartPage(WebDriver driver) {
        super(driver);
        this.driver.get("https://www.ikea.com/at/en/planners/");
    }

    public StartPage(WebDriver driver, String url) {
        super(driver);
        this.driver.get(url);
    }

    public void clickOpenENHETPlanner() {
        WebElement openENHETPlannerButton = waitForVisibilityAndReturn(openENHETPlanner);
        openENHETPlannerButton.click();
    }

    public void clickStartFromScratch() {
        WebElement startFromScratchButton = waitForVisibilityAndReturn(startFromScratchLocator);
        startFromScratchButton.click();
    }

    public void clickWallCabinets() {
        WebElement wallCabinetsElement = waitForVisibilityAndReturn(wallCabinetsLocator);
        wallCabinetsElement.click();
    }

    public void clickFirstElement() {
        WebElement firstElement = waitForVisibilityAndReturn(firstElementLocator);
        firstElement.click();
    }

    public void clickCloseButton() {
        WebElement closeButton = waitForVisibilityAndReturn(closeButtonLocator);
        closeButton.click();
    }

    public void clickFinalizeButton() {
        WebElement finalizeButton = waitForVisibilityAndReturn(finalizeButtonLocator);
        finalizeButton.click();
    }

    public void clickAddToBagButton() {
        WebElement addToBagButton = waitForVisibilityAndReturn(addToBagButtonLocator);
        addToBagButton.click();
    }

    public void clickGoToShoppingBagButton() {
        WebElement goToShoppingBagButton = waitForVisibilityAndReturn(goToShoppingBagButtonLocator);
        goToShoppingBagButton.click();
    }

    public void clickKitchenConfiguratorLink() {
        WebElement kitchenConfiguratorLink = waitForVisibilityAndReturn(kitchenConfiguratorLinkLocator);
        kitchenConfiguratorLink.click();
    }

    public void clickMenuButton() {
        WebElement menuButton = waitForVisibilityAndReturn(menuButtonLocator);
        menuButton.click();
    }

    public void clickMenuCloseButton() {
        WebElement menuCloseButton = waitForVisibilityAndReturn(menuCloseButtonLocator);
        menuCloseButton.click();
    }

    public void clickOpenInMenuButton() {
        WebElement openButton = waitForVisibilityAndReturn(openButtonLocator);
        openButton.click();
    }
    public void enterDesignCode(String code) {
        WebElement designCodeInput = waitForVisibilityAndReturn(designCodeInputLocator);
        designCodeInput.clear();
        designCodeInput.sendKeys(code);
    }
    public void clickOpenButtonWithCode() {
        WebElement openButton = waitForVisibilityAndReturn(openButtonLocatorWithCode);
        openButton.click();
    }
    public void clickOpenDesignButton() {
        WebElement openDesignButton = waitForVisibilityAndReturn(openDesignButtonLocator);
        openDesignButton.click();
    }
    public boolean isShoppingBagEmpty() {
        WebElement shoppingBagEmptyMessage = waitForVisibilityAndReturn(shoppingBagEmptyLocator);
        return shoppingBagEmptyMessage.isDisplayed();
    }
    public void clickShoppingBagLink() {
        WebElement shoppingBagLink = waitForVisibilityAndReturn(shoppingBagLinkLocator);
        shoppingBagLink.click();
    }
}