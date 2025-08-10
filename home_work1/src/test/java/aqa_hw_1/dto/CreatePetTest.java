package aqa_hw_1.dto;

import aqa_hw_1.task_1.PetDto;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreatePetTest {
    @Test
    public void verifyPetCanBeCreated() {
        String json = "{\n" +
                "  \"id\": 2303,\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"Cat\"\n" +
                "  },\n" +
                "  \"name\": \"Tom\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"https://example.com/photo1.jpg\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";
        Response createPetResponse = given()
                .contentType("application/json")
                .body(json)
                .post("https://petstore.swagger.io/v2/pet");
        PetDto postResponseDto = createPetResponse.as(PetDto.class);
        System.out.println(createPetResponse.asPrettyString());
        Assert.assertEquals(2303, postResponseDto.getId());
    }
}