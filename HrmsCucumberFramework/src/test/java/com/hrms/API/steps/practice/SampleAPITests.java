package com.hrms.API.steps.practice;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class SampleAPITests {
@Test
	public void getAllJobTitles() {
		Response response=RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI2NjQ1MzYsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4Mjc3OTczNiwidXNlcklkIjoiOTUifQ.6ckS2tKIetrl4wOx2MFbmtArGkjoWJqkfwxfmLL2NKM")
				.when().get("http://18.232.148.34/syntaxapi/api/jobTitle.php");
		response.prettyPrint();
		int actualResponseCode=response.getStatusCode();
		System.out.println(actualResponseCode);
}
	
@Test
public void getOneEmployee() {
	Response response=RestAssured.given().param("employee_id","3394").contentType("application/json").header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI2NjQ4MzQsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4Mjc4MDAzNCwidXNlcklkIjoiOTUifQ.lZWRupL1dX_dMcxt3AsI_ywJRUygEw2_FU0uoUqj49A")
	.when().get("http://18.232.148.34/syntaxapi/api/getOneEmployee.php");
response.prettyPrint();
int actualResponseCode=response.getStatusCode();
System.out.println(actualResponseCode);
}
/*
 * TASK: getAllEmployStatuses
 * prettyPrint();
 * print status code
 *
 */
@Test
public void getAllEmployees() {
	Response response=RestAssured.given().contentType("application/json").header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI2NjQ4MzQsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4Mjc4MDAzNCwidXNlcklkIjoiOTUifQ.lZWRupL1dX_dMcxt3AsI_ywJRUygEw2_FU0uoUqj49A")
	.when().get("http://18.232.148.34/syntaxapi/api/employeeStatus.php");
	response.prettyPrint();
	int  actualStatusCode=response.getStatusCode();
	System.out.println(actualStatusCode);
	//Assert.assertEquals(200, actualStatusCode);

}
@Test
public void createEmployee() {
	Response response=RestAssured.given().contentType("application/json").header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI2NjQ4MzQsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4Mjc4MDAzNCwidXNlcklkIjoiOTUifQ.lZWRupL1dX_dMcxt3AsI_ywJRUygEw2_FU0uoUqj49A")
	.param("emp_firstname", "new")
	.param("emp_lastname", "employee")
	.param("emp_middlename", "syntax")
	.param("emp_gender", "2")
	.param("emp_birthday", "1991-04-22")
	.param("emp_status", "Employee")
	.param("emp_jobTitle", "Developer")
	.when().post("http://18.232.148.34/syntaxapi/api/createEmployee.php");
	response.prettyPrint();
	int actualStatusCode=response.getStatusCode();
	Assert.assertEquals(200, actualStatusCode);
	
}
}
