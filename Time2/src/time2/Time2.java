/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time2;

/**
 *
 * @author developer
 */
public class Time2 {

    /**
     * @param args the command line arguments
     */
    private int hour;
    private int minutes;
    private int seconds;

    public Time2() {
        this(0, 0, 0);
    }

    public Time2(int h) {
        this(h, 0, 0);
    }

    public Time2(int h, int m) {
        this(h, m, 0);
    }

    public Time2(int h, int m, int s) {
        setTime(h, m, s);
    }

    public Time2(Time2 time) {
        this(time.getHour(), time.getMinutes(), time.getSeconds());
    }

    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinutes(m);
        setSeconds(s);
    }

    public void setHour(int h) {
        if (h >= 0 && h < 23) {
            hour = h;
        } else {
            throw new IllegalArgumentException("hour must be 0-23");
        }
    }

    public void setMinutes(int m) {
        if (m >= 0 && m < 60) {
            minutes = m;
        } else {
            throw new IllegalArgumentException("minutes must be 0-59");
        }
    }

    public void setSeconds(int s) {
        if (s >= 0 && s < 60) {
            seconds = s;
        } else {
            throw new IllegalArgumentException("seconds must be 0-59");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinutes(), getSeconds());
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s", 
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinutes(), getSeconds(), (getHour() < 12 ? "AM" : "PM"));
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
