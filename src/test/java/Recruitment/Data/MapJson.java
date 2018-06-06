package Recruitment.Data;

import com.google.gson.Gson;
import static io.restassured.RestAssured.given;

/**
 * Helps to map data from Json file
 */
public class MapJson {
    /**
     * Returns Data class object with initialized getters
     * @param url - path to Github repository file
     * @return - Data class object
     */
    public static Data getData(String url){
        // Gets Json file from a remote Github repository
        String value = given()
                 .get(url)
                 .getBody()
                 .asString();
         // Parses Json to a class members
         Gson gson = new Gson();
         Data result = gson.fromJson(value, Data.class);

        return result;
    }
}
