/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Test Date :: 14-03-24
//  WARNING :: Name of the file is different , just change it what ever you want
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int N = sc.nextInt();
        for(int i=0;i<N;i++) {
            int num = sc.nextInt();
            if( num == i ) {
                set.add(num);
            }
        }
        if(!set.isEmpty()) {
            for(int ele : set) 
               System.out.print(ele+" ");
        }
        else {
            System.out.println(-1);
        }
    }
}

//// input :: 4
////          11 1 2 3
//// output 
//// output :: 1 2 3
///  explanation :: 1,2,3 are equal to their respective indices.
/// input :: 5
///          11 13 14 15 16
/// output :: -1
/// explanation :: No element is matching with their respective indices.
