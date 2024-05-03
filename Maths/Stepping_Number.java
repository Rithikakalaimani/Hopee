import java.util.Scanner;
public class Stepping_Number {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int cnt=0;
    for(int i=10;i<=n;i++)
    {
      if(isdigit(i))
      {
        cnt++;
        System.out.print(i+" ");
      }
    }
    if(cnt==0)
    {
      System.out.print(-1);
    }  
    in.close();
  }
    public static boolean isdigit(int n) {
    int prev = n % 10; 
    n /= 10; 
    while (n != 0) {
        int cur = n % 10; 
        if (Math.abs(prev - cur) != 1) {
            return false; 
        }
        prev = cur; 
        n /= 10; 
    }
    return true; 
  }
}