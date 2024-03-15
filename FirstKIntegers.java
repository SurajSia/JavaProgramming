/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Test Date :: 15-03-24
// WARNING :: Name of the file is different , just change it what ever you want
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        boolean isSorted = true;
        Arrays.sort(nums, 0, K);
        for (int i = 1; i < N; i++) {
            if (nums[i] < nums[i - 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted ? "YES" : "NO");
    }
}
//input : 5
//        3 2 1 4 5
//        3
//output : YES
//explantion : Given array is completely sorted , after sorted from 0 to k indices . so output is YES
//input : 5 
//        3 2 1 5 4 
//        3
//output : NO
////explantion : Given array is not completely sorted , after sorted from 0 to k indices . so output is YES
//explantion : Given number contains 1,0,2,4 with size 4.so output is no.
