package test;

import org.openqa.selenium.chrome.ChromeDriver;
import pages.AmazonMainPage1;
import pages.EbayMainPage;
import pages.SeleniumBase;

public class SearchTest {

    public static void main(String[] args) throws InterruptedException {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.amazon.com/");
        AmazonMainPage1 mainPage = new AmazonMainPage1(driver);
        mainPage.searchtext();
        mainPage.FirstBottlePrice();
        Thread.sleep(2000);
        base.seleniumClose(driver);
         driver = base.seleniumInit("https://www.ebay.com/");
        EbayMainPage ebayMainPage= new EbayMainPage(driver);
        ebayMainPage.EbaySearchText();
        ebayMainPage.EbaytBottlePrice();
        Thread.sleep(1000);
        base.seleniumClose(driver);
    }






    }








