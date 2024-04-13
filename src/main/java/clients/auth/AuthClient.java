package clients.auth;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AuthClient {

    public AuthResponse createTokenForUser(AuthRequest authRequest){
        String url = String.format("%s/auth","https://restful-booker.herokuapp.com");
        System.out.println(url);

        Response response = given()
                .contentType("application/json")
                .when()
                .body(authRequest)
                .post(url)
                .then()
                .log().all()
                .extract().response();
        AuthResponse authResponse = response.as(AuthResponse.class); //deserialization
        authResponse.setHttpStatusCode(response.getStatusCode());
        return authResponse;

    }
}
