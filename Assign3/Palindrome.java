package assignments.Assign3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //17. Find if a number is palindrome or not
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        int s = 0;
        while (n!=0){
            int r = n % 10;
            s = (s * 10) + r;
            n = n / 10;
        }
        if(t == s){
            System.out.println("Palindrome!");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
