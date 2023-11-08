package com.solvd.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends AbstractPage {

    @FindBy(xpath = "//*[@class='title']")
    private WebElement pageTitle;

    @FindBy(xpath = "//*[@class='inventory_item_name']")
    private WebElement productTitle;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getProductTitle() {
        return getText(productTitle);
    }

    public String getPageTitle() {
        return getText(pageTitle);
    }
}
