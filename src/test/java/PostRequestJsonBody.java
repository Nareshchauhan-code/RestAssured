import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostRequestJsonBody {

    @Test
    void postRequestJsonBody(){

        Response response = given().contentType(ContentType.JSON).body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}")
                .post("https://reqres.in/api/users");

        response.prettyPrint();

    }
}
