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
    static String url = "https://raw.githubusercontent.com/gunitptvz/CRMTestJava/master/Config1.json";

    public static String GetData(){
         String value = given()
                 .get(url)
                 .asString();
         Gson gson = new Gson();
         List<Data> result = gson.fromJson(value, new TypeToken<List<Data>>(){}.getType());
        return value;
    }
}
