package jmu.lsk.po;

public class Airport {
    private int cityId;
    private String airportName;
    private City city;
    private int airportId;

    @Override
    public String toString() {
        return "Airport{" +
                "airportId=" + airportId +
                ", cityId=" + cityId +
                ", airportName='" + airportName + '\'' +
                ", city=" + city +
                '}';
    }

    public int getAirportId() {
        return airportId;
    }

    public void setAirportId(int airportId) {
        this.airportId = airportId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }


}
