package season3;

import java.sql.Time;

public class StopWatch {
    private long startTime, endTime;
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {

        return startTime;
    }

    public long getEndTime() {

        return endTime;
    }

    public void start(long time){
        this.startTime = time;
    }
    public void stop(long time){
        this.endTime = time;
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
