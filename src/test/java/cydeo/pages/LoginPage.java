package cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cydeo.utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    @FindBy(css = "[class='alert alert-error']")
    public WebElement warningMessage;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotPassword;

    @FindBy(xpath = "//span[.='Remember me on this computer']")
    public WebElement rememberMe;

    public String warningMessage(){
        return usernameInput.getAttribute("validationMessage");
    }
    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
    }
    public void login(String username){
        usernameInput.sendKeys(username);
    }
}
