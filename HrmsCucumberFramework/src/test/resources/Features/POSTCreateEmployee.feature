Feature: Validating Syntax HRMS API's
Baclground:
Given user generates token
@APITEST
Scenario: this test will check to see if an Employee is created
Given user calls createdEmployee API
When user retrieves response
Then status code is 200
Then user validated employee is created