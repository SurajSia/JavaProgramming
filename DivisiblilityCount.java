////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Test Date :: 28-03-24
//  WARNING :: Name of the file is different , just change it what ever you want
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
The program must accept two integers M and N as the input. The program must form two lists of integers from 1 to M and 1 to N respectively. Then the program must print the count of pairs of integers C among the two lists based on the following conditions.
-The sum of integers in each pair must be divisible by 5.
- An integer in a given list cannot be used more than once to form a pair.
Boundary Condition(s):
3 <= M, N <= 1000
Input Format:
The first line contains M and N separated by a space.
Output Format:
The first line contains C.
Example Input/Output 1:
Input:
75
Output: 5
Explanation:
The integers from 1 to 7 are 1, 2, 3, 4, 5, 6 and 7.
The integers from 1 to 5 are 1, 2, 3, 4 are 5.
The 5 possible pairs are given below. (7 and 3 in not considered as already 3 in the second list has been used with
2).
14
43215
23
32
41
212345
55
Example Input/Output 2:
Input:
16 18
Output:
15

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        int count = 0;
        boolean[] usedN = new boolean[N+1];
        boolean[] usedM = new boolean[M+1];
        for(int i=1;i<=N;i++) {
            for(int j=1;j<=M;j++) {
                if( (i+j)%5==0 && !usedN[i] && !usedM[j] ) {
                    count++;
                    usedN[i]=true;
                    usedM[j]=true;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
