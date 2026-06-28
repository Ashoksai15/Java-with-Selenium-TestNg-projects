package AshokSai.TestNg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pf_navigation {
    @FindBy(xpath = "//a[@data-test='nav-home']")
    public WebElement Home;
    @FindBy(xpath = "//a[@data-test='nav-contact']")
    public WebElement Contact;
    @FindBy(xpath = "//a[@data-test='nav-sign-in']")
    public WebElement Signin;

}
