import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class PostFormDataTest {
    @Test
    public void testWhenPostFormDataThenStatus200() {
        Specifications specifications = new Specifications();
        specifications.requestMultipart
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }
}