package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class LaptopRacunari<laptopRacunari> extends BasePage{
    public LaptopRacunari(ChromeDriver driver) {
        super(driver);
            }

            @FindBy(xpath =  "//button[@class='megabtn']")
            private WebElement proizvodiButton;


            public PrenosniRacunari clickOnPrenosniRacunari () {
                WebElement PrenosniRacunari = driver.findElementById("main-nav-1");
                PrenosniRacunari.click();
                return new PrenosniRacunari(driver);


                }
            }

