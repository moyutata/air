package jmu.lsk.po;

public class Luggage {
    private Integer luggageId;
    private String ticketId;
    private int luggageWeight;
    private double length;
    private  double width;
    private double height;
    private double fine;


    public int getLuggageId() {
        return luggageId;
    }

    public void setLuggageId(int luggageId) {
        this.luggageId = luggageId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public int getLuggageWeight() {
        return luggageWeight;
    }

    public void setLuggageWeight(int luggageWeight) {
        this.luggageWeight = luggageWeight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }
    @Override
    public String toString() {
        return "luggage{" +
                "luggageId=" + luggageId +
                ", ticketId='" + ticketId + '\'' +
                ", luggageWeight=" + luggageWeight +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", fine=" + fine +
                '}';
    }
}
