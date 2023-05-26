package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {

    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement loginButonu;
    @FindBy(tagName = "h2")
    public WebElement newUserSignup;
    @FindBy(xpath = "//input[@type='text']")
    public WebElement name;
    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement emailAddress;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signup;
    @FindBy(xpath = "//b[text()='Enter Account Information']")
    public WebElement enterAccountInformation;
    @FindBy(xpath = "(//div[@class='radio'])[2]")
    public WebElement title;
    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement password;
    @FindBy(id = "days")
    public WebElement days;
    @FindBy(id = "months")
    public WebElement months;
    @FindBy(id = "years")
    public WebElement years;
    @FindBy(name = "newsletter")
    public WebElement newsletterCheckBox;
    @FindBy(id = "optin")
    public WebElement optinCheckBox;
    @FindBy(id = "first_name")
    public WebElement firstName;
    @FindBy(id = "last_name")
    public WebElement lastName;
    @FindBy(id = "company")
    public WebElement company;
    @FindBy(id = "address1")
    public WebElement address1;
    @FindBy(id = "address2")
    public WebElement address2;
    @FindBy(id = "country")
    public WebElement country;
    @FindBy(xpath = "//input[@id='state']")
    public WebElement state;
    @FindBy(xpath = "//input[@id='city']")
    public WebElement city;
    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipcode;
    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement mobilNumber;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement createAccountButton;
    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement accountCreated;
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement countineButton;
    @FindBy(xpath = "//b[text()='merve']")
    public WebElement loggedInAsUsername;
    @FindBy(className = "fa fa-trash-o")
    public WebElement deleteAccount;
    @FindBy(xpath = "//b[text()='Account Deleted!']")
    public WebElement accountAccount;
    @FindBy(className = "btn btn-primary")
    public WebElement countinueButton2;
}
