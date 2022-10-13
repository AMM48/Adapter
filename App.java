package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.geoLocation.GeoLocation;
import edu.kau.fcit.cpit252.weatherDB.WeatherDBI;

public class App {
    public static void main(String[] args) {

        WeatherAdapter a = new WeatherAdapter();

        // Jeddah
        System.out.println("\n" + a.getWeatherInfo(21.543333, 39.172778) + "\n");

        //Makkah
        System.out.println(a.getWeatherInfo(21.383333, 39.850000) + "\n");

        // Medina
        System.out.println(a.getWeatherInfo(24.466667, 39.6) + "\n");
        
    }
}
