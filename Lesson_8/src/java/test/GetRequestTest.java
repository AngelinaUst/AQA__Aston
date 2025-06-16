import org.junit.jupiter.api.Test;
import static org.hamcrest.core.IsEqual.equalTo;

public class GetRequestTest {
    @Test
    public void testWhenGetWithParamsThenStatus200() {
        Specifications specifications = new Specifications();
        specifications.requestParam
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }
}