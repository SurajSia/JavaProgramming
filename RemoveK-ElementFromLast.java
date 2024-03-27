

/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Test Date :: 26-03-24
//  WARNING :: Name of the file is different , just change it what ever you want.

/*  The Program will accept N integers and will remove the Given Key-Value K from
    the list by removing the last occured K value in the given list.
   
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++) {
            list.add(sc.nextInt());
        }
        Collections.reverse(list);
        int K = sc.nextInt();
        for(int i=0;i<list.size();i++) {
            if(list.get(i) == K) {
                list.remove(i);
                break;
            }
        }
        Collections.reverse(list);
        for(int n : list) {
            System.out.print(n+" ");
        }
    }
}

/*    Input :: 5
               50 23 40 23 55
               23
               
      Output :: 50 23 40 55
      
      Explantion :: Given Key-Value 'K' in the third-line is located in 4th-place and removed..
      
      Input :: 4
               22 44 56 78
               24
    
      Output :: 22 44 56 78
      
      Explanation :: Given Key-Value 'K' in the third-line is not located in list.so, the list is printed..
  
*/
