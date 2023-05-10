package assignments.Assign4;

import java.util.Scanner;

public class Sum_2nos {
    //Write a program to print the sum of two numbers entered by user by defining your own method.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum : " + sum(a,b));
    }

    static int sum(int x,int y){
        return x + y;
    }
}
