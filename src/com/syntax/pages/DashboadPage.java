package com.syntax.pages;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboadPage extends CommonMethods {
    @FindBy(id = "welcome")
    public WebElement welcomeAdmin;

   /* public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
    */

}
