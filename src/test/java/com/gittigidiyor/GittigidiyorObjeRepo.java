package com.gittigidiyor;

import org.openqa.selenium.By;

public class GittigidiyorObjeRepo {

    public static final By controlBasketPath = By.xpath("//*[@id=\"empty-cart-container\"]/div[1]/div[1]/div/div[2]");
    public static final By clickRemoveBtn = By.xpath("//a[@title='Sil']");
    public static final By clickBasketBtn = By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]/a/div[1]/div");
    public static final By clickAddBasketBtn = By.xpath("//*[@id=\"add-to-basket\"]");
    public static final By clickAddItemBtn = By.xpath("//*[@id=\"CountSelect\"]/li[3]/a");
    public static final By clickPage = By.xpath("//*[@id=\"best-match-right\"]/div[5]/ul/li[2]/a");
    public static final By clickAddBasket = By.xpath("//li[@product-index='1']");
    public static final By enterUsername= By.xpath("//*[@id=\"L-UserNameField\"]");
    public static final By enterPassword = By.xpath("//*[@id=\"L-PasswordField\"]");
    public static final By enterLoginButton = By.id("gg-login-enter");

}
