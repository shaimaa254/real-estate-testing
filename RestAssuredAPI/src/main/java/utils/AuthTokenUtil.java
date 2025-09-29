package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AuthTokenUtil {
    public AuthTokenUtil() {
    }

    public static String getToken() {
        Response response = (Response) RestAssured.given().baseUri("https://api.restateapp.com/api").contentType("application/json").body("{\"username\": \"user\", \"password\": \"pass\"}").when().post("/auth", new Object[0]);
        return response.jsonPath().getString("Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiI1IiwianRpIjoiMWFiZGY0MjE5NjI4MjQzYWQ1N2RkNGYwMGYyZjM3OTcxYTdkODVmNmRmMzY5ZmIyZTVkNzM2OGQ3MTc3ZDZmNTVhYTM5OTAwNmVlYjM3ZmEiLCJpYXQiOjE3NTMwMjgwMzQuMzY2MDY2LCJuYmYiOjE3NTMwMjgwMzQuMzY2MTMsImV4cCI6MTc2ODkyNTYzNC4zNTg4NzUsInN1YiI6IjIxNyIsInNjb3BlcyI6W119.gz19EfvcQOgzZ2zFvitnkQNjIlK1pUVdCH03dqsxW5f7gLxMoJE-kcbEhmkbVeym4faENf1q97fSFHW11TencQo-xxrtlI1sEtEfrZNM-ad1hccsoR-tiz_INDh-QjLCaIkrUC-_BWiF8nZeywd4MaImQvIPERHFSFDUmyiQ6q5eVBjvVpEGG2ipodTsH2v5RjUeuIc-OvgL4DPQuK1wGyfmrEMhHdUMyiTnV9IFVg0ZAT3uBBnldgNeKEnrowSKUr_NE0wf65JPGxOO0GS_oWqz94v4VrX6ojaIzQsLIe4IqDG-AlIE1Gt7HtFLyfFwQPg00q71P_xDwhdX1tZvzi__zqg6nqoC9Awp0kMrYoxfVbkgT4peSilJKBTuBhtIteHgUM_2FU1ihaqaFiXq28DSSCbAVg2_-CyCKnFJyF_RRzMxkV7ji6ND5fMcvghHLHW4nUMbkBrgmw1IhqzL2iZb4gUizhYFtsZrudb97yltoOhiBpKDi6VdyrsOGo34gAjIgTcWaM4je9NRjWVeZZNOgbkp9flq1DeZ-kNyAnHiBiSSJwoe6vyiawxHDXq4TP9pnwFR-Rs2CJw_xDCXSgMY_r7_KxEZz9nVgQZNssUNIxF7i5jKb3qdhGkkJYiIBxxTsrlnRc1utnH88RB-95pK9slzrQxP-rm_EA2jQ9Q");
    }
}
