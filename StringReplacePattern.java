/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Test Date :: 14-03-24
//  
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                sb.append("-");
            } else {
                sb.append(ch);
            }
        }
        String replaced = sb.toString();
        System.out.println("+"+replaced.replace(" ","+")+"+");
       //System.out.println(sb.toString());
        String nstr2 = str.replace(" ","|");
        System.out.println("|"+nstr2+"|");
    }
}

//// input :: john is a good boy
//// output should be print the following pattern
//// output :: +----+--+-+----+---+
////           |john|is|a|good|boy|
