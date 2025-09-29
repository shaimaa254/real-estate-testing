package utils;

import io.restassured.response.Response;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class ResponseValidatorUtil {
    public ResponseValidatorUtil() {
    }

    public static void validateStatusCode(Response response, int expectedStatusCode) {
        MatcherAssert.assertThat("Status code mismatch!", response.getStatusCode(), Matchers.is(expectedStatusCode));
    }

    public static void validateContentType(Response response, String expectedContentType) {
        MatcherAssert.assertThat("Unexpected content type!", response.getContentType(), Matchers.containsString(expectedContentType));
    }

    public static void validateJsonField(Response response, String jsonPath, String expectedValue) {
        MatcherAssert.assertThat("Unexpected field value!", response.jsonPath().getString(jsonPath), Matchers.equalTo(expectedValue));
    }
}
