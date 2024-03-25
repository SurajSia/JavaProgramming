/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Challenge Date :: 25-03-24
//  WARNING :: Name of the file is different , just change it what ever you want

import java.util.function.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        Function<String,String> func = s -> s.replaceAll(" ","");
        String nstr = func.apply(str);
        for(char c : nstr.toCharArray()) {
            if(Character.isDigit(c)) {
                sum = sum + c - '0';
            }
        }
        System.out.println(sum);
    }
}

// input :: TN-123 DE9-EF
// output :: 23 
// explanation :: adding all numeric values in the given string 1 + 2 + 3 + 8 + 9 = 23.
// 
// input :: A3F-0UF B3F-ab3
// output :: 9 
// explanation :: adding all numeric values in the given string 3 + 0 + 3 + 3 = 9.
