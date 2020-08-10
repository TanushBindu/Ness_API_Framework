package Utils;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

/*
 * Resuable_Validation_methods class contains All Reuseable validation methods
 * 
 * */
public class Resuable_Validation_methods 
{
	/*
	 * validate_status_code is used to check wheather the excpected status code is matching
	 * with the actual status line and it will return true and false
	 * This method will take two Interger parameter
	 * */
	public boolean validate_status_code(int expected_code,int actual_code){
		if (expected_code==actual_code) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * validate_status_line is used to check wheather the excpected status line is matching
	 * with the actual status lineand it will return true and false
	 * This method will take two String parameter
	 * */
	public boolean validate_status_line(String expected_line,String actual_line){
		if (expected_line.equals(actual_line)) {
			return true;
		}else{
			return false;
		}
	}
	
	/*
	 * validate_status_line is used to check wheather the excpected status line is matching
	 * with the actual status lineand it will return true and false
	 * This method will take two String parameter
	 * */
	public void validate_status_time(int expected_time,long l){
		boolean op;
		if (l<=expected_time){
			op =  true;
		}
		op =  false;
		assertTrue(op);
	}
	
	/*
	 * validate_status_line is used to check wheather the excpected status line is matching
	 * with the actual status lineand it will return true and false
	 * This method will take two String parameter
	 * */
	public static boolean Chech_value_in_response(Response res,String expected_value)
	{
		if (res.asString().contains(expected_value)) {
			return true;
		}else{
			return false;
		}
	}
	
//	public static boolean Check_the_content_type(Response res,String content_type)
//	{
//		boolean flag = false;
//		if (res.contentType().contains(content_type)) {
//			switch (content_type.toUpperCase())
//			{
//			case "JSON":
//				flag = true;
//				break;
//			case "XML":
//				flag = true;
//				break; 
//			case "HTML":
//				flag = true;
//				break;
//			case "TEXT":
//				flag = true;
//				break;
//			case "ANY":
//				flag = true;
//				break;
//			case "URLENC":
//				flag = true;
//				break;
//			case "BINARY":
//				flag = true;
//				break;
//			default:try 
//			{
//				throw new No_Body_Exception("No Body in the response");
//			} catch (No_Body_Exception e) 
//			{
//				e.getMsg();
//				flag = false;
//			}
//				break;
//			}
//		}
//		return flag;
//	}
	
	/*
	 * Check_the_content_type is used to validate the content type
	 * with the expected content type and actual content type
	 * */
	public static boolean Check_the_content_type(Response res,String content_type)
	{
		if (res.contentType().equals(content_type)) {
			return true;
		}else {
			return false;
		}
	}
}
