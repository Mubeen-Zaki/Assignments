package assignments.Assign3;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        //3. Calculate Average Of N Numbers
        Scanner sc = new Scanner(System.in);
        float n = sc.nextInt();
        float sum = 0;
        for(int i = 1; i <= n; i++){
            float num = sc.nextInt();
            sum += num;
        }
        float avg = sum / n;
        System.out.println("Average : " + avg);
    }
}
