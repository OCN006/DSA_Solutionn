package array_dsa;
import java.util.Scanner;
public class secondMax {
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
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int smax=arr[0];
        for (int i = 0; i < n; i++) {
              if ((arr[i]>smax)&&(arr[i]!=max)){
                  smax=arr[i];
              }
        }
        System.out.println("MAX ELEMENT IS : "+max+" SECOND MAX ELEMENT IS "+smax);
    }
}
