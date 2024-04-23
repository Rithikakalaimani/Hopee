// print the pattern 
/*
 * Input: program
*         rock
*  Output:  p**gram
*           **g*amp
*           *g*amp*
*           g*amp**
*           *amp**g
*           amp**g*
*           mp**g*a
*/
import java.util.*;
public class Pattern3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    String t = in.nextLine();
    int n = s.length();
    for(int i=0;i<n;i++)
    {
      for(int j=i;j<n;j++)
      {
        if(t.contains(s.substring(j,j+1)))
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(s.charAt(j));
        }
      }
        for(int k=0;k<i;k++)
        {
          if(t.contains(s.substring(k,k+1)))
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(s.charAt(k));
          }
        }
      System.out.println();
    }
    in.close();
  } 
}
// String s1 = scanner.nextLine();
// String s2 = scanner.nextLine();
// int length = s1.length();
// StringBuilder modifiedS1 = new StringBuilder(s1);
// for (char c : s2.toCharArray()) {
//     for (int i = 0; i < length; i++) {
//         if (modifiedS1.charAt(i) == c) {
//             modifiedS1.setCharAt(i, '*');
//         }
//     }
// }
// for (int i = 0; i < length; i++) {
//     System.out.println(modifiedS1);
//     char firstChar = modifiedS1.charAt(0);
//     modifiedS1.deleteCharAt(0).append(firstChar);
// }
