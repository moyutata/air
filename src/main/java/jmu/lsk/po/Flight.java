package jmu.lsk.po;

import java.util.Date;

public class Flight {
    private int  flightId;
    private String depart;
    private String arrival;
    private int departTerminal;//出发T
    private int aircraftId;//机型编号
    private int arrivalTerminal;//到达
    private Date departureTime;//出发时间
    private Date arrivalTime;//到达时间
    private double  price;//价格
    private String departN;
    private String departT;
    private String arrivalT;
    private String aircraftName;
    private String arrivalN;
    private int finishSale;
    private int seat;
    private String arrivalTimeR;
    private String departTimeR;
    private Terminal terminal;
    private String deTime;

    public Terminal getTerminal() {
        return terminal;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    public String getDeTime() {
        return deTime;
    }

    public void setDeTime(String deTime) {
        this.deTime = deTime;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getFinishSale() {
        return finishSale;
    }

    public void setFinishSale(int finishSale) {
        this.finishSale = finishSale;
    }


    public String getArrivalTimeR() {
        return arrivalTimeR;
    }

    public void setArrivalTimeR(String arrivalTimeR) {
        this.arrivalTimeR = arrivalTimeR;
    }

    public String getDepartTimeR() {
        return departTimeR;
    }

    public void setDepartTimeR(String departTimeR) {
        this.departTimeR = departTimeR;
    }


    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDepartN() {
        return departN;
    }

    public void setDepartN(String departN) {
        this.departN = departN;
    }

    public String getDepartT() {
        return departT;
    }

    public void setDepartT(String departT) {
        this.departT = departT;
    }

    public String getArrivalT() {
        return arrivalT;
    }

    public void setArrivalT(String arrivalT) {
        this.arrivalT = arrivalT;
    }

    public String getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    public String getArrivalN() {
        return arrivalN;
    }

    public void setArrivalN(String arrivalN) {
        this.arrivalN = arrivalN;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public int getDepartTerminal() {
        return departTerminal;
    }

    public void setDepartTerminal(int departTerminal) {
        this.departTerminal = departTerminal;
    }

    public int getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(int aircraftId) {
        this.aircraftId = aircraftId;
    }

    public int getArrivalTerminal() {
        return arrivalTerminal;
    }

    public void setArrivalTerminal(int arrivalTerminal) {
        this.arrivalTerminal = arrivalTerminal;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", depart='" + depart + '\'' +
                ", arrival='" + arrival + '\'' +
                ", departTerminal=" + departTerminal +
                ", aircraftId=" + aircraftId +
                ", arrivalTerminal=" + arrivalTerminal +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", price=" + price +
                ", departN='" + departN + '\'' +
                ", departT='" + departT + '\'' +
                ", arrivalT='" + arrivalT + '\'' +
                ", aircraftName='" + aircraftName + '\'' +
                ", arrivalN='" + arrivalN + '\'' +
                ", finishSale=" + finishSale +
                ", seat=" + seat +
                ", arrivalTimeR='" + arrivalTimeR + '\'' +
                ", departTimeR='" + departTimeR + '\'' +
                ", terminal=" + terminal +
                ", deTime='" + deTime + '\'' +
                '}';
    }
}
