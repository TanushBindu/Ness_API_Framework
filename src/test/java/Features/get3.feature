Feature: Performing GET operation1

Background: User enter base url
Given user enter the base url

@Valid_value_Get_Validatation
Scenario Outline: GET operation validation for List of user endpoint
When user enters the <Endpoint name> of GET http request
Then user should get the status code as <Status Code>
And user should get the status line as <Status Line>
And User Should get the content type as <Content Type>
Examples:
|Endpoint name|Status Code|Status Line|Content Type|
|List_of_user|200|HTTP/1.1 200 OK|application/json; charset=utf-8|
|Single_user|200|HTTP/1.1 200 OK|application/json; charset=utf-8|
|Single_user_not_found|404|HTTP/1.1 404 Not Found|application/json; charset=utf-8|
|List_resource|200|HTTP/1.1 200 OK|application/json; charset=utf-8|
|Single_resource|200|HTTP/1.1 200 OK|application/json; charset=utf-8|
|Single_user_not_found_resource|404|HTTP/1.1 404 Not Found|application/json; charset=utf-8|
|Delay_response|200|HTTP/1.1 200 OK|application/json; charset=utf-8|


@Valid_value_Post_Operation
Scenario: POST operation validation forCreate Single User endpoint
When user enters the "Create_Single_user" of POST http request and pass the json body
Then user should get 201 as status code
