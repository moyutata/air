package jmu.lsk.po;

public class Province {
    private int provinceId;
    private String provinceName;

    @Override
    public String toString() {
        return "Province{" +
                "provinceId=" + provinceId +
                ", provinceName='" + provinceName + '\'' +
                '}';
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
