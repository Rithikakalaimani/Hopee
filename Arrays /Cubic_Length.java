
//  length of the longest contiguous sequence of cubic numbers in an array
/*
*  input : 8
*         1 8 27 64 5 2 1 8
* output : 3 ( length of the cubic consecutive numbers)
 */
import java.util.*;

public class Cubic_Length {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
    }
    in.close();
    int len = 0, i = 0, j = 0;
    while (i < n) {
      if (isCubic(a[i])) {
        j++;
        len = Math.max(len, j);
        i++;
      } else {
        j = 0;
        i++;
      }
    }
    System.out.println("length is " + len);
  }

  public static boolean isCubic(int n) {
    int cb = (int) Math.cbrt(n);
    return (cb * cb * cb == n);
  }
}