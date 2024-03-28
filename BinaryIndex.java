
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Test Date :: 28-03-24
//  WARNING :: Name of the file is different , just change it what ever you want
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*  The Program should accept a decimal number N and M and add them 
    as input and print index of the second '1' in the binary 
    representation of N.....
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        String bin = Integer.toBinaryString(M + N);
        List<Character> list = new ArrayList<>();
        for(char c : bin.toCharArray()) {
            list.add(c);
        }
        System.out.println("Binary-Value : "+bin);
        System.out.println(getIndex(list));
      }
    public static int getIndex(List<Character> list) {
        for(int i=0;i<list.size();i++) {
            if(i>0 && list.get(i) == '1') {
                return i+1;
            }
        }
        return 0;
    }
        }
    


/*    Input :: 12
               12
               
     Output :: 11000
     
     Explantion :: By Adding 12 + 12 we will get 24 as sum , after converting the 
                   24 to its binary string we have to print the index position
                   of the last '1'.
*/
