////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Test Date :: 28-03-24
//  WARNING :: Name of the file is different , just change it what ever you want
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
The program must accept two integers N and K as the input. The program must print the longest prefix in N which
is divisible by K. If there is no such prefix, the program must print -1 as the output.
Boundary Condition(s):
10 <= N <= 10^8
1 <=K<= N
Input Format:
The first line contains N and K separated by a space.
Output Format:
The first line contains the longest prefix in N which is divisible by K or -1.
Example Input/Output 1:
Input:
107812 154
Output: 1078
Explanation:
The longest prefix in 107812 which is divisible by 154 is 1078.
So 1078 is printed as the output.
Example Input/Output 2:
Input:
1573 4
Output:
-1 
*/ 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine().trim();
        String[] strArray = str.split("\\s+");
        List<Integer> numArray = findDivisibleNumbers(strArray[0],strArray[1]);
        if(!numArray.isEmpty()) {
        System.out.println("Divisible Elements List :: "+Collections.max(numArray)); }
        else {
            System.out.println("-1");
        }
    }
    public static List<Integer> findDivisibleNumbers(String element , String key) {
        int divider = Integer.parseInt(key);
        List<Integer> numArray = new ArrayList<>();
        for(int i=1;i<=element.length();i++) {
           int prefix = Integer.parseInt(element.substring(0,i));
           if(prefix % divider ==0) {
               numArray.add(prefix);
           }
        }
        return numArray;
    }
    
}
