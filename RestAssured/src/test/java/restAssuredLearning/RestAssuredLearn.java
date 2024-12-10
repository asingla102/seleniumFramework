package restAssuredLearning;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredLearn {

    private static final Log log = LogFactory.getLog(RestAssuredLearn.class);
    RequestSpecification reqSpec;
    Response resp;

    public void apiRequest(String baseUri, String username, String password){
        reqSpec = given().auth().preemptive().basic(username, password).baseUri(baseUri);
    }

    public void passValue(String id){
        resp = reqSpec.when().get(id);
    }

    public void getStatusCode(int statusCode){
        resp.then().statusCode(statusCode);
    }

    public void getResponseData(String claimCode){
        resp.then().assertThat().body("code", equalTo(claimCode));
        log.info(resp.jsonPath().get("code"));
    }

}