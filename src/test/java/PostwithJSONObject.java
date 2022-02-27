import com.fasterxml.jackson.databind.util.JSONPObject;
import io.restassured.http.ContentType;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PostwithJSONObject {

    @Test
    void postwithJsonObject(){

        JSONObject object = new JSONObject();


        object.put("email","aryanchauhan@gmail.com");
        object.put("firstName","Aryan");
        object.put("lastName","Chauhan");
        object.put("email","aryanchauhan@gmail.com");
        JSONArray mobilenum = new JSONArray();
        mobilenum.put(12345);
        mobilenum.put(67890);
        object.put("mobilenumber",mobilenum);

        JSONObject adress= new JSONObject();

        adress.put("flatno", 201);
        adress.put("plotno", 58);
        adress.put("city", "ghaziabad");

        object.put("adress",adress);


        Response response = given().contentType(ContentType.JSON).body(object.toString()).post("http://localhost:8080/api/users");

        response.prettyPrint();

        response.then().statusCode(201);

        Response response2 = given().contentType(ContentType.JSON).get("http://localhost:8080/api/users");
        response2.prettyPrint();

        response2.then().statusCode(200);



    }
}
