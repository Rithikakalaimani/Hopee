
// sum of the first X integers and  sum of the last X integers 
/*
 * input : 5
*          10 20 30 50 40
*          2
* output : 30 90
 */
import java.util.*;

public class sum_of_x_nos {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
    }
    int x = in.nextInt();
    int sumFirstx = 0;
    int sumLastx = 0;
    for (int i = 0; i < x; i++) {
      sumFirstx += a[i];
    }
    for (int i = n - x; i < n; i++) {
      sumLastx += a[i];
    }
    System.out.println(sumFirstx + " " + sumLastx);
    in.close();
  }

}