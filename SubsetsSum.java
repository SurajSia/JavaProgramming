/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Challenge Date :: 24-03-24
//  WARNING :: Name of the file is different , just change it what ever you want
/**
 * The program must accept three integers X, Y, and N as the input.
 * The program must print the count of integers from X to Y which are having the integer N as a subset.
 * Boundary Condition(s): 10 <= X < Y <= 10^8, 1 <= N < Y
 * Input Format: The first line contains X, Y, and N separated by a space.
 * Output Format: The first line contains the count of integers from X to Y which are having the integer N as a subset. **/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int N = sc.nextInt();
        int count = 0;
        String compStr = Integer.toString(N);
        for(int i=X;i<=Y;i++) {
            String str = Integer.toString(i);
            if(str.contains(compStr)) {
                count++;
        }
    }
    System.out.println(count);
    }
}

/* Example Input/Output 1:
 * Input: 20 530 11
 * Output: 14
 * Explanation: Here X = 20, Y = 530, and N = 11. The integers which are having the integer 11 as a subset are
 * 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 211, 311, 411, and 511. So the count of those integers is
 * 14 and it is printed as the output.
 * Example Input/Output 2:
 * Input: 31 79 1
 * Output: 5
 */
