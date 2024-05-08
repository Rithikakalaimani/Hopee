// given x and y print all the nos that have exactly k non zeros 
/*
 * Input: 100 200 2
 * Output : 101 102 103 104 105 106 107 108 109 110 120 130 140 150 160 170 180 190
 * Input: 500 510 3
 * Output: -1
 */
import java.util.*;
public class Exactly_KnonZeroDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int k = in.nextInt();
        boolean found = false;
        for (int i = x; i <= y; i++) {
            if (countNonZeroDigits(i) == k) {
                System.out.println(i);
                found = true;
            }
        }
        if (!found) {
            System.out.println(-1);
        }
        in.close();
    }
    public static int countNonZeroDigits(int n)
    {
        int count = 0;
        while (n > 0) {
            if (n % 10 != 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    } 
}
