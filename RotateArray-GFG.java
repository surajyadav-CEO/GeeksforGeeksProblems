//Rotate Array

import java.util.Scanner;

import static java.sql.Types.NULL;

public class Main {
    public static void main(String[] args){
        int temp;
        int i,j,k;
        String S="";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int T=input.nextInt();
        while(T>0){
            System.out.println("\nEnter the size of array: ");
            int N=input.nextInt();
            System.out.println("\nEnter the number size of rotation of an array: ");
            int D=input.nextInt();
            System.out.println("\nEnter the elements of array: ");
            int A[]=new int[N];
            for(i=0;i<N;i++){
                A[i]=input.nextInt();
            }
            for(j=0;j<D;j++) {
                temp = A[0];
                for (k= 0; k <= N - 2; k++) {

                    A[k] = A[k + 1];
                }
                A[N - 1] = temp;
            }
            T=T-1;
            System.out.println("\nArray after rotation: ");
            for (i=0; i < N; i++) {
                S = S + A[i] + " ";
            }
            System.out.println(S);
            S="";
        }
    }
}
