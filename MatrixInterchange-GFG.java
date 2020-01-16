//Matrix Interchange - Java                                          By:- Suraj Yadav                  16-01-2020 19:29

import java.util.Scanner;

public class GFG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows for 2D array:- ");
        int r = input.nextInt();
        System.out.println("Enter the number of columns for 2d array:- ");
        int c = input.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the values in ur 2d array:- ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        interchange(arr,r,c);
    }
    public static void interchange(int a[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (j == 0) {
                    int temp=a[i][j];
                    a[i][j] = a[i][j+c-1];
                    a[i][j+c-1]=temp;
                }
            }
        }
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
