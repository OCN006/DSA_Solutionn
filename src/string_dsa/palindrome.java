package string_dsa;

import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();

        if(isPalindrome(str)){
            System.out.println("Yes!! "+str+" is a palindrome");
        }
        else{
            System.out.println("Noo!! "+str+" is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str){
        char arr[] = str.toCharArray();
        int start=0;
        int end = arr.length-1;

        while(start<end){
            if (arr[start]!=arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
