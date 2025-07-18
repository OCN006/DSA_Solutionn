package array_dsa;

import java.util.Scanner;

public class linearsearch {
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
        System.out.println("ENTER THE SEARCHED ELEMENT : ");
        int x = sc.nextInt();
        boolean flag = false;//not found
        int count=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                flag = true;
                count = i+1;
                break;
            }
        }    if (flag==true){
                System.out.println("found !! at index "+count);
            }
            else {
                System.out.println("NOT FOUND!!");
            }
    }
}
