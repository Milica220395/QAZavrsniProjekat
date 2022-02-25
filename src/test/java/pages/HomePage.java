package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

    public class HomePage extends BasePage {

        String homePageUrl = "https://gigatron.rs/";

        String sectionXpath = "//div[@class='header-logo']/a";


        @FindBy(id = "main-nav-1")
        private WebElement prenosniRacunari;


        @FindBy(xpath = "//a[@class='catmenu-main']")
        private WebElement laptopRacunari;

        @FindBy(xpath = "//button[@class='megabtn']")
        public WebElement proizvodi;


        public HomePage(ChromeDriver driver) {
            super(driver);
            driver.get(homePageUrl);
        }

        public Proizvodi clickOntheProizvodi() {
            proizvodi.click();
            return new Proizvodi(driver);
        }

        public PrenosniRacunari clickOnthePrenosniRacunari() {
            prenosniRacunari.click();
            return new PrenosniRacunari(driver);
        }

        public LaptopRacunari clickOntheLaptopRacunari() {
            laptopRacunari.click();
            return new LaptopRacunari(driver);
        }

    }


