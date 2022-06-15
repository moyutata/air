package jmu.lsk.po;

public class Seat {
    private String seatId;
    private String shippingId;
    private int aircraftId;
    private String location;

    @Override
    public String toString() {
        return "Seat{" +
                "seatId=" + seatId +
                ", shippingId='" + shippingId + '\'' +
                ", aircraftId=" + aircraftId +
                ", location='" + location + '\'' +
                '}';
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public String getShippingId() {
        return shippingId;
    }

    public void setShippingId(String shippingId) {
        this.shippingId = shippingId;
    }

    public int getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(int aircraftId) {
        this.aircraftId = aircraftId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
