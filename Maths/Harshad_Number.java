import java.util.*;
public class Harshad_Number {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    // int org =n;
    int sum=0;
    while(n>0)
    {
      int rem = n%10;
      sum+=rem;
      n/=10;
    }
    if(n%sum==0)
    {
      System.out.println("is a harshad number");
    }
    else{
      System.out.println("not a harshad number");
    }
    in.close();
  }
  
}
