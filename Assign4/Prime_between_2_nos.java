package assignments.Assign4;

import java.util.Scanner;

public class Prime_between_2_nos {
    //Write a function that returns all prime numbers between two given numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Primes : " + prime(a,b));
    }

    static String prime(int x, int y){
        String ans = "";
        if(x == 1)
            x++;
        for(int i = x; i <= y; i++){
            int count = 0;
            for(int j = 2; j * j <= i; j++){
                if(i % j == 0){
                    count ++;
                    break;
                }
            }
            if(count == 0)
                ans = ans + i + ", ";
        }
        return ans;
    }
}
