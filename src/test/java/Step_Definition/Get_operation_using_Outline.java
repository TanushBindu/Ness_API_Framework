package Step_Definition;
import static io.restassured.RestAssured.given;

import org.junit.Assert;

import Utils.EndPoints;
import Utils.Resuable_Validation_methods;
import Utils.Spec_builders;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class Get_operation_using_Outline 
{
	 private Spec_builders a1;
	private Response res;
	private Resuable_Validation_methods reu;

	@Given("^user enter the base url$")
	    public void user_enter_the_base_url() throws Throwable 
	 {
		 a1 = new Spec_builders();
	 }
	 
	    @When("^user enters the (.+) of GET http request$")
	    public void user_enters_the_of_get_http_request(String endpointname) throws Throwable 
	    {
	    	EndPoints a2 = EndPoints.valueOf(endpointname);
	    	res = given().spec(a1.request_spec_builder()).when().get(a2.getEnd());
	    }

	    @Then("^user should get the status code as (.+)$")
	    public void user_should_get_the_status_code_as(String statuscode) throws Throwable 
	    {
	    	int status_code = Integer.parseInt(statuscode);
	    	System.out.println(res.asString());
			System.out.println(res.getStatusLine());
		    reu = new Resuable_Validation_methods();
			Assert.assertTrue(reu.validate_status_code(status_code, res.getStatusCode()));
			System.out.println(res.getContentType());
	    }
	    
	    @And("^user should get the status line as (.+)$")
	    public void user_should_get_the_status_line_as(String statusline) throws Throwable 
	    {
	    	Assert.assertTrue(reu.validate_status_line(statusline, res.getStatusLine()));
	    }

	    @And("^User Should get the content type as (.+)$")
	    public void user_should_get_the_content_type_as(String contenttype) throws Throwable 
	    {
	    	Assert.assertTrue(reu.Check_the_content_type(res, contenttype));
	    }
}
