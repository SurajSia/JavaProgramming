/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Challenge Date :: 17-03-24
//  WARNING :: Name of the file is different , just change it what ever you want

/*
The program must accept the length L and the breadth B of N rectangles as the input. The program must find the area of N rectangles. Then the program must sort the N rectangles in ascending order based on their area. If two or more rectangles have the same area, the program must sort N rectangles in ascending order based on their length. Finally, the program must print the length, the breadth and the area of the sorted rectangles as the output.
Boundary Condition(s):
1 <= N <= 100
1 <= L, B<= 100
Input Format:
The first line contains N.
The next N lines, each contains the length and the breadth of a rectangle.
Output Format:
The first N lines, each contains the length and the breadth of a rectangle after sorting.
*/

import java.util.*;

class Rectangle {
    int length;
    int breadth;
    int area;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        this.area = length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Rectangle> rectangles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int length = scanner.nextInt();
            int breadth = scanner.nextInt();
            rectangles.add(new Rectangle(length, breadth));
        }

        Collections.sort(rectangles, new Comparator<Rectangle>() {
            @Override
            public int compare(Rectangle r1, Rectangle r2) {
                if (r1.area != r2.area) {
                    return Integer.compare(r1.area, r2.area);
                } else {
                    return Integer.compare(r1.length, r2.length);
                }
            }
        });

        for (Rectangle rect : rectangles) {
            System.out.println(rect.length + " " + rect.breadth + " " + rect.area);
        }
    }
}

/*
Example Input/Output 1:
Input:
552324
75236
57
25
32
23
46
Output:
236
326
2510
4624 57 35
Explanation:
The area of the first rectangle is 35 (5*7). The area of the second rectangle is 10 (2*5). The area of the third rectangle is 6 (3*2). The area of the fourth rectangle is 6 (2*3). The area of the fifth rectangle is 24 (4*6).
After sorting the rectangles based on the given conditions, the rectangles become
236
326
2510
46 24
5735
*/
