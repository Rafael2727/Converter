import java.util.Scanner;

public class Converter {

    // Method to convert meters to kilometers
    public static double metersToKilometers(double meters) {
        return meters * 0.001;
    }

    // Method to convert ounces to liters
    public static double ouncesToLiters(double ounces) {
        return ounces * 0.0295735;
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meters to kilometers
        System.out.print("Enter the value in meters: ");
        double meters = scanner.nextDouble();
        System.out.println(meters + " meters = " + metersToKilometers(meters) + " kilometers");

        // Ounces to liters
        System.out.print("Enter the value in ounces: ");
        double ounces = scanner.nextDouble();
        System.out.println(ounces + " ounces = " + ouncesToLiters(ounces) + " liters");

        // Celsius to Fahrenheit
        System.out.print("Enter the value in Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.println(celsius + " °C = " + celsiusToFahrenheit(celsius) + " °F");

        // Fahrenheit to Celsius
        System.out.print("Enter the value in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        System.out.println(fahrenheit + " °F = " + fahrenheitToCelsius(fahrenheit) + " °C");

        scanner.close();
    }
}
