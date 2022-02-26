import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class PostWithArrayListandHashMap {

    @Test
    void postData(){

        HashMap<String, Object> map= new HashMap<String,Object>();
        map.put("email","aryanchauhan@gmail.com");
        map.put("firstName","Aryan");
        map.put("lastName","Chauhan");

        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(12345);
        list.add(67890);
        map.put("mobilenumber",list);

        HashMap<String, Object> nestedmap= new HashMap<String,Object>();
        nestedmap.put("flatno",201);
        nestedmap.put("plotno",58);
        nestedmap.put("city","ghaziabad");

        map.put("address",nestedmap);

        Response response = given().contentType(ContentType.JSON).body(map).post("http://localhost:8080/api/users");

        response.prettyPrint();

        response.then().statusCode(201);


    }
}
