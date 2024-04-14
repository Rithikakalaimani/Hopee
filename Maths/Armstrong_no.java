import java.util.*;

public class Armstrong_no {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a = n;
    int rem = 0, rev = 0;
    int d = (int) Math.floor(Math.log10(n)) + 1;
    while (n > 0) {
      rem = n % 10;
      rev = rev + (int) Math.pow(rem, d);
      n /= 10;
    }
    if (a == rev) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
    in.close();
  }

}
