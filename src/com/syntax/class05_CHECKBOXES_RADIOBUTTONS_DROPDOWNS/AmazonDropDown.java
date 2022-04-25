package com.syntax.class05_CHECKBOXES_RADIOBUTTONS_DROPDOWNS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonDropDown {
    public static String url = "https://amazon.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.id("searchDropdownBox"));
        WebElement categoriesDD = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(categoriesDD);

        List<WebElement> options = select.getOptions();

        for (WebElement option: options) {
            String optionText = option.getText();
            System.out.println(optionText);
        }
        select.selectByValue("search-alias=appliances");

    }
}
