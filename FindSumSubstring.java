/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Challenge Date :: 20-03-24
//  WARNING :: Name of the file is different , just change it what ever you want

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(),sum = 0;
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
         }
        boolean present = false;
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if(arr[i]+arr[j] == K)
                  present = true;
            }
        }
        System.out.println(present ? "yes" : "no");
    }
}

// input :: 5 10
//          1 2 5 4 5
//  output :: yes
//explanatin :: In the given array sum of "5" and "5" equals to Key-value "10"
// input :: 5 10
//          1 2 1 2 0 
// output :: no
//explanation :: In the given array there are no possible substrings to return the sum of key-value...
