package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        /*
            HW 2
            HRMS Application Negative Login:
            Open chrome browser
            Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
            Enter valid username
            Leave password field empty
            Click on login button
            Verify error message with text "Password cannot be empty" is displayed.
         */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement username = (driver.findElement(By.xpath("//input[contains(@id, 'txtUsername')]")));
        username.sendKeys("Admin");

        WebElement loginButton = (driver.findElement(By.xpath("//input[(@value = 'LOGIN')]")));
        loginButton.click();

        WebElement errorMessage = (driver.findElement(By.cssSelector("span[id $= 'Message']")));
        boolean isErrorMessage = errorMessage.isDisplayed();
        System.out.println(isErrorMessage);
        if(!isErrorMessage){
            System.out.println("Error message not displayed");
        }else{
            System.out.println("Error message is displayed");
        }

        Thread.sleep(3000);
        driver.quit();

    }
}
