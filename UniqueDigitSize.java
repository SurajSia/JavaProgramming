/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Challenge Date :: 14-03-24
// WARNING :: Name of the file is different , just change it what ever you want
import java.util.*;
public class Main
{
    public static Set<Integer> toDigits(int N) {
        Set<Integer> set = new HashSet<>();
        while(N > 0) {
            set.add(N % 10);
            N /= 10;
        }
        return set;
    }
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	  /// Set<String> set = new HashSet<>();a
	   int N = sc.nextInt();
	   Set<Integer> set = toDigits(N);
	   if( set.size() > 3 ) {
	       System.out.println("no");
	   }
	   else{
	       System.out.println("yes");
	   }
	  	}
}

//input : 1224455
//output : yes 
//explantion : Given number only contains 1,2,5 with size 3.so output is yes.
//input : 1024
//output : no
//explantion : Given number contains 1,0,2,4 with size 4.so output is no.
