package tests;

import utils.ConfigReader;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CustomersAPITest {
    String baseUri = ConfigReader.get("base.uri");

    @Test
    public void testGetCustomerById() {
        RestAssured.baseURI = baseUri;

        given().
                when().
                get("/customers/2").
                then().
                statusCode(200).
                body("data.first_name", equalTo("Janet"));
    }
    @Test
    public void testCreateCustomer() {
        RestAssured.baseURI = baseUri;
        String requestBody = """
            {
                "name": "",
                "job": ""
            }
        """;
        given().
                header("Content-Type", "application/json").
                body(requestBody).
                when().
                post("/users").
                then().
                statusCode(201).
                body("name", equalTo(""));
    }
}


