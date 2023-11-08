package com.solvd.saucedemo;

import com.solvd.saucedemo.pages.LoginPage;
import com.solvd.saucedemo.pages.ProductsPage;
import com.solvd.saucedemo.pages.ShoppingCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SaucedemoTest extends AbstractTest {

    @Test
    public void checkAddProductToCartTest() {
        LoginPage loginPage = new LoginPage(driver);

        ProductsPage productsPage = loginPage.login();
        productsPage.addProductToShoppingCart(2);
        String actualProductTitle = productsPage.getProductTitle(2);

        ShoppingCartPage shoppingCartPage = productsPage.goToShoppingCartPage();
        String expectedProductTitle = shoppingCartPage.getProductTitle();

        Assert.assertEquals(expectedProductTitle, actualProductTitle, "Product title isn't correct.");
    }
}
