package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {
    public static String url= "https://www.facebook.com";


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement createNew = driver.findElement(By.linkText("Create new account"));
        createNew.click();
        Thread.sleep(2000);

        WebElement monthsDD = driver.findElement(By.id("month"));
        Select selectMonth = new Select(monthsDD);
        List<WebElement> optionsMonth = selectMonth.getOptions();
        int sizeMonth = optionsMonth.size();
        if (sizeMonth == 12) {
            System.out.println("Month dropdown has " + sizeMonth + " month option");
        } else {
            System.out.println("Month dropdown does not have " + sizeMonth + " 12 month option");
        }

        WebElement daysDD = driver.findElement(By.name("birthday_day"));
        Select selectDays = new Select(daysDD);
        List<WebElement> daysOption = selectDays.getOptions();
        int sizeDays = daysOption.size();
        if (sizeDays == 31) {
            System.out.println("Days dropdown options has " + sizeDays + " days option");
        } else {
            System.out.println("Days dropdown does not have " + sizeDays + " 31 days option");
        }

        WebElement yearsDD = driver.findElement(By.name("birthday_year"));
        Select selectYears = new Select(yearsDD);
        List<WebElement> yearOption = selectYears.getOptions();
        int sizeYears = yearOption.size();
        if (sizeYears == 115) {
            System.out.println("Years dropdown options has " + sizeYears + " years option");
        } else {
            System.out.println("Years dropdown does not have 115 years option." + " It has " + sizeYears + " years option");
        }
        //Selecting date of birth:
        Thread.sleep(2000);

        selectMonth.selectByIndex(11);
        selectDays.selectByIndex(26);
        selectYears.selectByVisibleText("1983");

        //driver.quit();
    }
}
