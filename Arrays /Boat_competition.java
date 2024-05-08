// N enthusiastic participants are eager to team up and participate. Each participant has a weight, represented by Wi. However, there is a catch - the competition only allows teams consisting of two participants. As an organizer, you want to ensure fairness by allowing only teams with the same total weight.
// For instance, if there are K teams, each comprising participants (a1, b1), (a2, b2), ..., (ak, bk), where ai is the weight of the first participant in the i-th team, and bi is the weight of the second participant in the i-th team, a key condition needs to be satisfied: a1 + b1 = a2 + b2 = ... = ak + bk = s, where s is the common total weight of each team.
// find an optimal value for s such that the maximum possible number of teams can be formed.
/*
 * Input : 6
 *         1 1 3 4 2 2
 * Output : 2
 * Explanation
 * There are two possible cases:
 * Case 1: The value of s = 3
 * Two teams can be formed (1, 2) and (1, 2).
 * Case 2: The value of s = 4
 * Two teams can be formed (1, 3) and (2, 2).
 * In any case, the maximum number of valid teams formed are 2.
 */
import java.util.*;
public class Boat_competition {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
      int[] weights = new int[N];   
      for (int i = 0; i < N; i++) {
          weights[i] = scanner.nextInt();
      }  
      int maxTeams = findMaxTeams(N, weights);
      System.out.println(maxTeams);   
      scanner.close();
  }
   public static int findMaxTeams(int N, int[] weights) {
    Arrays.sort(weights); 
    int maxTeams = 0;
    // Try every possible sum of weights to find the maximum number of valid teams
    for (int s = 2; s <= 2 * N; s++) {
      int left = 0;
      int right = N - 1;
      int teams = 0;
      while (left < right) {
        int sum = weights[left] + weights[right];
        if (sum == s) {
            teams++;
            left++;
            right--;
        } else if (sum < s) {
            left++;
        } else {
            right--;
        }
      }
      maxTeams = Math.max(maxTeams, teams);
    }
    return maxTeams;
  }
}
