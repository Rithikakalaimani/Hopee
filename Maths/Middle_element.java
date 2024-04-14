
// find the middle element that is second largest as well as second smallest 
/* input :  120 , 58 , 64   
 * 
 * output : 64
 */
import java.util.*;

public class Middle_element {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    int small = Math.min(Math.min(a, b), c);
    int large = Math.max(Math.max(a, b), c);
    System.out.println(a + b + c - small - large);
    in.close();
  }

}