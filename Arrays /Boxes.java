import java.util.Scanner;
public class Boxes {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt(); 
    int[] boxes = new int[N];
    for (int i = 0; i < N; i++) {
        boxes[i] = in.nextInt();
    }
    int K = in.nextInt(); 
    for (int i = 0; i < N; i++) {
        if (boxes[i] % 2 != 0 && boxes[i]>K) 
        { 
            int r = Math.min(boxes[i], K); 
            boxes[i] -= r;
            int leftBox = (i - 1 + N) % N;
            int rightBox = (i + 1) % N;
            boxes[leftBox] += (r / 2)+(r%2);
            boxes[rightBox] += (r/ 2);
        }
    }
    
    for (int i = 0; i < N; i++) {
        System.out.print(boxes[i] + " ");
    }
    in.close();
  }
  
}
