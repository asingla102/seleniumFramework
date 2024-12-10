package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class firstStepDef {
    int num1, num2, res;
    Scenario scn;

    @Before
    public void BeforeHook(Scenario s){
        this.scn = s;
        scn.log("******************The Tests are Started**************");
    }

    @After
    public void AfterHook(Scenario s){
        this.scn = s;
        scn.log("******************The Tests are completed**************");
    }

    @Given("I have two numbers {int} and {int}")
    public void iHaveTwoNumbersNumberAndNumber(int arg0, int arg1) {
        num1 = arg0;
        num2 = arg1;
    }

    @When("I add these two numbers")
    public void iAddTheseTwoNumbers() {
        res = num1 + num2;
    }

    @Then("Result should be {int}")
    public void resultShouldBeResult(int sum) {
        Assert.assertEquals(sum, res);
    }
}
