package tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import utils.ConfigReader;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
public class UnitsAPITest {
    String baseUri = ConfigReader.get("baseUri");
    @Test
    public void testGetUnit() {
        RestAssured.baseURI = baseUri;
         given().
                when().
                get("").
                then().
                statusCode("");
                body("",equalTo());
    }
    @Test
    public void testCreateUnit() {
        RestAssured.baseURI =baseUri;
         given()
                 .header().body("{ \"unitname\": \"..\", \"category\": \"...\" }")


           when().
           post("").
           then().
           statusCode();
    }
}
