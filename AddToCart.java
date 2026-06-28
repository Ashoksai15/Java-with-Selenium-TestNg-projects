package AshokSai.TestNg;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddToCart extends DriverSetup {
    @Test
    public void cart_item()throws Exception{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
        driver.findElementByXPath("//a[@data-test='nav-categories']").click();
        driver.findElementByXPath("//a[@data-test='nav-rentals']").click();
        driver.findElementByXPath("//h5[text()='Excavator']").click();
        Thread.sleep(2000);
        String Exca_url= driver.getCurrentUrl();
        System.out.println(Exca_url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
        driver.findElementById("btn-add-to-cart").click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
        WebElement msg= driver.findElementById("toast-container");
        Thread.sleep(2000);
        String Confirm_msg= msg.getText();
        System.out.println(Confirm_msg);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
        driver.findElementByXPath("//a[@data-test='nav-cart']").click();
        Thread.sleep(2000);
        String cart_url= driver.getCurrentUrl();
        System.out.println(cart_url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
        WebElement item_name= driver.findElementByClassName("product-title");
        System.out.println(item_name.getText());
        Assertions.assertThat(Exca_url).as("Test Case Failed").isNotEqualTo(cart_url);
        driver.quit();
    }
}
