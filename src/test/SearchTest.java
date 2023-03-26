package test;

import org.openqa.selenium.chrome.ChromeDriver;
import pages.AmazonMainPage1;
import pages.ebayMainPage;
import pages.SeleniumBase;

public class SearchTest {

    public static void main(String[] args) throws InterruptedException {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.amazon.com/");
        AmazonMainPage1 mainPage = new AmazonMainPage1(driver);
        mainPage.searchText();
        mainPage.firstBottlePrice();
        Thread.sleep(2000);
        base.seleniumClose(driver);
         driver = base.seleniumInit("https://www.ebay.com/");
        ebayMainPage ebayMainPage= new ebayMainPage(driver);
        ebayMainPage.ebaySearchText();
        ebayMainPage.ebaytBottlePrice();
        Thread.sleep(1000);
        base.seleniumClose(driver);
    }






    }








