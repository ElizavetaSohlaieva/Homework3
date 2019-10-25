package homework3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string -> ");
        String str1 = sc.nextLine();

        uniChars(str1);
    }
    public static void uniChars(String str1){
        int index = 0;
        String res = " ";
        while (index < str1.length()){
            char ch = str1.charAt(index);
            if( str1.contains(String.valueOf(ch))&&
                    !res.contains(String.valueOf(ch))){
                res += ch;
            }
            index++;
        }
        System.out.println(res);
    }
}
