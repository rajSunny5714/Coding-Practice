import java.util.* ;
import java.io.*; 
public class Solution {
public static double absoluteDiff(double a, double b) {
    if(a > b) {
            return a - b;
        }
        else {
            return b - a;
        }
    }
    public static int findAngle(int hour, int minute) {
        if (hour == 12) {
            hour = 0;
        }
        double hourAngle = 0.5 * (hour * 60 + minute);
        double minuteAngle = 6 * (minute);
        double angle = absoluteDiff(hourAngle, minuteAngle);
        angle = Math.min(angle, 360 - angle);
        return (int)angle;
    }
}