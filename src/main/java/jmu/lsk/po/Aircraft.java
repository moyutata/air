package jmu.lsk.po;

public class Aircraft {
    private int aircraftId;
    private String aircraftName;
    @Override
    public String toString() {
        return "Aircraft{" +
                "aircraftId=" + aircraftId +
                ", aircraftName='" + aircraftName + '\'' +
                '}';
    }

    public int getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(int aircraftId) {
        this.aircraftId = aircraftId;
    }

    public String getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }


}
