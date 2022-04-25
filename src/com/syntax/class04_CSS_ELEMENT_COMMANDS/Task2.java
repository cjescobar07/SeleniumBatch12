package com.syntax.class04_CSS_ELEMENT_COMMANDS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        /*
            TC 1: Amazon link count:
            Open chrome browser
            Go to "https://www.amazon.com/"
            Get all links
            Get number of links that has text
            Print to console only the links that has text
         */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        List<WebElement> allAmazonLinks = driver.findElements(By.tagName("a"));
        System.out.println("Number of Amazon links: " + allAmazonLinks.size());

        for (WebElement link: allAmazonLinks) {
            String linkText = link.getText();
            String fulllink = link.getAttribute("href");
            if(!linkText.isEmpty()) {
                System.out.println(linkText + "  " + fulllink);
            }
        }

        Thread.sleep(3000);
        driver.quit();

    }
}
