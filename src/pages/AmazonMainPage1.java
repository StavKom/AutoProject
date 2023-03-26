package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMainPage1 {
    private WebDriver driver;
    @FindBy(id = "twotabsearchtextbox")
    WebElement search;
    @FindBy(id = "nav-search-submit-button")
    WebElement searchBtn;
    @FindBy (css ="span[class='a-price-whole']")
    WebElement firstPrice;

    public AmazonMainPage1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void searchText() {
        search.click();
        search.clear();
        search.sendKeys("bottle");
        searchBtn.click();
    }
    public Float firstBottlePrice() throws InterruptedException {
        Thread.sleep(3000);
        String priceAsText = firstPrice.getText();
        String numbersOnlyebay = priceAsText.replaceAll("[^\\d.]+", "");
        Float firstBottlePrice =Float.parseFloat(numbersOnlyebay);
        return firstBottlePrice;

    }
}
