
// find the minimum price among the products
/*
 * input : 3
 *         (product) (price) (discount)
 *         laptop   30000   15%
 *          monitor  2000    5%
 *          harddisk  500    2%
 * output : harddisk
 */
import java.util.*;

public class MinimalPrice {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] s = new String[100];
    int[] price = new int[100];
    int[] percentage = new int[100];
    int mini = 0, saving = 0;
    String s1 = "";
    int n = in.nextInt();

    for (int i = 0; i < n; i++) {
      s[i] = in.next();
      price[i] = in.nextInt();
      percentage[i] = in.nextInt();
    }

    for (int i = 0; i < n; i++) {
      saving = (percentage[i] * price[i]) / 100;
      if (mini == 0) {
        mini = saving;
        s1 = s[i];
      } else if (saving < mini) {
        mini = saving;
        s1 = s[i];
      }
    }

    System.out.println(s1);
    in.close();
  }
}