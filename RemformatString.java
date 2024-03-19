/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Challenge Date :: 19-03-24
//  WARNING :: Name of the file is different , just change it what ever you want
import java.util.stream.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        char[] charr = sc.next().trim().toCharArray();
        for(char c : charr) {
            if(Character.isAlphabetic(c))
               sb1.append(c);
            else 
               sb2.append(c);
        }
        System.out.println(sb1.toString()+sb2.toString());
    }
}
/// input :  Arjun20King03
/// output : ArjunKing2003
