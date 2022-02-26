import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostRequestByFormParam {

    @Test
    void postData(){

        Response response = given().auth().basic("sk_test_51KTVTNSBn5RNu1jZWkiLRQJ8z12POHMmEKVlgyAXT3PWoP8IyJ2dBMlSuQGNY8cKi3e9taqOIjBgFik7X9kpXIOZ00xC0ITavI", "")
                .formParam("name", "Naresh").formParam("email","aryan@gmail.com")
                .post("https://api.stripe.com/v1/customers");

        response.prettyPrint();
    }

}
