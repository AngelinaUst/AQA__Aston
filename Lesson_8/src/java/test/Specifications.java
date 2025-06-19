import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class Specifications {
    public String text = "Test text message";
    public RequestSpecification requestBody = given()
            .baseUri("https://postman-echo.com")
            .body(text);
    public RequestSpecification requestParam = given()
            .baseUri("https://postman-echo.com")
            .queryParam("foo1", "bar1")
            .queryParam("foo2", "bar2");
    public RequestSpecification requestMultipart = given()
            .baseUri("https://postman-echo.com")
            .contentType("multipart/form-data")
            .multiPart("foo1", "bar1")
            .multiPart("foo2", "bar2");
}