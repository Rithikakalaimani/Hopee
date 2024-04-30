// print the for the given date in format ... eg : 28-7-2024  O/p = July
import java.util.*;
public class Print_Month
{
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    String[] s1 = s.split("-");
    int month = Integer.parseInt(s1[1]);
    switch(month)
    {
      case 1: System.out.println("January"); break;
      case 2: System.out.println("February"); break;
      case 3: System.out.println("March"); break;
      case 4: System.out.println("April"); break;
      case 5: System.out.println("May"); break;
      case 6: System.out.println("June"); break;
      case 7: System.out.println("July"); break;
      case 8: System.out.println("August"); break;
      case 9: System.out.println("September"); break;
      case 10: System.out.println("October"); break;
      case 11: System.out.println("November"); break;
      case 12: System.out.println("December"); break;
    }
    in.close();
  } 
}