package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Cart extends BasePage {
    public Cart(ChromeDriver driver) {
        super(driver);
    }
        @FindBy (xpath = "//div[@class='col col-12 empty-cart-wrap']/h3")
        WebElement cartMessage;
    public String getCartMessageText(){ return cartMessage.getText();


    }
    }

