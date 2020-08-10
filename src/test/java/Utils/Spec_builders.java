package Utils;

import java.io.IOException;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Spec_builders
{
	private ResponseSpecification res;

	public RequestSpecification request_spec_builder() throws IOException
	{
		RequestSpecBuilder req_build = new RequestSpecBuilder();
		RequestSpecification req = req_build.setBaseUri(Properties_extract.get_property_baseurl()).setContentType(ContentType.JSON).build();
		return req;
	}
	
	public ResponseSpecification response_spec_builder(String content_type) throws No_Body_Exception
	{
			ResponseSpecBuilder res_bui = new ResponseSpecBuilder();
			res = res_bui.expectContentType(content_type).build();
			return res;
	}
}
