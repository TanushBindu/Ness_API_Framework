Feature: Performing GET operation1

@Get 
Scenario: GET operation validation for List of user endpoint
When user enters the "List_of_user" of GET http request
Then user should get the status code as "200"

@Get
Scenario: GET operation validation for Single user endpoint
When user enters the "Single_user" of GET http request
Then user should get the status code as "200"

@Get
Scenario: GET operation validation for Single user not found endpoint
When user enters the "Single_user_not_found" of GET http request
Then user should get the status code as "404"

@Get
Scenario: GET operation validation for List Resource endpoint
When user enters the "List_resource" of GET http request
Then user should get the status code as "200"

@Get
Scenario: GET operation validation for Single resource endpoint
When user enters the "Single_resource" of GET http request
Then user should get the status code as "200"

@Get
Scenario: GET operation validation for Single user not found resource endpoint
When user enters the "Single_user_not_found_resource" of GET http request
Then user should get the status code as "404"

@Get
Scenario: GET operation validation for Delay Response endpoint
When user enters the "Delay_response" of GET http request
Then user should get the status code as "200"




