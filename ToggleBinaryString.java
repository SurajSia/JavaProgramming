/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Test Date :: 14-03-24
//  WARNING :: Name of the file is different , just change it what ever you want

/*The program must accept an integer N as the input. The program must print the maximum possible integer which is formed by toggling exactly one bit in the binary representation of N as the output. If all the bits in the binary representation of N are 1, the program must print the value of N.
Boundary Condition(s):
2 <= N < 2^31
Input Format:
The first line contains N.
Output Format:
The first line contains an integer based on the given conditions.
Example Input/Output 1:
Input: 22
Output: 30
Explanation:
The binary representation of 22 is 10110.
If the first bit is toggled, the binary representation becomes 00110 and its decimal equivalent is 6. If the second bit is toggled, the binary representation becomes 11110 and its decimal equivalent is 30. If the third bit is toggled, the binary representation becomes 10010 and its decimal equivalent is 18. If the fourth bit is toggled, the binary representation becomes 10100 and its decimal equivalent is 20.
If the fifth bit is toggled, the binary representation becomes 10111 and its decimal equivalent is 23. Here the maximum integer value is 30. So it is printed as the output. 
Example Input/Output 2:
Input: 15
Output: 15

*/
import java.util.*;

public class ToggleBinaryString {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        
        int N = new Scanner(System.in).nextInt();
        String str = Integer.toBinaryString(N); //22 30
        for(int i=0;i<str.length();i++) {
            String nStr = toggleBit(str,i);
            strList.add(nStr);
        }
        strList.add(str);
        for(String s : strList) {
            intList.add(Integer.parseInt(s,2));
        }
        System.out.println(Collections.max(intList));
    }
    public static String toggleBit(String str , int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if(str.charAt(i) == '0') {
            sb.setCharAt(i,'1');
        }
        else {
            sb.setCharAt(i,'0');
        }
        return sb.toString();
    } 
}
