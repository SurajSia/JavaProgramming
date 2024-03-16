/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Challenge Date :: 16-03-24
// WARNING :: Name of the file is different , just change it what ever you want
import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++) {
            list.add(sc.nextInt());
        }
       boolean isDescending = true;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                isDescending = false;
                break;
            }
        }
        if(!isDescending) {
            System.out.print("no");
        }
        else {
            System.out.print("yes");
        }
    }
}

// input :: 6 
//          10 20 50 30 60 22
// output :: no
// explnation :: given elements are not in descending order..
//intput :: 5 
//           50 45 34 23 20
// output :: yes
// explanation :: given elements are in descending order...
