package TestRunner;

import cucumber.api.junit.Cucumber;


//@RunWith(Cucumber.class)
@Cucumber.Options(format = {"json:target/REPORT_NAME.json", "pretty",
        "html:target/HTML_REPORT_NAME"}, features = {"src/test/java/features/NewClientWorkflow.feature"},
        glue = {"steps"})
public class RunCuckesTest {
}
