import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PatchRequestTest {
    @Test
    public void whenPostFormDataThenStatus200() {
        String text = "Test text message";
        RequestSpecification requestSpecification = given()
                .baseUri("https://postman-echo.com")
                .body(text);

        requestSpecification
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("data", equalTo(text));
    }
}