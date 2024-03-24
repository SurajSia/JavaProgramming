/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Challenge Date :: 24-03-24
/**
 * The program must accept an integer N as the input. The program must find the sum of digits S
 * and the product of digits P in N. Then the program must print yes if the sum of S and P is equal
 * to N. Else, the program must print no as the output.
 * Boundary Condition(s): 10 <= N <= 100
 * Input Format: The first line contains N.
 * Output Format: The first line contains yes or no.  **/

import java.util.*;
public class Main {
    public static List<Integer> toDigitList(int n) {  /// this function returns the list of digits...
        List<Integer> list = new ArrayList<>(); /// it is an array....
        while( n > 0 ) {
            list.add(n%10);
            n /= 10;
        }
        return list;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
      List<Integer> list = toDigitList(N); /// this is also an array...
      int sum = 0 , product = 1;
      for(int digit : list) {
          sum += digit;
          product *= digit;
      }
      System.out.println(N == (sum+product) ? "yes" : "no");
    }
}

/* Example Input/Output 1:
 * Input: 59
 * Output: yes
 * Explanation: Here N = 59. The sum of digits in 59 is 14 (5+9 = 14). The product of digits in
 * 59 is 45 (5*9 = 45). The sum of 14 and 45 is 59 (14+45 = 59) which is equal to the given
 * integer 59. So yes is printed as the output.
 * Example Input/Output 2:
 * Input: 63
 * Output: no
 */
