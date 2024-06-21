package helpers;

import config.Url;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import models.CreateUserRequest;
import models.CreateUserResponse;

import static io.restassured.RestAssured.given;

public class UserHelper {
    static Url url = new Url();

    private static RequestSpecification REQ_SPEC = new RequestSpecBuilder()
            .setUrlEncodingEnabled(false)
            .setBaseUri(url.getRegresService())
            .setContentType(ContentType.JSON)
            .build();

    public CreateUserResponse createUser(String login, String password){

        CreateUserRequest body = new CreateUserRequest()
                .login(login)
                .password(password);

        return given().spec(REQ_SPEC)
                .basePath("/users")
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .body(body)
                .when()
                .post()
                .then().statusCode(200).extract().response().prettyPeek().as(CreateUserResponse.class);
    }
}
