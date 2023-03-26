package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMainPage1 {
    private WebDriver driver;
    @FindBy(id = "twotabsearchtextbox")
    WebElement search;
    @FindBy(id = "nav-search-submit-button")
    WebElement SearchButton;
    @FindBy (className ="a-price-whole")
    WebElement FirstPrice;
   /* WebElement FirstPrice = driver.findElement(By.cssSelector("#search .s-result-item:nth-of-type(1) .a-price-whole"));*/

    public AmazonMainPage1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void searchtext() {
        search.click();
        search.clear();
        search.sendKeys("bottle");
        SearchButton.click();
    }
    public Float FirstBottlePrice() throws InterruptedException {
        Thread.sleep(3000);
        String priceAsText = driver.findElement(By.cssSelector("span[class='a-price-whole']")).getText();
        String numbersOnlyebay = priceAsText.replaceAll("[^\\d.]+", "");
        Float firstbottleprice =Float.parseFloat(numbersOnlyebay);
        return firstbottleprice;

    }
}