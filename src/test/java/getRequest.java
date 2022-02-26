import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class getRequest {

    @Test
    void getdata() {

        Response response = given().auth().basic("sk_test_51KTVTNSBn5RNu1jZWkiLRQJ8z12POHMmEKVlgyAXT3PWoP8IyJ2dBMlSuQGNY8cKi3e9taqOIjBgFik7X9kpXIOZ00xC0ITavI", "")
                .get("https://api.stripe.com/v1/customers");

        System.out.println(response.prettyPrint());

        response.then().statusCode(200);

        // given().contentType(ContentType.JSON);
        //given().contentType("application/json");
        // given().header("ContentType","application/json");

    }
}
