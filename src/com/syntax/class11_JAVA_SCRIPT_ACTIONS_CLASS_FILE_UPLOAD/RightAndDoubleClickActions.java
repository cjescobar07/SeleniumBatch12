package com.syntax.class11_JAVA_SCRIPT_ACTIONS_CLASS_FILE_UPLOAD;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClickActions {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement rightClickButton = driver.findElement(By.xpath("//span[text() = 'right click me']"));
        Actions action = new Actions(driver);
        action.contextClick(rightClickButton).perform();
        WebElement editOption = driver.findElement(By.xpath("//span[text() = 'Edit']"));
        //editOption.click();
        action.click(editOption).perform();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement doubleClickButton = driver.findElement(By.xpath("//button[contains(text(), 'Double-Click')]"));
        action.doubleClick(doubleClickButton).perform();
        System.out.println(alert.getText());
        alert.accept();





    }
}
