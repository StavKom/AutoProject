package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayMainPage {
    private WebDriver driver;
    @FindBy(id = "gh-ac")
    WebElement ebaySearch;
    @FindBy(id = "gh-btn")
    WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/div[2]/div[1]/span")
    WebElement ebayPrice;


    public EbayMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ebaySearchText() {
        ebaySearch.click();
        ebaySearch.clear();
        ebaySearch.sendKeys("bottle");
        searchButton.click();
    }

    public Float ebaytBottlePrice() {
        String FPE = ebayPrice.getText();
        String numbersOnly = FPE.replaceAll("[^\\d.]+", "");
        Float firstPriceEbay = Float.parseFloat(numbersOnly);
        return firstPriceEbay;
    }

}

