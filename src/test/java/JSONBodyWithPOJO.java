import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class JSONBodyWithPOJO {

    @Test
    void pojoBody(){

        User ob= new User("Naresh","Chauhan","Aryan@gmail.com");

        Response response = given().contentType(ContentType.JSON).body(ob).post("http://localhost:8080/api/users");

        response.prettyPrint();

        Response response2 = given().contentType(ContentType.JSON).get("http://localhost:8080/api/users");

        response2.prettyPrint();

        response2.then().statusCode(200);

    }

}
