package jmu.lsk.po;

public class Passenger {
    private String passName;
    private String idNumber;
    private String passTel;
    private String passSex;

    @Override
    public String toString() {
        return "Passenger{" +
                "passName='" + passName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", passTel='" + passTel + '\'' +
                ", passSex='" + passSex + '\'' +
                '}';
    }

    public String getPassName() {
        return passName;
    }

    public void setPassName(String passName) {
        this.passName = passName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPassTel() {
        return passTel;
    }

    public void setPassTel(String passTel) {
        this.passTel = passTel;
    }

    public String getPassSex() {
        return passSex;
    }

    public void setPassSex(String passSex) {
        this.passSex = passSex;
    }
}
