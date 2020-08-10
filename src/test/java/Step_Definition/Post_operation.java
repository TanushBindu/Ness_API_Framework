package Step_Definition;
import static io.restassured.RestAssured.given;

import Utils.EndPoints;
import Utils.Json_extractor;
import Utils.Spec_builders;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class Post_operation 
{
	private Response res;
	private Spec_builders a1;

	@Given("^user enter the base url$")
    public void user_enter_the_base_url() throws Throwable 
	{
		a1 = new Spec_builders();
	}
	@When("^user enters the \"([^\"]*)\" of POST http request and pass the json body$")
    public void user_enters_the_something_of_post_http_request_and_pass_the_json_body(String str) throws Throwable
    {
		EndPoints a2 = EndPoints.valueOf(str);
    	res = given().spec(a1.request_spec_builder()).body(Json_extractor.Single_json("./SingleData.json")).when().post(a2.getEnd()).then().extract().response();
    }

    @Then("^user should get 201 as status code$")
    public void user_should_get_201_as_status_code() throws Throwable 
    {
    	System.out.println(res.asString());
    	System.out.println(res.getStatusCode());
    }
}
