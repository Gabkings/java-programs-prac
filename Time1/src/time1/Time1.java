/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time1;

/**
 *
 * @author developer
 */
public class Time1 {

    /**
     * @param args the command line arguments
     */
    private int hour;
    private int minutes;
    private int seconds;

    public void setTime(int h, int m, int s) {
        if (h >= 0 && h < 24 && m >= 0 && m <= 60 && s >= 0 && s <= 60) {
            hour = h;
            minutes = m;
            seconds = s;
        } else {
            throw new IllegalArgumentException("hour, minute and/or second was out of range");
        }
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minutes, seconds);
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minutes, seconds, (hour < 12 ? "AM" : "PM"));
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Time1 time = new Time1();
        // output string representations of the time
        System.out.print("The initial universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("The initial standard time is: ");
        System.out.println(time.toString());
        System.out.println(); // output a blank line
    }

}
