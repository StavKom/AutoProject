package test;

import org.openqa.selenium.chrome.ChromeDriver;
import pages.AmazonMainPage;
import pages.EbayMainPage;
import pages.SeleniumBase;

public class SearchTest {

    public static void main(String[] args) throws InterruptedException {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.amazon.com/");
        AmazonMainPage mainPage = new AmazonMainPage(driver);
        mainPage.searchText();
        mainPage.firstBottlePrice();
        Thread.sleep(2000);
        base.seleniumClose(driver);
         driver = base.seleniumInit("https://www.ebay.com/");
        EbayMainPage ebayMainPage= new EbayMainPage(driver);
        ebayMainPage.ebaySearchText();
        ebayMainPage.ebaytBottlePrice();
        Thread.sleep(1000);
        base.seleniumClose(driver);
    }






    }








