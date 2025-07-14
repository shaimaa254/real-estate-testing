package tests;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.ConfigReader;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class AuthAPITest {
    String baseUri = ConfigReader.get("base.uri");

    @Test
    public void testGetAdminByid() {
        RestAssurd.baseURI = baseUri;
    given().
    when().
    get("").
    then().
    status code().
    body("",equalTo("")).
}
}