package aqa_hw_1.task_2;


import aqa_hw_1.task_3.ErrorResponseDto;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class ControllerTest {

    @Test
    public void  shouldReturnNotFoundForNonExistingAnimal() {
        long nonExistingId = 99999;

        Response response = RestAssured
                .given()
                .when()
                .get("https://petstore.swagger.io/v2/pet/99999" + nonExistingId)
                .then()
                .statusCode(404)
                .extract().response();
        System.out.println(response.asString());

        ErrorResponseDto errorResponse = response.as(ErrorResponseDto.class);

        Assert.assertEquals(1, errorResponse.getCode());
        Assert.assertEquals("error", errorResponse.getType());
        Assert.assertEquals("Pet not found", errorResponse.getMessage());

    }
}