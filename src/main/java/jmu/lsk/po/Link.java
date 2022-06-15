package jmu.lsk.po;

import java.util.Date;

public class Link {
    private String idNumber;
    private String loginId;
    private String userId;
    private Date linkTime;

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getLinkTime() {
        return linkTime;
    }

    public void setLinkTime(Date linkTime) {
        this.linkTime = linkTime;
    }
    @Override
    public String toString() {
        return "Link{" +
                "idNumber=" + idNumber +
                ", loginId='" + loginId + '\'' +
                ", userId=" + userId +
                ", linkTime=" + linkTime +
                '}';
    }


}
