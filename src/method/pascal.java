package method;

import java.util.Scanner;

public class pascal {

    public static int fact(int n ){
        int fact=1;
        for (int i = n; i>0 ; i--) {
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(fact(i)/(fact(j)*fact(i-j))+" ");
            }
            System.out.println("");
        }
    }
}
