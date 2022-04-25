package ReviewClass.Review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW_REVIEW {

    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // finding the checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
        checkbox.click();

        // finding the remove button
        WebElement removeBtn = driver.findElement(By.xpath("//button[text() = 'Remove']"));
        removeBtn.click();

        // get the text
        WebElement text = driver.findElement(By.xpath("//p[@id = 'message']"));
        String textMsg = text.getText();

        System.out.println(textMsg);

        // locating the enable button
        WebElement enableButton = driver.findElement(By.xpath("//button[text() = 'Enable']"));
        enableButton.click();

        // verify that the text box is enabled
        WebDriverWait wait = new WebDriverWait(driver,20);

        // as we want to wait for the element to become enabled so that we can
        // enter some text thats why we use explicit wait
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type = 'text']")));

        // once element becomes enable find it and send keys
        WebElement txtBox = driver.findElement(By.xpath("//input[@type = 'text']"));
        txtBox.sendKeys("Batch12???");

        // find the disable button
        WebElement disableButton = driver.findElement(By.xpath("//button[text() = 'Disable']"));
        // click the disable button
        disableButton.click();

        // locate the text "It's disabled" to make sure the text box is disabled
        WebElement disabledTxt = driver.findElement(By.xpath("//p[text() = \"It's disabled!\"]"));
        String textDisabled = disabledTxt.getText();
        System.out.println(textDisabled);

        // check if the text box is actually disabled now
        if (!txtBox.isEnabled()) {
            System.out.println("The text has been disabled");
        }







    }
}
