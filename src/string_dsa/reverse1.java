package string_dsa;

import java.util.Arrays;
import java.util.Scanner;
public class reverse1 {
    public static void main(String[] args) {
//        int arr[]={10,20,30,40,50,60};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements : ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.print("\nenter elements :");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        reverseArray(arr);
        System.out.println("\nReversed array : "+ Arrays.toString(arr));
    }

    public static void reverseArray(int arr[]){
        int start=0 , end= arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
