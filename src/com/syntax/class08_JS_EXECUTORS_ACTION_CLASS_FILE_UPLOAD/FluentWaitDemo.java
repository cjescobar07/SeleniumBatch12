package com.syntax.class08_JS_EXECUTORS_ACTION_CLASS_FILE_UPLOAD;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWaitDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // launches the browser
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(5)) // looks for an element every 5secs
                .ignoring(NoSuchElementException.class); // ignores the exception mentioned

    }
}
