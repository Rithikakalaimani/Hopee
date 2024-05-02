import java.util.*;
public class Non_Repeating_Characters {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    int[] frequency = new int[256]; 
    for (char c : s.toCharArray()) {
        frequency[c]++;
    }
  for (char c : s.toCharArray()) {
      if (frequency[c] == 1) {
          System.out.print(c);
          frequency[c] = 0; 
      }
    }
    in.close();
  }
}
