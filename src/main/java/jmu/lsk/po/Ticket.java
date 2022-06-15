package jmu.lsk.po;

public class Ticket {
    private String ticketId;
    private int orderId;
    private String idNumber;
    private int execId;
    private String shippingId;
    private String seatId;
    private double cost;
    private double insurance;
    private double  totalcost;
    private String remarks;
    private String isCheckIn;
    private String boardingNumber;

    public String getIsCheckIn() {
        return isCheckIn;
    }

    public void setIsCheckIn(String isCheckIn) {
        this.isCheckIn = isCheckIn;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    private Shipping shipping;
    private Passenger passenger;

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", orderId=" + orderId +
                ", idNumber='" + idNumber + '\'' +
                ", execId=" + execId +
                ", shippingId='" + shippingId + '\'' +
                ", seatId='" + seatId + '\'' +
                ", cost=" + cost +
                ", insurance=" + insurance +
                ", totalcost=" + totalcost +
                ", remarks='" + remarks + '\'' +
                ", isCheckIn='" + isCheckIn + '\'' +
                ", boardingNumber='" + boardingNumber + '\'' +
                ", shipping=" + shipping +
                ", passenger=" + passenger +
                '}';
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getExecId() {
        return execId;
    }

    public void setExecId(int execId) {
        this.execId = execId;
    }

    public String getShippingId() {
        return shippingId;
    }

    public void setShippingId(String shippingId) {
        this.shippingId = shippingId;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getInsurance() {
        return insurance;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    public double getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(double totalcost) {
        this.totalcost = totalcost;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getOsCheckIn() {
        return isCheckIn;
    }

    public void setOsCheckIn(String osCheckIn) {
        this.isCheckIn = osCheckIn;
    }

    public String getBoardingNumber() {
        return boardingNumber;
    }

    public void setBoardingNumber(String boardingNumber) {
        this.boardingNumber = boardingNumber;
    }
}
