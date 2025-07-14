package utils;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
public class RequestSpecBuilderUtil {

    public static RequestSpecification getRequestSpec(String baseUri, String token) {
            return new RequestSpecBuilder()
                    .setBaseUri(baseUri)
                    .addHeader("Content-Type", "application/json")
                    .addHeader("Authorization", "Bearer " + token)
                    .build();
        }

        public static RequestSpecification getBasicSpec(String baseUri) {
            return new RequestSpecBuilder()
                    .setBaseUri(baseUri)
                    .addHeader("Content-Type", "application/json")
                    .build();
        }
    }


