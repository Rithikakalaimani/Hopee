// given the seconds convert to days,hrs,min,sec
/*
 * input : 96408
 * output : 1D 02:46:48
 */
import java.util.*;
public class Time {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int d = s / 86400;
        s %= 86400;
        int h = s / 3600;
        s %= 3600;
        int m = s / 60;
        int sec = s % 60;
        System.out.printf("%dD %02d:%02d:%02d\n", d, h, m, sec);
        in.close();
    }
}
