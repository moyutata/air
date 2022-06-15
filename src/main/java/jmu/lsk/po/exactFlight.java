package jmu.lsk.po;


import java.util.Date;

public class exactFlight {
    private String depart;
    private String arrival;
    private Date execDate;
    private int execId;
    private String shippingId;
    private String deTime;

    @Override
    public String toString() {
        return "exactFlight{" +
                "depart='" + depart + '\'' +
                ", arrival='" + arrival + '\'' +
                ", execDate=" + execDate +
                ", execId=" + execId +
                ", shippingId='" + shippingId + '\'' +
                ", deTime='" + deTime + '\'' +
                '}';
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

    public Date getExecDate() {
        return execDate;
    }

    public void setExecDate(Date execDate) {
        this.execDate = execDate;
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

    public String getDeTime() {
        return deTime;
    }

    public void setDeTime(String deTime) {
        this.deTime = deTime;
    }

}
