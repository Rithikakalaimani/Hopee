
// each occurence of 5 and 6 in x and y replaced with 6 and 5 respectively and possible max sum and min sum is printed.
/*
 * input : 645  656
 * output : 1100 (545+555)
 *          1312 (646+666)
 */
import java.util.*;

public class MinSum_MaxSum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Input: ");
    int x = in.nextInt();
    int y = in.nextInt();
    int minX = modifyNumber(x, 6, 5);
    int minY = modifyNumber(y, 6, 5);
    int maxX = modifyNumber(x, 5, 6);
    int maxY = modifyNumber(y, 5, 6);
    System.out.println("Output: " + (minX + minY) + " " + (maxX + maxY));
    in.close();
  }

  private static int modifyNumber(int num, int find, int replace) {
    int result = 0;
    int multiplier = 1;
    while (num > 0) {
      int digit = num % 10;
      if (digit == find) {
        result += replace * multiplier;
      } else {
        result += digit * multiplier;
      }
      multiplier *= 10;
      num /= 10;
    }
    return result;
  }
}