// after distributing coins to right and left side from the maximum print the array
/*
* Input: 6
*        10 15 20 13 90 18
* Output: 11 16 21 14 85 19 
* Input: 5
*        10 20 45 30 25
* Output: 11 21 41 31 26
* Input: 10
*        1 2 3 4 6 1 2 3 4 1
*Output: 1 3 4 5 0 2 3 4 4 1 
*
*/
import java.util.*;
public class Distribute_Gold_Coins {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int[] plates = new int[N];
    for (int i = 0; i < N; i++) {
        plates[i] = in.nextInt();
    }
    int maxIndex = 0;
    for (int i = 1; i < N; i++) {
        if (plates[i] > plates[maxIndex]) {
            maxIndex = i;
        }
    } 
    int leftIndex = maxIndex - 1;
    int rightIndex = maxIndex + 1;    
    while (plates[maxIndex] > 0 && (leftIndex >= 0 || rightIndex < N)) {
      if (leftIndex >= 0) {
          plates[leftIndex]++;
          plates[maxIndex]--;
          leftIndex--;
      }
      if (plates[maxIndex] > 0 && rightIndex < N) {
          plates[rightIndex]++;
          plates[maxIndex]--;
          rightIndex++;
      }
    }
    for (int i = 0; i < N; i++) {
        System.out.print(plates[i] + " ");
    }
    in.close();
  }
}
