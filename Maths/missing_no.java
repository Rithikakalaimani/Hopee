
// smallest missing number
// eg : 1,3,5(missing no=2)as 1+3=4,1+5=6,3+5=8,5+3+1=9 ...7 is also missing but 2 is the smallest
// eg : 1,2,3,5(missing no=12)as 4,6,7,8,9,10,11 are present.
import java.util.*;

public class missing_no {
  public static void main(String[] rubini) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int v = 1;
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
    }
    for (int i = 0; i < n; i++) {
      if (v < a[i]) {
        break;
      }
      v += a[i];
    }
    System.out.println(v);
    in.close();
  }

}
