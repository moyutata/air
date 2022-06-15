package jmu.lsk.po;

public class Terminal {
    private int terminalId;
    private int airportId;
    private String terminalName;
    private Airport airport;

    @Override
    public String toString() {
        return "Terminal{" +
                "terminalId=" + terminalId +
                ", airportId=" + airportId +
                ", terminalName='" + terminalName + '\'' +
                ", airport=" + airport +
                '}';
    }

    public int getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(int terminalId) {
        this.terminalId = terminalId;
    }

    public int getAirportId() {
        return airportId;
    }

    public void setAirportId(int airportId) {
        this.airportId = airportId;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }


    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }
}
