import java.util.*;
public class Shift_Array_Remove{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
        a[i] = in.nextInt();
    }
    int r = in.nextInt();
    int x = in.nextInt();

    in.close();
    while (a.length >= 2) {
        r = r % a.length; 
        reverse(a, 0, r - 1);
        reverse(a, r, a.length - 1);
        reverse(a, 0, a.length - 1);
        int len = Math.max(0, a.length - x);
        int[] arr = Arrays.copyOf(a, len);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        a = arr;
    }
 }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
