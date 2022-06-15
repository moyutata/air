package jmu.lsk.po;

public class TicketTypes {
    private int execId;
    private String shippingId;
    private double salePrice;
    private double discount;
    private int remains;
    private  int totalWeight;
    private int luggageAmount;
    private String isMeal;
    private String refund;

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    private Shipping shipping;
    @Override
    public String toString() {
        return "TicketTypes{" +
                "execId=" + execId +
                ", shippingId='" + shippingId + '\'' +
                ", salePrice=" + salePrice +
                ", discount=" + discount +
                ", remains=" + remains +
                ", totalWeight=" + totalWeight +
                ", luggagerAmount=" + luggageAmount +
                ", isMeal='" + isMeal + '\'' +
                ", refund='" + refund + '\'' +
                '}';
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

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getRemains() {
        return remains;
    }

    public void setRemains(int remains) {
        this.remains = remains;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public int getLuggageAmount() {
        return luggageAmount;
    }

    public void setLuggageAmount(int luggageAmount) {
        this.luggageAmount = luggageAmount;
    }

    public String getIsMeal() {
        return isMeal;
    }

    public void setIsMeal(String isMeal) {
        this.isMeal = isMeal;
    }

    public String getRefund() {
        return refund;
    }

    public void setRefund(String refund) {
        this.refund = refund;
    }

}
