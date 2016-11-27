package RestAssuredTest;

import com.jayway.restassured.RestAssured;
import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;

public class RESTASSUREDtritonshoes {


    @Test
    public void tritonshoe_01() {
        RestAssured.expect().
                statusCode(200);

        RestAssured.when().
                get("http://tritonshoes.ru/");
    }


    @Test
    public void tritonshoes_02() {

        RestAssured.expect().
                body("id", equalTo("cat_index")).
                body("name", equalTo("rating"));
        RestAssured.when().post("http://tritonshoes.ru/");

    }

    @Test
    public void tritonshoes_03 () {
        RestAssured.given().
                get("http://tritonshoes.ru/");
        RestAssured.expect().
                body("id", equalTo("openstat2304067"));


    }

}
