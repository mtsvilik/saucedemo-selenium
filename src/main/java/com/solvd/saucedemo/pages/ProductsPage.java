package com.solvd.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductsPage extends AbstractPage {

    @FindBy(xpath = "//span[@class ='title']")
    private WebElement pageTitle;

    @FindBy(xpath = "//*[@class='inventory_item_name ']")
    private List<WebElement> productTitles;

    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory ']")
    private List<WebElement> addToCartButtons;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement shoppingCartButton;

    public ProductsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getProductTitle(int index) {
        return productTitles.get(index).getText();
    }

    public void addProductToShoppingCart(int index) {
        clickElement(addToCartButtons.get(index));
    }

    public ShoppingCartPage goToShoppingCartPage() {
        clickElement(shoppingCartButton);
        return new ShoppingCartPage(driver);
    }

    public String getPageTitle() {
        return getText(pageTitle);
    }
}
