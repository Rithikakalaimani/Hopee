
// prints 1 if it contains 0 or the consecutive integers whose sum is equal to 0. Else prints 0.
/* input : 5 
 *         5 -2 3 -1 7
 * output : 1
 * input : 6
 *         -3 2 3 -1 6 4
 * output : 0
 */
import java.util.*;

public class sum_zero {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
    }
    boolean t = false;
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = i; j < n; j++) {
        sum += a[j];
        if (sum == 0) {
          t = true;
          break;
        }
      }
    }
    System.out.println(t ? 1 : 0);
    in.close();
  }
}