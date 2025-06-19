import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class PatchRequestTest {
    @Test
    public void testWhenPostFormDataThenStatus200() {

        Specifications specifications = new Specifications();
        specifications.requestBody
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("data", equalTo(specifications.text));
    }
}