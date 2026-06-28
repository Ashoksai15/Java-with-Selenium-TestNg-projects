package AshokSai.TestNg;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NavigationByPom extends DriverSetup{
    @Test
    public void home()throws Exception{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        pf_navigation pf= PageFactory.initElements(driver,pf_navigation.class);
        pf.Home.click();
        String homeurl= driver.getCurrentUrl();
        System.out.println(homeurl);
        Assertions.assertThat(url).as("Test Case Failed").isEqualTo(homeurl);
        Thread.sleep(2000);
        driver.quit();
    }
    @Test(priority = 1)
    public void contact()throws Exception{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        pf_navigation pf= PageFactory.initElements(driver,pf_navigation.class);
        pf.Contact.click();
        Thread.sleep(2000);
        String contacturl= driver.getCurrentUrl();
        System.out.println(contacturl);
        Assertions.assertThat(url).as("Test Case Failed").isNotEqualTo(contacturl);
        Thread.sleep(2000);
        driver.quit();
    }
    @Test(priority = 2)
    public void signin()throws Exception{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        pf_navigation pf= PageFactory.initElements(driver,pf_navigation.class);
        pf.Signin.click();
        Thread.sleep(2000);
        String signinurl= driver.getCurrentUrl();
        System.out.println(signinurl);
        Assertions.assertThat(url).as("Test Case Failed").isNotEqualTo(signinurl);
        Thread.sleep(2000);
        driver.quit();
    }
}
