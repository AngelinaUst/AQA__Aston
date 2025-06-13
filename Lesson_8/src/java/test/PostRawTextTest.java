import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class PostRawTextTest {
    @Test
    public void whenPostRawText_thenStatus200() {
        String body = "{\n" +
                "    \"test\": \"value\"\n" +
                "}";

        RequestSpecification requestSpecification = given().
                baseUri("https://postman-echo.com")
                .body(body);

        requestSpecification
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(body));
    }
}