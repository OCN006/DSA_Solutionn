package string_dsa;
import java.util.Arrays;
import java.util.Scanner;
public class reverse2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String name = "shivam";
       char array[]= name.toCharArray();
       reverseName(array);
        System.out.println(("Reversed name :"+Arrays.toString(array)));
        System.out.println(("Reversed name :"+new String(array)));
    }

    public static void reverseName(char array[]) {
        int start=0, end= array.length-1;
        while(start<end){
            char temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }

    }
}
