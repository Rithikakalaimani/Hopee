
// sum of consecutive pairs 
/* input : 6
 *        50, -50 , 100, 50,600,-200
 *
 * output: 0, 150, 400 
 */
import java.util.*;

public class sum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
    }
    for (int i = 0; i < n - 1; i++) {
      int sum = 0;
      sum = a[i] + a[i + 1];
      System.out.println(sum);
    }
    in.close();
  }
}