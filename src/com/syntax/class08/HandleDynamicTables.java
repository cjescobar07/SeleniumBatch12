package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleDynamicTables {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");

            WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
            username.sendKeys("Tester");

            WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
            password.sendKeys("test");

            WebElement loginButton = driver.findElement(By.className("button"));
            loginButton.click();

            List<WebElement> rows = driver.findElements(By.xpath("//table[@class = 'SampleTable']/tbody/tr"));
            for (int i = 1; i < rows.size(); i++){
                String rowText = rows.get(i).getText();
                System.out.println(rowText);

            if(rowText.contains("Bob Feather")){
                List<WebElement> checkBoxes = driver.findElements(By.xpath("//table[@class = 'SampleTable']/tbody/tr/td[1]"));
                checkBoxes.get(i-1).click();
            }
            }



   }
}
