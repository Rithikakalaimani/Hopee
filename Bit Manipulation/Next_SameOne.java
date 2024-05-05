import java.util.*;
public class Next_SameOne {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n= in.nextInt();
    int cnt =Integer.bitCount(n);
    int next = n + 1;
    while (Integer.bitCount(next) != cnt) {
      next++;
    }
    System.out.println(next);
    in.close();
  }
}
