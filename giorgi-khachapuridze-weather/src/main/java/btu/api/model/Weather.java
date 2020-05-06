package btu.api.model;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Weather {
    private String city;
    private int temperature;
    private int humidity;
    private int pressure;
    private DirectionType windDirection;
    private int windSpeed;


    public Weather() {

    }

    public Weather(String city, int temperature, int humidity, int pressure, DirectionType windDirection, int windSpeed) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public DirectionType getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(DirectionType windDirection) {
        this.windDirection = windDirection;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", windDirection='" + windDirection + '\'' +
                ", windSpeed=" + windSpeed +
                '}';
    }
}
