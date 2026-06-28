package AshokSai.TestNg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class registration extends  DriverSetup {
    @Test
    public void Customer_details()throws Exception{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
        WebElement signin=driver.findElementByXPath("//a[@data-test='nav-sign-in']");
        signin.click();
        Thread.sleep(2000);
        String url= driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
        WebElement register_account= driver.findElementByXPath("//a[@data-test='register-link']");
        register_account.click();
        String Reg_url= driver.getCurrentUrl();
        System.out.println(Reg_url);
        String path=System.getProperty("user.dir");
        path=path+"\\src\\main\\java\\AshokSai\\TestNg\\details.properties";
        File file=new File(path);
        FileInputStream fis=new FileInputStream(file);
        Properties pro=new Properties();
        pro.load(fis);
        String Firstname= pro.getProperty("Firstname");
        System.out.println(Firstname);
        String Lastname=pro.getProperty("Lastname");
        System.out.println(Lastname);
        String DateofBirth=pro.getProperty("DateofBirth");
        System.out.println(DateofBirth);
        String Street=pro.getProperty("Street");
        System.out.println(Street);
        String Postalcode=pro.getProperty("Postalcode");
        System.out.println(Postalcode);
        String City=pro.getProperty("City");
        System.out.println(City);
        String State=pro.getProperty("State");
        System.out.println(State);
        String Country=pro.getProperty("Country");
        System.out.println(Country);
        String Phone= pro.getProperty("Phone");
        System.out.println(Phone);
        String Email= pro.getProperty("Email");
        System.out.println(Email);
        String Password=pro.getProperty("Password");
        System.out.println(Password);
        driver.findElementById("first_name").sendKeys(Firstname);
        driver.findElementById("last_name").sendKeys(Lastname);
        driver.findElementById("dob").sendKeys(DateofBirth);
        driver.findElementById("street").sendKeys(Street);
        driver.findElementById("postal_code").sendKeys(Postalcode);
        driver.findElementById("city").sendKeys(City);
        driver.findElementById("state").sendKeys(State);
        driver.findElementByXPath("//select[@id='country']").sendKeys(Country);
        driver.findElementById("phone").sendKeys(Phone);
        driver.findElementById("email").sendKeys(Email);
        driver.findElementById("password").sendKeys(Password);
        Thread.sleep(2000);
        driver.findElementByXPath("//button[@data-test='register-submit']").click();
        Thread.sleep(2000);
        String sub_url= driver.getCurrentUrl();
        System.out.println(sub_url);
    }
}
