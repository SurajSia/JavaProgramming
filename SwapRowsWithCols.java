/// CopyRights(cc) @ G.Sai Suraj(https://www.github.com./surajsia)
//  source :: https://www.skillrack.com/
//  Daily Test Date :: 20-03-24
//  WARNING :: Name of the file is different , just change it what ever you want

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];
       
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
         int swapIndex = sc.nextInt();
        swapIndex--;
        // Swapping row with column
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][swapIndex];
            matrix[i][swapIndex] = matrix[swapIndex][i];
            matrix[swapIndex][i] = temp;
        }

        // Printing the modified matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//
// input::  3
//
//          1 2 3
//          4 5 6
//          7 8 9
//
//          1
//
// output:: 1 4 7 
//          2 5 6 
//          3 8 9 
//
//  Explanation :: For given 3 x 3 matrix you have to swap the 1st-row and 1st-col elements...
//          
//
//
//
