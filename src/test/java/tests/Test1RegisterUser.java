package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Test1RegisterUser {
    @Test
    public void test01() {
        // 1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        ReusableMethods.bekle(3);

        //3. Verify that home page is visible successfully
        SoftAssert softAssert = new SoftAssert();
        String expectedHomePage = ConfigReader.getProperty("automationExpectedHomePage");
        String actualHomePage = Driver.getDriver().getCurrentUrl();

        softAssert.assertEquals(actualHomePage, expectedHomePage, "Verify that home page is visible successfully");

        //4. Click on 'Signup / Login' button
        AutomationExercisePage automationPage = new AutomationExercisePage();
        automationPage.loginButonu.click();


        //5. Verify 'New User Signup!' is visible
        softAssert.assertTrue(automationPage.newUserSignup.isDisplayed(), "Verify 'New User Signup!' is visible");

        //6. Enter name and email address
        automationPage.name.sendKeys(ConfigReader.getProperty("automationName"));
        automationPage.emailAddress.sendKeys(ConfigReader.getProperty("automationEmailAddress"));

        //7. Click 'Signup' button
        automationPage.signup.click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        softAssert.assertTrue(automationPage.enterAccountInformation.isDisplayed(), "Verify that 'ENTER ACCOUNT INFORMATION' is visible");

        //9. Fill details: Title, Name, Email, Password, Date of birth
        automationPage.title.click();
        automationPage.password.sendKeys(ConfigReader.getProperty("automationPassword"));
        Select select = new Select(automationPage.days);
        select.selectByValue(ConfigReader.getProperty("automationDays"));
        Select select1 = new Select(automationPage.months);
        select1.selectByValue(ConfigReader.getProperty("automationMonths"));
        Select select2 = new Select(automationPage.years);
        select2.selectByValue(ConfigReader.getProperty("automationYears"));

        //10. Select checkbox 'Sign up for our newsletter!'
        ReusableMethods.bekle(1);
        automationPage.newsletterCheckBox.click();

        //11. Select checkbox 'Receive special offers from our partners!'
        ReusableMethods.bekle(1);
        automationPage.optinCheckBox.click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        automationPage.firstName.sendKeys(ConfigReader.getProperty("automationFirstName"));
        automationPage.lastName.sendKeys(ConfigReader.getProperty("automationLastName"));
        automationPage.company.sendKeys(ConfigReader.getProperty("automationCompany"));
        automationPage.address1.sendKeys(ConfigReader.getProperty("automationAddress1"));
        automationPage.address2.sendKeys(ConfigReader.getProperty("automationAddress2"));
        Select select3 = new Select(automationPage.country);
        select3.selectByValue(ConfigReader.getProperty("automationCountry"));
        automationPage.state.sendKeys(ConfigReader.getProperty("automationState"));
        automationPage.city.sendKeys(ConfigReader.getProperty("automationCity"));
        automationPage.zipcode.sendKeys(ConfigReader.getProperty("automationZipcode"));
        automationPage.mobilNumber.sendKeys(ConfigReader.getProperty("automationMobilNumber"));

        //13. Click 'Create Account button'
        automationPage.createAccountButton.click();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        String expectedIcerik = ConfigReader.getProperty("automationAccountCreated");
        String actualIcerik = automationPage.accountCreated.getText();

        softAssert.assertEquals(actualIcerik, expectedIcerik, "Verify that 'ACCOUNT CREATED!' is visible");

        //15. Click 'Continue' button
        automationPage.countineButton.click();

        //16. Verify that 'Logged in as username' is visible
        expectedIcerik = ConfigReader.getProperty("automationLoggedInAsUsername");
        actualIcerik = automationPage.loggedInAsUsername.getText();

        softAssert.assertEquals(actualIcerik, expectedIcerik, "Verify that 'Logged in as username' is visible");

        //17. Click 'Delete Account' button
        automationPage.deleteAccount.click();

        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        expectedIcerik = ConfigReader.getProperty("automationAccountCreated");
        actualIcerik = automationPage.accountAccount.getText();

        softAssert.assertEquals(actualIcerik, expectedIcerik, "Verify that 'ACCOUNT DELETED!' is visible");

        automationPage.countinueButton2.click();

        Driver.quitDriver();
    }
}
