package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Proizvodi extends BasePage {
    public Proizvodi(ChromeDriver driver) {
        super(driver);

            }

            public ArrayList<WebElement> getlistofProizvodi() {
                ArrayList<WebElement> listOfProizvodi = new ArrayList<>(driver.findElementsByXPath("//button[@class='megabtn']"));
                return listOfProizvodi;
            }

            public ArrayList<String> getTitlesOfAllProizvodi() {
                ArrayList<WebElement> listOfProizvodi = new ArrayList<>(driver.findElementsByXPath("//button[@class='megabtn']"));
                ArrayList<String> titles = new ArrayList<>();
                for (int i = 0; i < listOfProizvodi.size(); i++) {
                    String title = listOfProizvodi.get(i).getText();
                    titles.add(title);
                }
                return titles;


            }

            public String getTitleofProizvodi(WebElement proizvodi) {


                return proizvodi.getText();
            }
        }

