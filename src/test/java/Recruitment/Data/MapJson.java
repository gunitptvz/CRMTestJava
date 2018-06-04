package Recruitment.Data;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import io.restassured.RestAssured;
import io.restassured.internal.mapping.GsonMapper;

import java.util.List;
import java.util.Dictionary;

import static io.restassured.RestAssured.given;

public class MapJson {

    public static Data GetData(String url){
         String value = given()
                 .get(url)
                 .getBody()
                 .asString();
         Gson gson = new Gson();
         Data result = gson.fromJson(value, Data.class);
        return result;
    }
}
