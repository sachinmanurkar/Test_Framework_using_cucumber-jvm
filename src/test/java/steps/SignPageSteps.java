package steps;

import cucumber.api.java.en.And;
import pages.SignupPage;

import java.util.List;

public class SignPageSteps extends DriverFactory {


    private class UserDetails
    {
        public String firstName;
        public String lastName;
        public String email;
        public String password;
    }


    @And("^she provides the first name as ([^\"]*)$")
    public void she_provides_the_first_name_as(String firstname) throws Throwable {
        new SignupPage(driver).she_provides_first_name_as(firstname);
    }


    @And("^she provides the last name as ([^\"]*)$")
    public void she_provides_the_last_name_as(String lastName) throws Throwable {
        new SignupPage(driver).she_provides_last_name_as(lastName);
    }

    @And("^she provides the email as ([^\"]*)$")
    public void she_provides_the_email_as(String email) throws Throwable {
        new SignupPage(driver).she_provides_email_address_as(email);
    }

    @And("^she provides the password as ([^\"]*)$")
    public void she_provides_the_password_as(String password) throws Throwable {
        new SignupPage(driver).she_provides_password_as(password);
    }

    @And("^she provides the confirm password again as ([^\"]*)$")
    public void she_provides_the_confirm_password_again_as(String confirmPassword) throws Throwable {
        new SignupPage(driver).she_provides_confirm_password_as(confirmPassword);
    }


    @And("^she signs-up$")
    public void she_signs_up() throws Throwable {
        new SignupPage(driver).she_sign_up();
    }


    @And("^she provides the her details as follows:$")
    public void she_provides_the_her_details_as_follows(List<UserDetails> user) throws Throwable {
        UserDetails userToBeSignedup = user.get(0);

        new SignupPage(driver).she_provides_first_name_as(userToBeSignedup.firstName);
        new SignupPage(driver).she_provides_last_name_as(userToBeSignedup.lastName);
        new SignupPage(driver).she_provides_email_address_as(userToBeSignedup.email);
        new SignupPage(driver).she_provides_password_as(userToBeSignedup.password);
    }

}
