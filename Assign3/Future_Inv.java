package assignments.Assign3;

import java.util.Scanner;

public class Future_Inv {
    public static void main(String[] args) {
        //18. Future Investment Value
        // Simple Interest
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();;
        int t = sc.nextInt();
        float r = sc.nextFloat();
        float si = (p * t * r) / 100;
        float amt = p + si;
        System.out.println("Simple interest : " + si);
        System.out.println("Future val : " + amt);
    }
}
