// minimum no of toggle to convert all alphabets to either lowercase or uppercase
/*
 * input : skill_RaCk#!
 * output : 2
 * input : PINK
 * output : 0
 * input : DSFGFDGFfDSAFDSAF 
 * output : 1
 */
import java.util.*;
import java.lang.Character;
public class Toggle_min {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    int cnt1=0,cnt2=0;
    for(int i=0;i<s.length();i++) 
    {
      if(Character.isUpperCase(s.charAt(i))) 
      {
        cnt1++;
      }
      if(Character.isLowerCase(s.charAt(i))) 
      {
        cnt2++;
      }
    }
    System.out.println(Math.min(cnt1,cnt2));
    in.close();
  }
  
}
