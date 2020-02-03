package com.gmail.Testcases;

import com.gmail.pages.HomePage;
import com.gmail.pages.LoginPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
//import sun.plugin.dom.html.HTMLDocument;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class VerifyGmailLogin {

    public VerifyGmailLogin() throws IOException {
        super();

    }
    LoginPage lp;
    HomePage hp;
    @BeforeMethod
    public void startup() throws InterruptedException, IOException {
        initialization();

        lp = new LoginPage();
        hp = new HomePage();


    }

    private void initialization() {
    }


    @Test
    public void Credentials() throws InterruptedException {

        WebDriver driver = null;
        String pagetitle = driver.getTitle();
        assertEquals(pagetitle, "Sign in – Google accounts");
        System.out.println("Url successfully launched");

        lp.Login();
        hp.HomePage();
    }
}
