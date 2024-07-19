package projects;

import java.util.Scanner;

class Temperatureconverter{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Welcome to temperature converter");
        System.out.println("Choose the conversion you want to perform");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Kelvin");
        System.out.println("3. Kelvin to Celsius");
        System.out.println("4. Fahrenheit to Celsius");
        System.out.println("5. Celsius to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        int choice = scan.nextInt();
        System.out.println("Enter the temperature to convert: ");
        double temperature = scan.nextDouble();
        double convertedTemperature = 0;

        switch(choice){
            case 1:
                convertedTemperature = celsiusToFahrenheit(temperature);
                System.out.println(temperature + "°C is " + convertedTemperature + "°F");
                break;
            
            case 2:
                convertedTemperature = fahrenheitToKelvin(temperature);
                System.out.println(temperature + "°F is " + convertedTemperature + "K");
                break;

            case 3:
                convertedTemperature = kelvinToCelsius(temperature);
                System.out.println(temperature + "K is " + convertedTemperature + "°C");
                break;

            case 4:
                convertedTemperature = fahrenheitToCelsius(temperature);
                System.out.println(temperature + "°F is " + convertedTemperature + "°C");
                break;

            case 5:
                convertedTemperature = celsiusToKelvin(temperature);
                System.out.println(temperature + "°C is " + convertedTemperature + "K");
                break;

            case 6:
                convertedTemperature = kelvinToFahrenheit(temperature);
                System.out.println(temperature + "K is " + convertedTemperature + "°F");
                break;

            default:
                System.out.println("Enter a valid input");
                break;
       }
        }
    }
    public static double celsiusToFahrenheit(double temperature){
        return (temperature * 9/5) + 32;
    }

    public static double fahrenheitToKelvin(double temperature){
        return (temperature - 32) * 5/9 + 273.15;
    }
    
    public static double kelvinToCelsius(double temperature){
        return temperature - 273.15;
    }

    public static double fahrenheitToCelsius(double temperature){
        return (temperature - 32) * 5/9;
    }

    public static double celsiusToKelvin(double temperature){
        return temperature + 273.15;
    }

    public static double kelvinToFahrenheit(double temperature){
        return (temperature - 273.15) * 9/5 + 32;
    }
}