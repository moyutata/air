package jmu.lsk.po;

public class Shipping {
    private String shippingId;
    private String shippingGrade;

    @Override
    public String toString() {
        return "Shipping{" +
                "shippingId='" + shippingId + '\'' +
                ", shippingGrade='" + shippingGrade + '\'' +
                '}';
    }

    public String getShippingId() {
        return shippingId;
    }

    public void setShippingId(String shippingId) {
        this.shippingId = shippingId;
    }

    public String getShippingGrade() {
        return shippingGrade;
    }

    public void setShippingGrade(String shippingGrade) {
        this.shippingGrade = shippingGrade;
    }
}
