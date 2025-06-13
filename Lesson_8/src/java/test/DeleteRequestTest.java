import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DeleteRequestTest {
    @Test
    public void whenPostFormData_thenStatus200() {
        String text = "Test text message";
        RequestSpecification requestSpecification = given()
                .baseUri("https://postman-echo.com")
                .body(text);

        requestSpecification
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .body("data", equalTo(text));
    }
}