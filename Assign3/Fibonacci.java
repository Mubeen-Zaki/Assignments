package assignments.Assign3;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i = 1; i < n; i++){
            int t = b;
            b = b + a;
            a = t;
            System.out.println(b);
        }
        System.out.println(b + " is the " + n + "th fibonacci number");
    }
}
