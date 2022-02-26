import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;

import java.util.HashMap;

public class PostRequestJsonBodyAsHashMap {

    @Test
    void postRequestasHasMap(){

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("email","eve.holt@reqres.in");
        map.put("password","pistol");
        Response response = given().contentType(ContentType.JSON).body(map).post("https://reqres.in/api/register");

        response.prettyPrint();

    }
}
