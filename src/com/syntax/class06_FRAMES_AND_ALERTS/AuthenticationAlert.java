package com.syntax.class06_FRAMES_AND_ALERTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {
        public static String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
                                            // username:password@

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);










        }
}
