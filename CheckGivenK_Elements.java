

/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Test Date :: 26-03-24
//  WARNING :: Name of the file is different , just change it what ever you want

/**
 * The program accepts an integer N and a digit D as input. It then checks if N contains all the digits from 0 to D.
 * If N contains all the digits from 0 to D, it prints "yes"; otherwise, it prints "no".
 * 
 * Constraints:
 * 10 <= N <= 10^17
 * 1 <= D <= 9
 * 
 * Input Format:
 * The first line contains N and D separated by a space.
 * 
 * Output Format:
 * The first line contains "yes" or "no". **/
 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        int i = 0;
        int[] arr1 = new int[str.length()];
        for(char c : str.toCharArray()) {
            arr1[i] = c - '0';
            i++;
        }
        Arrays.sort(arr1);
        
        int k = sc.nextInt();
        int[] arr2 = new int[k+1];
        arr2[0] = 0;
        for(int j=1;j<=k;j++) {
            arr2[j] = j;
        }
        boolean state = true;
        for(int j=0;j<k;j++) {
            if(arr2[j] != arr1[j]) {
                state = false;
            }
        }
        System.out.println(state ? "yes":"no");  
    }
}

/* Example Input/Output 1:
 * Input:
 * 102435 4
 * Output:
 * yes
 * Explanation:
 * N = 102435, D = 4. N contains all the digits from 0 to 4. So, "yes" is printed as the output.
 * 
 * Example Input/Output 2:
 * Input:
 * 123456 4
 * Output:
 * no
 */
