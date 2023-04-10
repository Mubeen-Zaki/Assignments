package assignments.Assign3;

import java.util.Scanner;

public class Sum_of_n_nums {
    public static void main(String[] args) {
        //13. Sum Of N Numbers
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }
}
