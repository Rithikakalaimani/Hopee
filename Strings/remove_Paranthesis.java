import java.util.*;

public class remove_Paranthesis {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    int cnt = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ')') {
        cnt--;
      }
      if (cnt != 0) {
        System.out.print(s.charAt(i));
      }
      if (s.charAt(i) == '(') {
        cnt++;
      }
    }
    in.close();
  }
}
