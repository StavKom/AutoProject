package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayMainPage {
    private WebDriver driver;
    @FindBy(id = "gh-ac")
    WebElement EbaySearch;
    @FindBy(id = "gh-btn")
    WebElement SearchButton;
    @FindBy(xpath = "//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/div[2]/div[1]/span")
    WebElement EbayPrice;


    public EbayMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void EbaySearchText() {
        EbaySearch.click();
        EbaySearch.clear();
        EbaySearch.sendKeys("bottle");
        SearchButton.click();
    }

    public Float EbaytBottlePrice() {
        String FPE = EbayPrice.getText();
        String numbersOnly = FPE.replaceAll("[^\\d.]+", "");
        Float firstpriceEbay = Float.parseFloat(numbersOnly);
        return firstpriceEbay;
    }

}

