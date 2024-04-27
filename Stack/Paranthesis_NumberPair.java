package Stack;

import java.util.*;

public class Paranthesis_NumberPair {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();     
    Stack<Integer> st = new Stack<>();
    StringBuilder res = new StringBuilder();
    int no = 1;
    for (int i = 0; i < s.length(); i++) 
    {
      char ch = s.charAt(i);

      if (ch == '(') {
          st.push(no);
          res.append(no);
          no++;
      } else if (ch == ')') {
          res.append(st.pop());
      }
    }
    System.out.println(res.toString());
    in.close();
  }
}


