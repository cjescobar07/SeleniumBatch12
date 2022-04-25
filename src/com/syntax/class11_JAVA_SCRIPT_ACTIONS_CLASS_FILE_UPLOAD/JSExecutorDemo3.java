package com.syntax.class11_JAVA_SCRIPT_ACTIONS_CLASS_FILE_UPLOAD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo3 {

        public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);

            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("window.open('http://amazon.com');"); // opens a new tab and navigates to amazon
            //window.open(); -- open a blank tab

            driver.get(url);


            WebElement searchBar = driver.findElement(By.name("q"));
            searchBar.sendKeys("asdfasdfasfafasfasfafdaf");
    }
}
