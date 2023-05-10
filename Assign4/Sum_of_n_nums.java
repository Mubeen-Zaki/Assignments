package assignments.Assign4;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Sum_of_n_nums {
    //Write a function that returns the sum of first n natural numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s1 = System.nanoTime();
        System.out.println("Sum : " + sum(n));
        long e1 = System.nanoTime();
        System.out.println("Time_taken : " + (e1-s1));
        s1 = System.nanoTime();
        System.out.println("Sum : " + Sum(n));
        e1 = System.nanoTime();
        System.out.println("Time : " + (e1-s1));
    }

    static int sum(int n){
        int s = 0;
        for(int i = 1; i <= n; i++)
            s += i;
        return s;
    }

    static int Sum(int n){
        return  (n * (n + 1)) / 2;
    }
}
