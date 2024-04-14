
// remove the symbols and numbers and print only the letters in the string
/*
 * input : ssjdj13323#@%$#%$^%$sndkfnd
 * output : ssjdjsndkfnd
 */
import java.lang.Character;
import java.util.*;

public class remove_sym {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s1 = in.nextLine();
    String s2 = "";
    for (char ch : s1.toCharArray()) {
      if (Character.isLetter(ch)) {
        s2 = s2 + ch;
      }
    }
    System.out.println(s2 == "" ? "EMPTy" : s2);
    in.close();
  }

}
