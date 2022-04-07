package reviewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;

public class SeleniumReview2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.syntaxprojects.com/basic-radiobutton-demo.php");

        WebElement femaleButton = driver.findElement(By.xpath("//input[@value = 'Female' and @name = 'optradio']"));

        //check if the radio button is enabled
        System.out.println("the female radio button is enabled: "+ femaleButton.isEnabled());

        // check if the female radio button is displayed
        System.out.println("the female radio button is displayed: " + femaleButton.isDisplayed());

        //check if the female radio button is selected
        System.out.println("the female radio button is selected: " + femaleButton.isSelected());

        if(!femaleButton.isSelected()){
            femaleButton.click();



            // check the status if female radio button is selected
            System.out.println("the female radio button is selected: " + femaleButton.isSelected());

            System.out.println("========================================");
            System.out.println();

            //to get all the links in the current webpage
            List<WebElement> links = driver.findElements(By.tagName("a"));

            for (WebElement link : links) {
                String name = link.getText();
                String fullname = link.getAttribute("href");
            if(!name.isEmpty()){
                System.out.println(name + "    " + fullname);
            }

            }

        }

    }
}
