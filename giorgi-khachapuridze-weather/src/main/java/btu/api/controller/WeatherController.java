package btu.api.controller;
import btu.api.model.DirectionType;
import btu.api.model.Weather;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/weather")
public class WeatherController {


    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Weather> getWeather() {
        //@TODO illegal character error მიგდებსვ ვერ ვხვდები რატო //
        ￿￿DirectionType north = DirectionType.NORTH;
        DirectionType east = DirectionType.EAST;
        DirectionType west = DirectionType.WEST;
        // ￿￿DirectionType south = DirectionType.SOUTH;

        List<Weather> weatherList= new ArrayList<>();
        weatherList.add(new Weather("Tbilisi",28,12,20, north,20));
        weatherList.add(new Weather("London",18,21,18,east,34));
        weatherList.add(new Weather("Gagra",29,12,20, west,20));
        weatherList.add(new Weather("Ochamchire",31,21,18,west,34));
        return weatherList;
    }

    @GET
    @Path("/{city}")
    @Produces(MediaType.APPLICATION_JSON)
    public Weather getWeatherByCityName(@PathParam("city") String city) {
        List<Weather> weatherList=new ArrayList<>();
        for (Weather data : weatherList) {
            if (data.getCity().equals(city)) {
                return data;
            }
        }
        return null;
    }

}