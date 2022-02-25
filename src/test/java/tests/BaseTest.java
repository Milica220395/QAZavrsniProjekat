package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public abstract class BaseTest {

    public void clickSearchButton(ChromeDriver driver) {
        BasePage page = new BasePage(driver);
        page.searchInput.click();

    }

    public Proizvodi search(String item, ChromeDriver driver) {
        BasePage page = new BasePage(driver);
        page.searchInput.sendKeys(item);
        page.searchInput.sendKeys(Keys.ENTER);
        return new Proizvodi(driver);
    }

    public Cart clickCartLogo(ChromeDriver driver) {
        BasePage page = new BasePage(driver);
        page.cartLogo.click();
        return new Cart(driver);
    }

    public LoginPage clickLoginIcon(ChromeDriver driver) {
        BasePage page = new BasePage(driver);
        page.logInIcon.click();
        return new LoginPage(driver);
    }
}
