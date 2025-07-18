package method;

import java.util.Scanner;


public class combination {
    public static int fact(int n){
        int fact=1;
        for(int i=n;i>0;i--){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int comb = fact(n)/(fact(r)*fact(n-r));
        System.out.println(comb);
    }
}
