import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostFormDataTest {
    @Test
    public void testWhenPostFormDataThenStatus200() {
        RequestSpecification requestSpecification = given()
                .baseUri("https://postman-echo.com")
                .contentType("multipart/form-data")
                .multiPart("foo1", "bar1")
                .multiPart("foo2", "bar2");

        requestSpecification
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }
}