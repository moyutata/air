package jmu.lsk.po;

import java.util.Date;
import java.util.List;

public class ExecutiveFlight {
    private int execId;
    private int flightId;
    private Date execDate;//执飞日期
    private double execPrice;
    private String status;
    private String boardingGate;//登机口
    private Date boardingTime;//登机时间
    private Date estimateDeparture;//预计出发时间
    private Date actualDeparture;//时间出发时间
    private Date estimateArrival;//预计到达时间
    private Date actualArrival;//实际到达时间
    private String execDateR;
    private String boardingTimeR;//登机时间
    private String estimateDepartureR;//预计出发时间
    private String actualDepartureR;//时间出发时间
    private String estimateArrivalR;//预计到达时间
    private String actualArrivalR;//实际到达时间

    private List<TicketTypes> ticketTypeList;
    private Flight deFlight;
    private Flight arFlight;

    public List<TicketTypes> getTicketTypeList() {
        return ticketTypeList;
    }

    public void setTicketTypeList(List<TicketTypes> ticketTypeList) {
        this.ticketTypeList = ticketTypeList;
    }

    public Flight getDeFlight() {
        return deFlight;
    }

    public void setDeFlight(Flight deFlight) {
        this.deFlight = deFlight;
    }

    public Flight getArFlight() {
        return arFlight;
    }

    public void setArFlight(Flight arFlight) {
        this.arFlight = arFlight;
    }


    public String getExecDateR() {
        return execDateR;
    }

    public void setExecDateR(String execDateR) {
        this.execDateR = execDateR;
    }

    public String getBoardingTimeR() {
        return boardingTimeR;
    }

    public void setBoardingTimeR(String boardingTimeR) {
        this.boardingTimeR = boardingTimeR;
    }

    public String getEstimateDepartureR() {
        return estimateDepartureR;
    }

    public void setEstimateDepartureR(String estimateDepartureR) {
        this.estimateDepartureR = estimateDepartureR;
    }

    public String getActualDepartureR() {
        return actualDepartureR;
    }

    public void setActualDepartureR(String actualDepartureR) {
        this.actualDepartureR = actualDepartureR;
    }

    public String getEstimateArrivalR() {
        return estimateArrivalR;
    }

    public void setEstimateArrivalR(String estimateArrivalR) {
        this.estimateArrivalR = estimateArrivalR;
    }

    public String getActualArrivalR() {
        return actualArrivalR;
    }

    public void setActualArrivalR(String actualArrivalR) {
        this.actualArrivalR = actualArrivalR;
    }

    public int getExecId() {
        return execId;
    }

    public void setExecId(int execId) {
        this.execId = execId;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public Date getExecDate() {
        return execDate;
    }

    public void setExecDate(Date execDate) {
        this.execDate = execDate;
    }

    public double getExecPrice() {
        return execPrice;
    }

    public void setExecPrice(double execPrice) {
        this.execPrice = execPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBoardingGate() {
        return boardingGate;
    }

    public void setBoardingGate(String boardingGate) {
        this.boardingGate = boardingGate;
    }

    public Date getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(Date boardingTime) {
        this.boardingTime = boardingTime;
    }

    public Date getEstimateDeparture() {
        return estimateDeparture;
    }

    public void setEstimateDeparture(Date estimateDeparture) {
        this.estimateDeparture = estimateDeparture;
    }

    public Date getActualDeparture() {
        return actualDeparture;
    }

    public void setActualDeparture(Date actualDeparture) {
        this.actualDeparture = actualDeparture;
    }

    public Date getEstimateArrival() {
        return estimateArrival;
    }

    public void setEstimateArrival(Date estimateArrival) {
        this.estimateArrival = estimateArrival;
    }

    public Date getActualArrival() {
        return actualArrival;
    }

    public void setActualArrival(Date actualArrival) {
        this.actualArrival = actualArrival;
    }

    @Override
    public String toString() {
        return "ExecutiveFlight{" +
                "execId=" + execId +
                ", flightId=" + flightId +
                ", execDate=" + execDate +
                ", execPrice=" + execPrice +
                ", status='" + status + '\'' +
                ", boardingGate='" + boardingGate + '\'' +
                ", boardingTime=" + boardingTime +
                ", estimateDeparture=" + estimateDeparture +
                ", actualDeparture=" + actualDeparture +
                ", estimateArrival=" + estimateArrival +
                ", actualArrival=" + actualArrival +
                ", execDateR='" + execDateR + '\'' +
                ", boardingTimeR='" + boardingTimeR + '\'' +
                ", estimateDepartureR='" + estimateDepartureR + '\'' +
                ", actualDepartureR='" + actualDepartureR + '\'' +
                ", estimateArrivalR='" + estimateArrivalR + '\'' +
                ", actualArrivalR='" + actualArrivalR + '\'' +
                ", ticketTypeList=" + ticketTypeList +
                ", deFlight=" + deFlight +
                ", arFlight=" + arFlight +
                '}';
    }
}
