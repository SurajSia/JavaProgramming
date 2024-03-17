/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Challenge Date :: 17-03-24
//  WARNING :: Name of the file is different , just change it what ever you want
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        boolean found = false;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0 && arr[i] % 2 == 0 || i % 2 != 0 && arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                found = true;
        } }
        if (!found) {
            System.out.println("-1");
        }
    }
}
/**
 * Input Format:
 * The first line contains N.
 * The second line contains N integers separated by a space.
 * Output Format:
 * The first line contains the integers or -1 as per the given condition.
 * Example Input/Output 1:
 * Input:
 * 5
 * 80 82 26 -27 25
 * Output:
 * 80 26 -27
 * Explanation:
 * The integer 80 is even which is present in the odd position. So 80 is printed.
 * The integer 82 is even which is present in the even position. So 82 is NOT printed.
 * The integer 26 is even which is present in the odd position. So 26 is printed.
 * The integer -27 is odd which is present in the even position. So -27 is printed.
 * The integer 25 is odd which is present in the odd position. So 25 is NOT printed.
 * Example Input/Output 2:
 * Input:
 * 4
 * 1238
 * Output: -1
 */
