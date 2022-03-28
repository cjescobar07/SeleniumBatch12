package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Open chrome browser
        Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
        Enter valid username and password (username - Admin, password - Hum@nhrm123)
        Click on login button
        Then verify Syntax Logo is displayed.
         */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement username = (driver.findElement(By.xpath("//input[contains(@id, 'txtUsername')]")));
        username.sendKeys("Admin");

        WebElement password = (driver.findElement(By.xpath("//input[contains(@id, 'txtPassword')]")));
        password.sendKeys("Hum@nhrm123");

        WebElement loginButton = (driver.findElement(By.xpath("//input[(@value ='LOGIN')]")));
        loginButton.click();

        WebElement syntaxLogo =(driver.findElement(By.cssSelector("img[src $= 'syntax.png']")));
        boolean isSyntaxLogo = syntaxLogo.isDisplayed();
        System.out.println(isSyntaxLogo);
        if(!isSyntaxLogo){
            System.out.println("Not displayed");
        }else {
            System.out.println("Displayed");
        }

        /*Thread.sleep(3000);
        driver.quit();
        */
    }
}
