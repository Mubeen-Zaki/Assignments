package assignments.Assign4;

import java.util.Scanner;

public class Palindrome {
    //Write a function to find if a number is a palindrome or not. Take number as parameter

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPalindrome(num))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }

    static boolean isPalindrome(int n){
        int s = 0;
        int r = 0;
        int t = n;
        while (n != 0){
            r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }
        if(t == s)
            return true;
        return false;
    }
}
