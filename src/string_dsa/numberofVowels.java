package string_dsa;

import java.util.Locale;
import java.util.Scanner;

public class numberofVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str= sc.nextLine();
        int number=countVowel(str);
        System.out.println("Number of vowels are : "+number);
    }

    public static int countVowel(String str){
        str=str.toLowerCase();
        char ch[]=str.toCharArray();
        int count=0;
        for (int i = 0; i < str.length()-1; i++) {
            if (ch[i] == 'a'||ch[i] == 'e'||ch[i] == 'i'||ch[i] == 'o'||ch[i] == 'u') {
                count++;
            }
        }
        return count;

    }
}
