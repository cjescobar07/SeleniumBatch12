package com.syntax.Class12_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboadPage extends CommonMethods{
    @FindBy(id = "welcome")
    public WebElement welcomeAdmin;

   /* public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
    */

}
