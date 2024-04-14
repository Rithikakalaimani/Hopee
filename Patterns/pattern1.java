
/*
 * input : 5
 * output : 1+2+3+4+5=45
 *          1*2*3*4=24
 *          1+2+3=6
 *          1*2=2
 *          1=1
 */
import java.util.*;

public class pattern1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      int sum = 0;
      long mul = 1;
      String s = "";
      for (int j = 0; j < n - i; j++) {
        if (i % 2 == 0) {
          sum += (j + 1);
          s += j + 1;
          if (j == (n - i - 1)) {
            s += "=";
            s += sum;
          } else {
            s += "+";
          }

        } else {
          mul *= (j + 1);
          s += j + 1;
          if (j == (n - i - 1)) {
            s += "=";
            s += mul;
          } else {
            s += "*";
          }
        }
      }
      System.out.println(s);
    }
    in.close();
  }
}