package jmu.lsk.po;

public class Orders {
    private int  orderId;
    private String loginId;
    private int userId;
    private double  totalPrice;
    private String paymentStatus;
    private String tel;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", loginId='" + loginId + '\'' +
                ", userId=" + userId +
                ", totalPrice=" + totalPrice +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", tel='" + tel + '\'' +
                ", user=" + user +
                '}';
    }
}
