package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

/*
    click on buttons
 */
public class AdvancedWindowHandling {
    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            String mainPageHandle = driver.getWindowHandle();
            WebElement igButton = driver.findElement(By.linkText("Follow On Instagram"));
            WebElement fbButton = driver.findElement(By.linkText("Like us On Facebook"));
            WebElement igAndFbButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));

            igButton.click();
            fbButton.click();
            igAndFbButton.click();

            Set<String> allWindowHandles = driver.getWindowHandles();
            System.out.println(allWindowHandles.size());


            Iterator<String> it = allWindowHandles.iterator();
            while (it.hasNext()) { // start iterating through the handles
                String handle = it.next(); // getting the next handle
                if(!mainPageHandle.equals(handle)){ // setting a condition
                    driver.switchTo().window(handle); // switch to a window which is not equal to the main page handle
                    //driver.manage().window().maximize();
                    String title = driver.getTitle();
                    System.out.println(title);
                    driver.close();
                }

            }
            driver.switchTo().window(mainPageHandle); // switching back to the main page
            igButton.click();


    }
}