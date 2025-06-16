import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class PutTextTest {
    @Test
    public void testWhenPostFormDataThenStatus200() {
        Specifications specifications = new Specifications();
        specifications.requestBody
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("data", equalTo(specifications.text));
    }
}