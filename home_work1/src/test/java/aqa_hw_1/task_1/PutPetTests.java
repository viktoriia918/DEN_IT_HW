package aqa_hw_1.task_1;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class PutPetTests {

    @Test

    public void verifyPetCanBeModified() {

        CategoryDto category = new CategoryDto(2566, "Cat");
        PetDto pet = new PetDto(2566, category, "Tom", "available");

        Response createResponse = given()
                .contentType(ContentType.JSON)
                .body(pet)
                .when()
                .post("https://petstore.swagger.io/v2/pet");


        Response getResponse = given().get("https://petstore.swagger.io/v2/pet/2566");

        Assert.assertEquals("Tom", getResponse.jsonPath().getString("name"));
        Assert.assertEquals("available", getResponse.jsonPath().getString("status"));
        Assert.assertEquals("Cat", getResponse.jsonPath().getString("category.name"));


        CategoryDto updatedCategory = new CategoryDto(2566, "Mouse");
        PetDto updatedPet = new PetDto(
                pet.getId(),
                updatedCategory,
                "Jerry",
                "sold"
        );


        Response putResponse = given()
                .contentType(ContentType.JSON)
                .body(updatedPet)
                .when()
                .put("https://petstore.swagger.io/v2/pet/");

        Assert.assertEquals(200, putResponse.statusCode());


        Response updatedResponse = given().get("https://petstore.swagger.io/v2/pet/2566");

        System.out.println(updatedResponse.asPrettyString());
        PetDto petDto = updatedResponse.as(PetDto.class);
        Assert.assertEquals(200, updatedResponse.statusCode());
        Assert.assertEquals("Jerry", petDto.getName());
        Assert.assertEquals("sold", petDto.getStatus());
        Assert.assertEquals("Mouse", petDto.getCategory().getName());
    }
}