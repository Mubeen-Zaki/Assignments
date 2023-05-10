package assignments.Assign4;

import java.util.Scanner;

public class Prime {
    //[Define a method to find out if a number is prime or not.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }

    static boolean isPrime(int num){
        if (num == 1)
            return false;
        else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0)
                    return false;
            }
        }
        return true;
    }
}
