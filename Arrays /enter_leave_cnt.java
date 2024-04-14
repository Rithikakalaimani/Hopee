
// find the maximum no of people who left the party
/*
 * input : 7 0 5 1 2 (enter)
 *         1 2 1 3 4 (leave)
 * output: 6 4 (8) 6 4 
 */
import java.util.*;

public class enter_leave_cnt {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] enter = new int[n];
    int[] leave = new int[n];
    for (int i = 0; i < n; i++) {
      enter[i] = in.nextInt();
      leave[i] = in.nextInt();
    }
    int maxi = 0;
    int diff = enter[0] - leave[0];
    for (int i = 1; i < n; i++) {
      diff = (enter[i] + diff) - leave[i];
      maxi = Math.max(diff, maxi);
    }
    System.out.println("maximum is : " + maxi);
    in.close();
  }
}