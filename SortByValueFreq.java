/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Test Date :: 16-03-24
// WARNING :: Name of the file is different , just change it what ever you want
import java.util.*;
import java.util.stream.*;
class Main {
    
    public static void sortInOrder(String[] strarr) {
        Map<String,Integer> map = new TreeMap<String,Integer>();
        for(String num : strarr) {
            if(map.containsKey(num)) {
                map.put(num,map.get(num)+1);
            }
            else {
                map.put(num,1);
            }
          
        }
       Map<String, Integer> sortedMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o1).compareTo(map.get(o2));
            }
        });
        sortedMap.putAll(map);
        Set<String> set = sortedMap.keySet();
        for(String s : set) {
            for(int i=0;i<sortedMap.get(s);i++) {
                System.out.print(s+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      String[] strarr = new String[N];
      for(int i=0;i<N;i++) {
          strarr[i] = sc.next();
      }
        sortInOrder(strarr);
    }
}
// input :: 6 
//          10 20 10 20 10 30
// output :: 30 20 20 10 10 10
// explnation :: 30->1 , 20->2 , 10->3 so by the ascending order of the occurances...
