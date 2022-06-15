package jmu.lsk.po;

public class Admin {
    private  int adminId;
    private String loginId;
    private String password;
    private String tel;
    private String email;
    private String authority;

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", loginId='" + loginId + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", authority='" + authority + '\'' +
                '}';
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
