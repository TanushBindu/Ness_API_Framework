//package Step_Definition;
//
//import static io.restassured.RestAssured.given;
//import java.io.IOException;
//
//import org.junit.Assert;
//
//import Utils.EndPoints;
//import Utils.Resuable_Validation_methods;
//import Utils.Spec_builders;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.restassured.response.Response;
//
//public class Get_operation
//{
//	private Spec_builders a1;
//	private Response res;
//
//	@When("user enters the {string} of GET http request")
//	public void user_enters_the_of_GET_http_request(String str) throws IOException 
//	{
//		EndPoints a2 = EndPoints.valueOf(str);
//    	res = given().spec(a1.request_spec_builder()).when().get(a2.getEnd());
//	}
//	
//	@Then("user should get the status code as {string}")
//    public void user_should_get_the_status_code_as(String st) 
//    {
//    	int status_code = Integer.parseInt(st);
//    	System.out.println(res.asString());
//		System.out.println(res.getStatusLine());
//		Resuable_Validation_methods reu = new Resuable_Validation_methods();
//		reu.validate_status_code(status_code, res.getStatusCode());
//		Assert.assertTrue(reu.Chech_value_in_response(res, "Michael"));
//	 }
//}
