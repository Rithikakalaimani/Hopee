
// given an String should print the character in the form of matrix
/*
 * input : 3a 5b 2c 6d 
 *          4  4 (row and column)
 * output : aaab
 *          bbbb
 *          ccdd
 *          dddd
 */
import java.util.*;
import java.lang.Character;

public class Char_cnt_pattern {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    int r = in.nextInt();
    int c = in.nextInt();
    String[] s1 = s.split(" ");
    StringBuilder s2 = new StringBuilder();

    for (int i = 0; i < s1.length; i++) {
      int no = 0;
      for (char ch : s1[i].toCharArray()) {
        if (Character.isDigit(ch)) {
          no = no * 10 + Character.getNumericValue(ch);
        }
        if (Character.isLetter(ch)) {
          for (int j = 0; j < no; j++) {
            s2.append(ch);
          }
        }
      }
    }
    String s3 = s2.toString();
    int ind = 0;
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(s3.charAt(ind++));
      }
      System.out.println();
    }
    in.close();
  }
}
