package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LandingPage;


public class LandingPageSteps extends DriverFactory {


      @When("^she choose to sign up$")
    public void she_choose_to_sign_up() throws Throwable
      {
          new LandingPage(driver).she_choose_to_sign_up();
      }
}

