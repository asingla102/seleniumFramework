package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import restAssuredLearning.RestAssuredLearn;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class apiTestSteps extends RestAssuredLearn {
    private static final Log log = LogFactory.getLog(apiTestSteps.class);
    RequestSpecification req;
    Response res;

    @Given("I have API endpoint {string}, username {string}, password {string}")
    public void iHaveAPIEndpointUsernamePassword(String uri, String userName, String password) {
        apiRequest(uri, userName, password);
    }

    @When("I passed claim id {string}")
    public void iPassedClaimId(String claimId) {
        passValue(claimId);
    }

    @Then("I should retrieve correct status code {int}")
    public void iShouldRetrieveCorrectStatusCodeAsStatusCode(int statusCode) {
        getStatusCode(statusCode);
    }

    @And("I should retrieve claim code {string}")
    public void iShouldRetrieveClaimCode(String claimCode) {
        getResponseData(claimCode);
    }

}
