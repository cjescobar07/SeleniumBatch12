package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;

public class HW_FACEBOOK {
    /*
     navigate to fb.com
     click on create new account
     fill up all the textboxes
     click on sign up button
     close the pop up
     close the browser
     */
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();

        Thread.sleep(3000);

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Tony");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Stark");

        WebElement mobileOrEmail = driver.findElement(By.name("reg_email__"));
        mobileOrEmail.sendKeys("tony_stark2970@gmail.com");

        WebElement confirmEmail = driver.findElement(By.name("reg_email_confirmation__"));
        confirmEmail.sendKeys("tony_stark2970@gmail.com");

        WebElement newPW = driver.findElement(By.name("reg_passwd__"));
        newPW.sendKeys("Howard&Martha");

        WebElement bDayMonth = driver.findElement(By.name("birthday_month"));
        bDayMonth.sendKeys("May");

        WebElement bDayDate = driver.findElement(By.name("birthday_day"));
        bDayDate.sendKeys("29");

        WebElement bDayYear = driver.findElement(By.name("birthday_year"));
        bDayYear.sendKeys("1970");

        WebElement gender = driver.findElement(By.className("_58mt"));
        if(gender.equals("Male")){
            gender.click();
        }

        WebElement signUp = driver.findElement(By.name("websubmit"));
        signUp.click();

        Thread.sleep(3000);
        Robot robot= new Robot();
        //robot.mouseMove(1135,330);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        Thread.sleep(3000);

        driver.quit();




    }
}
