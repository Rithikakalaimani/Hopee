import java.util.*;
public class Equilateral_Triangle{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double s = in.nextDouble();
    double a = (Math.sqrt(3)/4)*s*s;
    System.out.printf("%.2f",a);
    in.close();
  }
}