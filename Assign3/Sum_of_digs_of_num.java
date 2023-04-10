package assignments.Assign3;

import java.util.Scanner;

public class Sum_of_digs_of_num {
    public static void main(String[] args) {
        //24. Sum Of A Digits Of Number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        while (n!=0){
            int r = n % 10;
            s += r;
            n = n / 10;
        }
        System.out.println(s);
    }
}
