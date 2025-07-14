package utils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class AuthTokenUtil {
    public static String getToken() {
            Response response = RestAssured
                    .given()
                    .baseUri("https://api.restateapp.com/api")
                    .contentType("application/json")
                    .body("{\"username\": \"user\", \"password\": \"pass\"}")
                    .when()
                    .post("/auth");

            return response.jsonPath().getString("token");
        }
    }


