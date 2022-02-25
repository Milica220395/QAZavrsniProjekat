package tests;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Cart;
import pages.HomePage;
import pages.Proizvodi;

import java.util.ArrayList;

public class AddToCart {
    @Test
    public void testAddToCart() throws InterruptedException{
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        HomePage homePage = new HomePage(driver);
        homePage.acceptCookies();
        homePage.clickCartLogo();
        Cart cart = new Cart(driver);
        Thread.sleep(3000);
    assert cart.getCartMessageText().equals("Vaša korpa je prazna");

    }
}
