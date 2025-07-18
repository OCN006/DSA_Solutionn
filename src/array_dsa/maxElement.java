package array_dsa;

import java.util.Scanner;

public class maxElement {
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
        int max=arr[0];// aar[0] or arr[1] or any element of array
        for (int i = 0; i < n; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("GREATEST ELEMENT IS : "+max);
    }
}
