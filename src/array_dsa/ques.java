package array_dsa;

import java.util.Scanner;

public class ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY: ");
        int n = sc.nextInt();
        System.out.println("ENTER THE ELEMENTS :");
        int[] arr = new int[n];
        // default value = 0
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int sum =0;
        for (int i = 0; i < n ; i++) {
            sum=arr[i]+sum;
        }
        System.out.println("SUM OF GIVEN ARRAY IS : "+sum);
    }
}
