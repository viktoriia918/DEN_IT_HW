package aqa_hw_1.dto;

import aqa_hw_1.task_1.PetDto;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetPetTests {
    @Test
    public void verifyPetCanBeObtained() {
        Response response = given().get("https://petstore.swagger.io/v2/pet/765");
        System.out.println(response.asPrettyString());
        PetDto petDto = response.as(PetDto.class);
        System.out.println(petDto);
        Assert.assertEquals(200, response.statusCode());
    }
}