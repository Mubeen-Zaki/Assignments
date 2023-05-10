package assignments.Assign4;

import java.util.Scanner;

public class Odd_Even {
    //Define a program to find out whether a given number is even or odd
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isEven(num))
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }

    static boolean isEven(int n){
        if(n % 2 == 0)
            return true;
        return false;
    }
}
