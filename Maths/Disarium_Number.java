import java.util.*;
public class Disarium_Number
{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int org = n;
    int sum =0;
    int len = Integer.toString(n).length();
    while(n>0)
    {
      int rem = n%10;
      sum+=Math.pow(rem,len);
      n/=10;
    }
    if(sum==org)
    {
      System.out.println("is a disarium number");
    }
    else{
      System.out.println("not a disarium number");
    }
    in.close();
  }
}