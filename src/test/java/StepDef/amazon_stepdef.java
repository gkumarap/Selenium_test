package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class amazon_stepdef {

    private static final Logger logger = LoggerFactory.getLogger(amazon_stepdef.class);
    @Given("the {word} opens the browser")
    public void the_User_Opens_The_Browser(String user) {
        logger.info("first step");
    }

    @When("the user opens {word} website")
    public void theUserOpensAmazonComWebsite(String website) {
        logger.info("Second step");
    }

    @Then("the amazon webpage is opened without any error")
    public void theAmazonWebpageIsOpenedWithoutAnyError() {
        logger.info("Third Step");

    }

}
