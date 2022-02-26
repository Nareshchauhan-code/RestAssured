import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;

import java.io.File;

public class PostRequestJsonBodyasJSONFile {

    @Test
    void postJsonFile(){


        Response response = given().contentType(ContentType.JSON).body(new File("JSONFILES/response_1645879817143.json")).post("http://localhost:8080/api/users");

        response.prettyPrint();

        response.then().statusCode(201);

        Response response2 = given().contentType(ContentType.JSON).get("http://localhost:8080/api/users");

        response2.prettyPrint();

        response2.then().statusCode(200);


    }
}
