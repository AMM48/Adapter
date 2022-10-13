package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.geoLocation.GeoLocation;
import edu.kau.fcit.cpit252.weatherDB.WeatherDBI;

public class WeatherAdapter implements WeatherGeo {
    WeatherDBI city = new WeatherDBI();
    GeoLocation g = new GeoLocation();
    @Override
    public String getWeatherInfo(double latitude, double longitude) {
        String c = g.search(latitude, longitude);
        String info = city.getWeatherInfo(c);
        return c + " " + info;

    }
    
}
