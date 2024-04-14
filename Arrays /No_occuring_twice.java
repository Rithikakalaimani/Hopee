
// remove the integers so that each integer does not occur more than twice 
/*
 * input : 8
 *         10,65,10,65,10,65,42,68
 * output : 10,65,10,65,42,68
 */
import java.util.*;

public class No_occuring_twice {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
    }
    for (int i = 0; i < n; i++) {
      int cnt = map.getOrDefault(a[i], 0);
      map.put(a[i], cnt + 1);
      if (map.get(a[i]) <= 2) {
        System.out.print(a[i] + " ");
      }
    }
    in.close();
  }

}
