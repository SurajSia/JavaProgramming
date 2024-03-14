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
       String replacedString = sb.toString();
        System.out.println("+"+replacedString.replace(" ","+")+"+");
        System.out.println("|"+str.replace(" ","|")+"|");
    }
}

//// input :: john is a good boy
//// output should be print the following pattern
//// output :: +----+--+-+----+---+
////           |john|is|a|good|boy|
