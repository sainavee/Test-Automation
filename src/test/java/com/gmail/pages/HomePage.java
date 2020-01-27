package com.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePage {


    @FindBy(xpath="//*[@id=\":u4\"]/div/div")
    WebElement Compose;
    @FindBy(name="to")
    WebElement toaddress;
    @FindBy(id=":z5")
    WebElement subject;
    @FindBy(xpath= "//*[@id=\":10a\"]")
    WebElement body;
    @FindBy(xpath = "//*[@id=\":yv\"]")
    WebElement sendbutton;

    public HomePage() throws IOException {
        WebDriver driver = null;
        PageFactory.initElements(driver, this);
        // TODO Auto-generated constructor stub
    }
    public void HomePage() {
        Compose.click();
        toaddress.sendKeys("sainavee42@gmail.com");
        subject.sendKeys("Programm");
        body.sendKeys("Hi");
        sendbutton.click();
    }
}
