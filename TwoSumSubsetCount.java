
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Challenge Date :: 28-03-24
//  WARNING :: Name of the file is different , just change it what ever you want
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*  The Program should accept should accept a integer N as input and should
    find the prime number existed with in the given range.And find the subset
    of sum of the variables...
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() , count = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=2;i<=N;i++) {
            if(isPrime(i)) {
                list.add(i);
            }
        }
        
        for(int i=0;i<list.size();i++) {
            for(int j=0;j<list.size();j++) {
                if( list.get(i)+list.get(j) == N ) {
                    count++ ;
                }
            }
        }
        
       if(count % 2 == 0) {
           System.out.println(count/2);
       }
       else {
           System.out.println((count/2)+1);
       }
        
    }
    public static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }
        else {
            for(int i=2;i<=Math.sqrt(num);i++) {
                if(num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

/*    Input :: 18
     Output :: 2
     Explantion :: There are 2-chances of subsets of numbers whose sum = N i.e., 18...
*/
