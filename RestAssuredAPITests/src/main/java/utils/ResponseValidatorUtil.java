package utils;
import io.restassured.response.Response;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class ResponseValidatorUtil {

    public static void validateStatusCode(Response response, int expectedStatusCode) {
            assertThat("Status code mismatch!", response.getStatusCode(), is(expectedStatusCode));
        }

        public static void validateContentType(Response response, String expectedContentType) {
            assertThat("Unexpected content type!", response.getContentType(), containsString(expectedContentType));
        }

        public static void validateJsonField(Response response, String jsonPath, String expectedValue) {
            assertThat("Unexpected field value!", response.jsonPath().getString(jsonPath), equalTo(expectedValue));
        }
    }


