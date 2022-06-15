package jmu.lsk.po;

public class SeatChosen {
    private String seatId;
    private int execId;
    private String ticketId;
    private String seatStatus;

    @Override
    public String toString() {
        return "SeatChosen{" +
                "seatId='" + seatId + '\'' +
                ", execId=" + execId +
                ", ticketId='" + ticketId + '\'' +
                ", seatStatus='" + seatStatus + '\'' +
                '}';
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public int getExecId() {
        return execId;
    }

    public void setExecId(int execId) {
        this.execId = execId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(String seatStatus) {
        this.seatStatus = seatStatus;
    }
}
