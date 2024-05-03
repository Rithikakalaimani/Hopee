import java.util.*;
import java.lang.Character;
public class Pattern4{
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  int[] m = new int[n];
  for (int i = 0; i < n; i++) {
    m[i] = in.nextInt();
  }
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      if (i == j || i + j == n - 1) {
        System.out.print(m[j]);
      } else {
        System.out.print(asterisk(m[j]));
      }
    }
    System.out.println(); 
  }      
  in.close();
 }
  private static String asterisk(int n) {
    String s = String.valueOf(n);
    StringBuilder result = new StringBuilder();   
    for (int i = 0; i < s.length(); i++) {
      if (Character.isDigit(s.charAt(i))) {
          result.append('*');
      }
    }
    return result.toString();
  }
}
