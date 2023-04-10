package assignments.Assign3;

import java.util.Scanner;

public class CompoudInterest {
    public static void main(String[] args) {
        //11. Compound Interest Java Program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal");
        int p = sc.nextInt();
        System.out.println("Enter rate of interest");
        float r = sc.nextFloat();
        System.out.println("Enter the time span:");
        int t = sc.nextInt();
        double amt = p * Math.pow((1 + (r/100)),t);
        double ci = amt - p;
        System.out.println("Amount : " + amt);
        System.out.println("Compound Interest : " + ci);
    }
}
