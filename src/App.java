import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("======= WeatherMate =======");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a city name: ");
        String city = scanner.nextLine().trim();  // ✅ Declare city here first

        System.out.println("\nFetching weather data for " + city + "...");

        WeatherData data = WeatherAPIClient.getWeather(city);
        if (data != null) {
            System.out.println("\n-------- Weather Report --------");
            System.out.println("City: " + data.getCity());
            System.out.println("Temperature: " + data.getTemperature() + "°C");
            System.out.println("Weather: " + data.getDescription());
            System.out.println("--------------------------------");
        } else {
            System.out.println("Failed to fetch weather data.");
        }

        scanner.close();
    }
}
