package src.T_2018_08_01;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class Clock {
    private int minutes, hours;

    public Clock(int h, int m) {
        setHours(h);
        setMinutes(m);
    }

    public Clock(Clock other) {
        this.hours = other.hours;
        this.minutes = other.minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public boolean setMinutes(int m) {
        if (m < 0 || m >= 60) {
            minutes = 0;
            return false;
        } else
            minutes = m;
        return true;
    }

    public int getHours() {
        return hours;
    }

    public boolean setHours(int h) {
        if (h < 0 || h >= 24) {
            hours = 0;
            return false;
        } else
            hours = h;
        return true;
    }

    public String toString() { String output = ""; if (hours < 10) output = "0";
    output = output + hours + ":";
    if (minutes < 10) output = output + "0";
    output = output + minutes; return output;
    }
}