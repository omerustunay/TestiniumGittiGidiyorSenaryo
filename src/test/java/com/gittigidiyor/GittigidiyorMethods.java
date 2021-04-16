package com.gittigidiyor;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GittigidiyorMethods {

    public WebDriver driver;

    public void controlBasket() {
        String text = driver.findElement(GittigidiyorObjeRepo.controlBasketPath).getText();
        if(text.contains("Sepetinizde ürün bulunmamaktadır.")){
            System.out.println("sepet boştur.");
        }
        else {
            Assert.assertTrue(false); // testi fail dondurur
            System.out.println("sepet dolu.");
        }
    }

    public void clickRemoveBtn() {
        driver.findElement(GittigidiyorObjeRepo.clickRemoveBtn).click();
    }

    public void clickBasketBtn() {
        driver.findElement(GittigidiyorObjeRepo.clickBasketBtn).click();
    }

    public void clickAddBasketBtn() {
        driver.findElement(GittigidiyorObjeRepo.clickAddBasketBtn).click();
    }

    public void clickAddItemBtn() {
        driver.findElement(GittigidiyorObjeRepo.clickAddItemBtn).click();
    }


    public void searchProduct() {
        driver.get("https://www.gittigidiyor.com/arama/?k=bilgisayar");
//        driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]")).click();
//        driver.findElement(By.cssSelector("#main-header > div:nth-child(3) > div > div > div.sc-1yvp483-0.eCEPYs > div > form > div > div.sc-1yew439-3.bxSoKG > div.sc-4995aq-4.dNPmGY")).sendKeys("bilgisayar");
//        driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div[2]/div/form/div/div[2]/button")).click();
    }

    public void pageScrollDown(){

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");
        javascriptExecutor.executeScript("window.scrollBy(0,-350)");
    }

    public void clickPage(){
        driver.findElement(GittigidiyorObjeRepo.clickPage).click();
    }

    public void pageScrollDown2(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0,400)");
    }

    public void clickAddBasket(){
        driver.findElement(GittigidiyorObjeRepo.clickAddBasket).click();
    }
    public void pageScrollDown3(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0,600)");
    }

    public void enterUsernameAndPassword() {
        driver.findElement(GittigidiyorObjeRepo.enterUsername).sendKeys(GittigidiyorConstant.username);
        driver.findElement(GittigidiyorObjeRepo.enterPassword).sendKeys(GittigidiyorConstant.password);
        driver.findElement(GittigidiyorObjeRepo.enterLoginButton).click();
    }


    public void openChromeBrowser() {
        String path = System.getProperty("user.dir");
        System.out.println("Proje path : " + path);
        System.setProperty("webdriver.chrome.driver", path + "/lib/chromedriver.exe");

        driver = new ChromeDriver();

        // tum elementler icin maksimum 15 bekleyeck
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void gotoGittigidiyor() {
        driver.get("https://www.gittigidiyor.com/uye-girisi");
        if (driver.getCurrentUrl().contains("https://www.gittigidiyor.com/uye-girisi")) {
            System.out.println("gittigidiyor sayfasina giriş sayfasına gidildi");
        } else {
            throw new WebDriverException("ilgili sayfaya acilamadi");
        }
    }
}
