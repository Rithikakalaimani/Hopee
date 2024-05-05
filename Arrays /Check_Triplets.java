// find triplets atleast one a^2+b^2= c^2
/*
* Input: 7
*        5 1 3 6 7 2 4
* Output:Yes
*/
import java.util.*;
public class Check_Triplets {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
        a[i] = in.nextInt();
    }   
    Set<Integer> s = new HashSet<>();
    for (int num : a) {
        s.add(num * num);
    }
    boolean found = false;
    for (int i = 0; i < n ; i++) {
      for (int j = i + 1; j < n; j++) {
        int var1 = a[i] * a[i];
        int var2 = a[j] * a[j];
        int var3 = var1 + var2;
        if (s.contains(var3)) {
          found = true;
          break;
        }
      }
    }
    System.out.println(found?"Yes":"No");
    in.close();
  }
}
