//Predict the Column - Java                                                    By:-Suraj Yadav       17-01-2020 08:18

import java.util.Scanner;

public class GFG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows for 2D array:- ");
        int r = input.nextInt();
//        System.out.println("Enter the number of columns for 2d array:- ");
//        int c = input.nextInt();
        int[][] arr = new int[r][r];
        System.out.println("Enter the values in ur 2d array:- ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println(columnWithMaxZero(arr,r));
    }
    public static int columnWithMaxZero(int a[][], int n) {
        int[] array=new int[n];
        for(int j=0;j<n;j++){
            int count=0;
            for(int i=0;i<n;i++){
                if(a[i][j]==0){
                    count++;
                    array[j]=count;
                }
            }
        }
        int max=array[0];
        int pos=0;
        for(int i=0;i<(n-1);i++){
            if(max<array[i+1]){
                max=array[i+1];
            }
        }
        for(int i=0;i<n;i++){
            if(array[i]==max){
                pos=i;
                break;
            }
        }

        return pos;
    }
}
