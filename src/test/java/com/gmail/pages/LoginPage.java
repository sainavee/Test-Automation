package com.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage {

    @FindBy(xpath = "//*[@id=\"identifierId\"]")
    WebElement Username;
    @FindBy(xpath = "//*[@id=\"identifierNext\"]/span/span")
    WebElement Nextbutton;
    @FindBy(xpath = "//input[@name='password']")
    WebElement Password;
    @FindBy(xpath = "//*[@id=\"passwordNext\"]/span/span")
    WebElement Nxtbtn;

    public LoginPage() throws IOException {
        WebDriver driver = null;
        PageFactory.initElements(driver, this);


    }
    public void Login() throws InterruptedException {

        Username.sendKeys("sainavee42");

        Nextbutton.click();
        Thread.sleep(3000);
        Password.sendKeys("1#HITLER789");
        Nxtbtn.click();
        Thread.sleep(2000);
        //driver.navigate().refresh();
        //String abc = Nxtbtn.getText();
    }
}
