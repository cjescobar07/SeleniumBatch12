package com.syntax.class02_LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_PARABANK {
    /*
    HW
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("Homer");

        WebElement lastName = driver.findElement(By.id("customer.lastName"));
        lastName.sendKeys("Simpson");

        WebElement address = driver.findElement(By.id("customer.address.street"));
        address.sendKeys("742 Evergreen Terrace");

        WebElement city = driver.findElement(By.id("customer.address.city"));
        city.sendKeys("Springfield");

        WebElement state = driver.findElement(By.id("customer.address.state"));
        state.sendKeys("Illinois");

        WebElement zipCode = driver.findElement(By.id("customer.address.zipCode"));
        zipCode.sendKeys("12345");

        WebElement phoneNumber = driver.findElement(By.id("customer.phoneNumber"));
        phoneNumber.sendKeys("818-200-6141");

        WebElement ssn = driver.findElement(By.id("customer.ssn"));
        ssn.sendKeys("123456789");

        WebElement userName = driver.findElement(By.id("customer.username"));
        userName.sendKeys("HomieSimpson");

        WebElement passWord = driver.findElement(By.id("customer.password"));
        passWord.sendKeys("WhyYouLittle!!!");

        WebElement confirmPW = driver.findElement(By.id("repeatedPassword"));
        confirmPW.sendKeys("WhyYouLittle!!!");

        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);

        driver.quit();










    }
}
