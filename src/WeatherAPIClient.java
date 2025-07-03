import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherAPIClient {
    private static final String API_KEY = "demo";

    public static WeatherData getWeather(String city) {
        try {
            String urlStr = "https://api.weatherapi.com/v1/current.json?key=" + API_KEY + "&q=" + city;
            URL url = new URL(urlStr);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            InputStreamReader reader = new InputStreamReader(conn.getInputStream());
            return JsonParserUtil.parseWeatherJson(reader);

        } catch (Exception e) {
            System.out.println("Error fetching weather: " + e.getMessage());
            return null;
        }
    }
}
