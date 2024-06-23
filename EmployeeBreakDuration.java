/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Challenge Date :: 16-03-24
// WARNING :: Name of the file is different , just change it what ever you want
/*
The program must accept the N entry time and exit time records of an employee during a day as the input. N records are given in chronological order. The opening time of the office will be the first entry time of the employee. The closing time of the office will be the last exit time of the employee. The program must print the total duration the employee takes the break based on the following format.
X Hours Y Minutes
If X is 1, then the format will be 1 Hour Y Minutes.
Note:
Entry time and exit time will be in the 24-hour format (HH:MM).
Entry time and exit time do not occur at the same time.
Boundary Condition(s):
2 <= N <= 100
Input Format:
The first line contains N.
The next N lines, each contains the entry time and exit time separated by a space.
Output Format:
The first line contains the total duration the employee takes the break.
Example Input/Output 1:
Input:
2
09:30 11:30
11:45 14:00
Output:
0 Hours 15 Minutes
Explanation:
Here N = 2.
The opening time of the office is 09:30.
The closing time of the office is 14:00.
In the first record, the employee will be inside the office for 2 Hours 0 Minutes.
In the second record, the employee will be inside the office for 2 Hours 15 Minutes. The total duration the employee takes the break is 0 Hours 15 Minutes.
Hence the output is
0 Hours 15 Minutes
Example Input/Output 2:
Input:
4
08:00 10:10
10:30 13:50
14:30 17:15
17:25 19:11
Output:
1 Hour 10 Minutes */

import java.util.*;
public class EmployeeBreakDuration {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       sc.nextLine(); // consume a new line.
       List<TimeRanges> list = new ArrayList<>();
       for(int i=0;i<N;i++)  {
          String inputLine = sc.nextLine().trim();
          String[] times = inputLine.split("\\s+");
          list.add(new TimeRanges(times[0],times[1]));
       }
       int totalBreakMinutes = 0;
       for(int i=1;i<N;i++) {
          String previousExitTime = list.get(i-1).getEnd();
          String currentEntryTime = list.get(i).getStart();
          totalBreakMinutes += calculateDifferenceInMinutes(previousExitTime,currentEntryTime);
       }
       int breakHours = totalBreakMinutes / 60;
       int breakMinutes = totalBreakMinutes % 60;
       if(breakHours == 1) {
           System.out.println(breakHours+" Hour "+breakMinutes+" Minutes");
       }
       else {
           System.out.println(breakHours+" Hours "+breakMinutes+" Minutes");
       }
   }
   public static int calculateDifferenceInMinutes(String previousExitTime, String currentEntryTime) {
      String[] starting = previousExitTime.split(":");
      String[] ending = currentEntryTime.split(":");
      
      int startHour = Integer.parseInt(starting[0]);
      int endHour = Integer.parseInt(ending[0]);
      
      int startMinute = Integer.parseInt(starting[1]);
      int endMinute = Integer.parseInt(ending[1]);
      
      int startTotalMinutes = startHour * 60 + startMinute;
      int endTotalMinutes = endHour * 60 + endMinute;
      
      return endTotalMinutes - startTotalMinutes;
   }
}
class TimeRanges {
    private String start,end;
    public TimeRanges(String start,String end) {
       this.start = start;
       this.end = end;
    }
    public String getStart() {
        return start;
    }
    public String getEnd() {
        return end;
    }

}
