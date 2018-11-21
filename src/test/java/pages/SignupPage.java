package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {


    WebDriver driver;

    @FindBy(id = "user_first_name")
    private WebElement firstNameTextBox;

    @FindBy(id = "user_last_name")
    private WebElement lastNameTextBox;

    @FindBy(id = "user_email")
    private WebElement emailTextBox;

    @FindBy(id = "user_password")
    private WebElement passwordTextBox;

    @FindBy(id = "user_confirn_password")
    private WebElement confirmPasswordTextBox;

    @FindBy(name = "commit")
    private WebElement signupButton;

    public SignupPage(WebDriver driver)
    {
        this.driver=driver;
        //In order for this code to not throw Null pointer exception and
        //firstNameTextBox.... signupButton fields are not instantiated we need to initialize the page object.
        PageFactory.initElements(driver,this);

    }


    public void she_provides_first_name_as(String firstname) throws Throwable{
        firstNameTextBox.sendKeys(firstname);
    }

    public void she_provides_last_name_as(String lastname) throws Throwable{
        lastNameTextBox.sendKeys(lastname);
    }

    public void she_provides_email_address_as(String email) throws Throwable{
        emailTextBox.sendKeys(email);
    }

    public void she_provides_password_as(String password) throws Throwable{
       passwordTextBox.sendKeys(password);
    }

    public void she_provides_confirm_password_as(String confirmPassword) throws Throwable{
        confirmPasswordTextBox.sendKeys(confirmPassword);

    }

    public void she_sign_up() throws Throwable{
        signupButton.click();

    }
}



