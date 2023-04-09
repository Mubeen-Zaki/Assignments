package assignments.Assign3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //1. Factorial Program In Java
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0){
            System.out.println(1);
        }
        else {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println(fact);
        }
    }
}
