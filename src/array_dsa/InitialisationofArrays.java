package array_dsa;

import java.util.Scanner;

public class InitialisationofArrays {
    public static void main(String[] args) {
//    int [] x= {2,3,4,6,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY: ");
        int n = sc.nextInt();
        System.out.println("ENTER THE ELEMENTS :");
        int[] arr = new int[n];
        // default value = 0
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]*2);
        }
    }
}
