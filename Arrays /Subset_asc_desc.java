import java.util.*;

public class Subset_asc_desc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int[] arr = new int[N];      
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }      
        boolean found = false;       
        for (int i = 0; i <= N - K; i++) {
            boolean ascending = true;
            boolean descending = true;
            for (int j = i + 1; j < i + K; j++) 
            {
                if (arr[j] < arr[j - 1]) {
                    ascending = false;
                }
                if (arr[j] > arr[j - 1]) {
                    descending = false;
                }
            }
            if (ascending || descending) {
                found = true;
                break;
            }
        }        
       System.out.println(found ? "Yes" : "No");  
       in.close();
    }
}
