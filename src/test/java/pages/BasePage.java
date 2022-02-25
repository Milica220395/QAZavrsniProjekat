package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public ChromeDriver driver;

    @FindBy(id = "logi-img")
    public WebElement gigatronLogo;

    @FindBy(xpath = "//div[@class='search-icon']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='search-container']")
    public WebElement searchInput;

    @FindBy(xpath = "//div[@class='cart-preview']")
    public WebElement cartLogo;

    @FindBy(xpath = "//a[@href='login']")
    public WebElement logInIcon;

    public BasePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void acceptCookies() {
        WebElement acceptCookiesButton = driver.findElementByXPath("//div[@class='form-buttons']");
        if (isElementPresent(acceptCookiesButton)) {
            acceptCookiesButton.click();
        }
    }

    // private boolean isElementPresent(WebElement acceptCookiesButton) {
    //  return false;
    // }

    public boolean isElementPresent(WebElement element)
    {
        try {
            return element.isDisplayed();
        } catch (final Exception e) {
            return false;
        }
    }


    public void clickCartLogo() {
        cartLogo.click();

    }
}
