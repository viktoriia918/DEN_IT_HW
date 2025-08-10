package aqa_hw_1.task_3;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class ControllerDeleteTest {


    @Test
    public void shouldReturnNotFoundWhenDeletingNonExistingAnimal() {
        long nonExistingId = 9999999;


        Response response = RestAssured
                .given()
                .when()
                .delete("https://petstore.swagger.io/v2/pet/" + nonExistingId)
                .then()
                .statusCode(404) // Перевірка HTTP статусу
                .extract()
                .response();

        String responseBody = response.getBody().asString();
        System.out.println("Response body: '" + responseBody + "'");

        Assert.assertTrue("Response body should be empty", responseBody.isEmpty());
    }
}