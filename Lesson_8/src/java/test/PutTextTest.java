import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PutTextTest {
    @Test
    public void testWhenPostFormDataThenStatus200() {
        String text = "Test text message";
        RequestSpecification requestSpecification = given()
                .baseUri("https://postman-echo.com")
                .body(text);

        requestSpecification
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("data", equalTo(text));
    }
}