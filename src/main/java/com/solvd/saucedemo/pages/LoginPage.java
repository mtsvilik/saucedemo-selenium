package com.solvd.saucedemo.pages;

import com.solvd.saucedemo.utils.TestDataReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {

    @FindBy(id = "user-name")
    private WebElement userNameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ProductsPage login() {
        sendKeys(userNameField, TestDataReader.getTestData("userName"));
        sendKeys(passwordField, TestDataReader.getTestData("password"));
        clickElement(loginButton);
        return new ProductsPage(driver);
    }
}
