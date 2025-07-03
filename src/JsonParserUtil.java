import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStreamReader;

public class JsonParserUtil {
    public static WeatherData parseWeatherJson(InputStreamReader reader) {
        JsonObject obj = JsonParser.parseReader(reader).getAsJsonObject();
        String city = obj.get("location").getAsJsonObject().get("name").getAsString();
        double temp = obj.get("current").getAsJsonObject().get("temp_c").getAsDouble();
        String desc = obj.get("current").getAsJsonObject().get("condition").getAsJsonObject().get("text").getAsString();

        return new WeatherData(city, temp, desc);
    }
}
