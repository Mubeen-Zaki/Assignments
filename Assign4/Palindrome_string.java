package assignments.Assign4;

import java.util.Scanner;

public class Palindrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(isPalindrome(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }

    static boolean isPalindrome(String s){
        String str = "";
        for(int i = s.length() - 1; i >=0; i--){
            str = str + s.charAt(i);
        }
        if(str.toLowerCase().equals(s.toLowerCase()))
            return true;
        return false;
    }
}
