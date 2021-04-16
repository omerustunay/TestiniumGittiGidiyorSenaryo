package com.gittigidiyor;

import org.openqa.selenium.WebDriver;

public class GittigidiyorSeleniumPractice {

    public static void main(String[] args) throws InterruptedException {
        GittigidiyorMethods gittigidiyorMethods = new GittigidiyorMethods();
        WebDriver driver = null;

        try {
            gittigidiyorMethods.openChromeBrowser();
            gittigidiyorMethods.gotoGittigidiyor();
            gittigidiyorMethods.enterUsernameAndPassword();
            gittigidiyorMethods.searchProduct();
            gittigidiyorMethods.pageScrollDown();
            gittigidiyorMethods.clickPage();
            gittigidiyorMethods.pageScrollDown2();
            gittigidiyorMethods.clickAddBasket();
            gittigidiyorMethods.pageScrollDown3();
            gittigidiyorMethods.clickAddItemBtn();
            gittigidiyorMethods.clickAddBasketBtn();
            gittigidiyorMethods.clickBasketBtn();
            gittigidiyorMethods.clickRemoveBtn();
            Thread.sleep(2000);
            gittigidiyorMethods.controlBasket();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            // browser kapatmak için
            if (driver != null)
                driver.quit();
            // driver.close();
        }

    }
}
