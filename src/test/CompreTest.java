package test;

import org.openqa.selenium.chrome.ChromeDriver;
import pages.AmazonMainPage1;
import pages.EbayMainPage;
import pages.SeleniumBase;

public class CompreTest {
    public static void main(String[] args) throws InterruptedException {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.amazon.com/");
        AmazonMainPage1 mainPage = new AmazonMainPage1(driver);
        mainPage.searchtext();
        Float AmazonPrice = mainPage.FirstBottlePrice();
        System.out.println("The first price of a bottle in amazon is "+ mainPage.FirstBottlePrice());
        driver.get("https://www.ebay.com/");
        EbayMainPage ebayMainPage = new EbayMainPage(driver);
        ebayMainPage.EbaySearchText();
        Float EbayPrice = ebayMainPage.EbaytBottlePrice();
        System.out.println("The first price of a bottle in Ebay is "+ ebayMainPage.EbaytBottlePrice());
        Thread.sleep(3000);
        driver.close();
        if (EbayPrice < AmazonPrice) {
            System.out.println("Ebay First Bottle is cheaper");
        } else {
            System.out.println("Amazon First Bottle is cheaper");
        }

        base.seleniumClose(driver);
    }
}

