package jmu.lsk.po;

public class Count {
    private int execId;
    private int ticks;

    public int getExecId() {
        return execId;
    }

    public void setExecId(int execId) {
        this.execId = execId;
    }

    @Override
    public String toString() {
        return "Count{" +
                "execId=" + execId +
                ", ticks=" + ticks +
                '}';
    }

    public int getTicks() {
        return ticks;
    }

    public void setTicks(int ticks) {
        this.ticks = ticks;
    }
}
