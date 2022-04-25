package com.syntax.class06_FRAMES_AND_ALERTS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        driver.switchTo().frame(0);
        WebElement textBox = driver.findElement(By.id("name"));
        textBox.sendKeys("Batch 12 forever!!!");

        driver.switchTo().defaultContent();

        WebElement alertButton = driver.findElement(By.id("alert"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        driver.switchTo().frame("iframe_a");
        textBox.clear();
        textBox.sendKeys("We are back to frame");

        driver.switchTo().defaultContent();

        WebElement frameElement = driver.findElement(By.xpath("//iframe[@src = '/Demo.html']"));
        driver.switchTo().frame(frameElement);
        textBox.clear();
        Thread.sleep(2000);
        textBox.sendKeys("Goodnight");


    }
}
