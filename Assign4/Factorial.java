package assignments.Assign4;

import java.util.Scanner;

public class Factorial {
    //Write a program to print the factorial of a number by defining a method named 'Factorial'

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num >= 0)
            System.out.println("Factorial of " + num + " is : " + fact(num));
        else
            System.out.println("No negative nums");
    }

    static int fact(int n){
        if(n == 0)
            return 1;
        else
            return n * fact(n - 1);
    }
}
