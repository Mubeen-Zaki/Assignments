package assignments.Assign3;

import java.util.Scanner;

public class Ncr_npr {
    public static void main(String[] args) {
        //15. Find Ncr & Npr
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        long ncr = fact(n) / (fact((n - r)) * fact(r));
        long npr = fact(n) / fact((n - r));
        System.out.println("nCr = " + ncr);
        System.out.println("nPr = " + npr);
    }
    public static long fact(int n){
        long f = 1;
        for(int i = 2; i <= n; i++){
            f = f * i;
        }
        return f;
    }
}
