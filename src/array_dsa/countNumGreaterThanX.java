package array_dsa;

import java.util.Scanner;

public class countNumGreaterThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF THE ARRAY : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("ENTER THE ELEMENTS : ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("ENTER X : ");
        int x = sc.nextInt();
        int count =0;
        for (int i = 0; i < n; i++) {
            if (arr[i]>x){
                count++;
            }
        }
        System.out.println("THE NUMBER OF ELEMENT GREATER THAN "+x+" ARE "+count);
    }
}
