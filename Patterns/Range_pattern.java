
// print the pattern of numbers according to the columns
/* input : 15 2 3
 * 
 * output : 2  3  4 
 *          5  6  7 
 *          8  9  10
 *          11 12 13
 *          14 15 
 */
import java.util.*;

public class Range_pattern {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    int y = in.nextInt();
    int c = in.nextInt();
    int n = Math.min(x, y);
    for (int i = n; i <= Math.max(x, y); i++) {
      System.out.print(i + " ");
      if ((i - n + 1) % c == 0) {
        System.out.println();
      }
    }
    in.close();
  }

}