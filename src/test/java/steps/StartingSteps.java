package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class StartingSteps extends DriverFactory{


    //scenario hooks
    @Before
    public void beforeScenario()
    {
        driver = new DriverFactory().getDriver();
        System.out.println("This will run before actual scenario");
    }

    @After
    public void afterScenario()
    {
         new DriverFactory().destroyDriver();
        System.out.println("This will run after scenario is finish, even if it is failed");
    }


    @Given("^the user is on landing page$")
    public void setup() throws Throwable {
        driver.get("http://accountsdemo.herokuapp.com");
        driver.manage().window().maximize();
    }


        //Tag hooks
        @Before("@Signup-DataDriven")
        public void signupsetup()
        {
            System.out.println("This is going to run everytime before any @Signup-DataDriven tagged scenario is going to run");
        }

        @After("@Signup-DataDriven")
        public void signupTearDown()
            {
                System.out.println("This is going to run everytime after any @Signup-DataDriven tagged scenario is going to run");
            }
    }

