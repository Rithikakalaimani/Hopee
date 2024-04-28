 import java.util.*;
import java.lang.Character;
public class Character_Of_Sum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    int sum=0;
    for(char ch:s.toCharArray())
    {
      if(Character.isLetter(ch))
      {
        System.out.print(ch);
      }
      else
      {
        sum+= (ch- '0');
      }
    }
     System.out.print(sum);
     in.close();
  } 
}
