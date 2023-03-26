package test;

import org.openqa.selenium.chrome.ChromeDriver;
import pages.AmazonMainPage;
import pages.EbayMainPage;
import pages.SeleniumBase;

public class CompreTest {
    public static void main(String[] args) throws InterruptedException {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.amazon.com/");
        AmazonMainPage mainPage = new AmazonMainPage(driver);
        mainPage.searchText();
        Float amazonPrice = mainPage.firstBottlePrice();
        System.out.println("The first price of a bottle in amazon is "+ mainPage.firstBottlePrice());
        driver.get("https://www.ebay.com/");
        EbayMainPage ebayMainPage = new EbayMainPage(driver);
        ebayMainPage.ebaySearchText();
        Float ebayPrice = ebayMainPage.ebaytBottlePrice();
        System.out.println("The first price of a bottle in Ebay is "+ ebayMainPage.ebaytBottlePrice());
        Thread.sleep(3000);
        driver.close();
        if (ebayPrice < amazonPrice) {
            System.out.println("Ebay First Bottle is cheaper");
        } else {
            System.out.println("Amazon First Bottle is cheaper");
        }

        base.seleniumClose(driver);
    }
}

