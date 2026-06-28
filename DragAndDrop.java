package AshokSai.TestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DragAndDrop extends DriverSetup {
    @Test
    public void DragDrop()throws Exception{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
        driver.manage().window().maximize();
        DragAndDropEle dde=new DragAndDropEle();
        Actions actions=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
        actions.dragAndDrop(driver.findElement(dde.red), driver.findElement(dde.target))
               .build().perform();

        actions.dragAndDrop(driver.findElement(dde.green), driver.findElement(dde.target))
                .build().perform();

        actions.dragAndDrop(driver.findElement(dde.blue), driver.findElement(dde.target))
                .build().perform();
        Thread.sleep(2000);
        driver.quit();
    }
}
