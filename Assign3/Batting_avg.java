package assignments.Assign3;

import java.util.Scanner;

public class Batting_avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of innings:");
        int innings = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= innings; i++){
            System.out.println("Enter runs scored in " + i + " inning :");
            int runs = sc.nextInt();
            sum += runs;
        }
        System.out.println((float) sum / innings);
    }
}
