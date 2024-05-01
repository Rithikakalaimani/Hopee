public class Odd_Number_Print {
  public static void main(String[] args) {
    int n = 3500;
    int org= n;
    int rev = 0;
    int d = (int) Math.floor(Math.log10(n)) + 1;
    int mul = (int) Math.pow(10, d - 1);
    while (n != 0) {
        int rem = n / mul;
        if (rem % 2 != 0) {
            rev = rev * 10 + rem; 
        }
        n = n % mul; 
        mul /= 10;  
    }
    if(org%10==0)
    {
      rev = rev*10;
    }
    System.out.println(rev); 
  }
}

