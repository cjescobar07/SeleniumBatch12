package com.syntax.test;

import com.syntax.pages.LoginPage;
import com.syntax.testBase.BaseClass;

public class LoginPageTest {

    public static void main(String[] args) {
      // BaseClass.openWithSpecificUrl("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
      // LoginPage loginPage = new LoginPage();
      // loginPage.username.sendKeys("Tester");
      // loginPage.password.sendKeys("test");
      // loginPage.loginButton.click();

        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys("Admin");
        loginPage.password.sendKeys("Hum@nhrm");

        loginPage.loginButton.click();

        BaseClass.tearDown();
    }
}

