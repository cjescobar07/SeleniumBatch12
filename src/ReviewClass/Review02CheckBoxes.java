package ReviewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review02CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.syntaxprojects.com/basic-checkbox-demo.php");

        WebElement checkBox1 = driver.findElement(By.cssSelector("input#isAgeSelected"));
        System.out.println("the checkbox is selected: " + checkBox1.isSelected());
        //clicking to select the checkbox
        checkBox1.click();
        Thread.sleep(3000);
        //clicking again to deselect the checkbox
        checkBox1.click();

        WebElement a = driver.findElement(By.xpath("//div[@id='txtAge']"));
        System.out.println(" displayed "+a.isDisplayed());


    }
}
