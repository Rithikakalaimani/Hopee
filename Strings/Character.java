import java.util.*;

public class Character {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    char[] ch = new char[n];
    int[] c = new int[26];
    for (int i = 0; i < n; i++) {
      ch[i] = in.next().charAt(0);
    }
    for (int i = 0; i < n; i++) {
      c[ch[i] - 'a']++;
    }
    for (int i = 0; i < 26; i++) {
      if (c[i] == 1) {
        System.out.print((char) ('a' + i));
      }
    }
    in.close();
  }
}