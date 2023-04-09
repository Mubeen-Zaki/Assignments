package assignments.Assign3;

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        //6. Calculate Commission Percentage
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextInt();
        float percentage = sc.nextFloat();
        float comm_amt = (amount * percentage) / 100;
        System.out.println((int)comm_amt);
    }
}
