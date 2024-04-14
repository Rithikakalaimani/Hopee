import java.util.Scanner;

public class Pascal {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      int coefficient = 1;
      for (int k = 0; k < i + 1; k++) {
        System.out.print(coefficient + " ");
        coefficient = coefficient * (i - k) / (k + 1);
      }
      System.out.println();
    }
    in.close();
  }
}
