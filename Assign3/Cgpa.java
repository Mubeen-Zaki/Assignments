package assignments.Assign3;

import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        //10. Calculate CGPA Java Program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of semesters:");
        int sem = sc.nextInt();
        float cgpa = 0;
        float total_crs_credit = 0;
        float total_crs_secured_credit = 0;
        for(int i = 1; i <= sem; i++){
            System.out.println("Enter no. of subjects:");
            int subs = sc.nextInt();
            float sgpa = 0;
            float total_sem_credits = 0;
            for(int j = 1; j <= subs; j++){
                System.out.println("Enter total credits of sub:");
                float credit = sc.nextFloat();
                System.out.println("Enter Grade points secured:");
                int gp = sc.nextInt();
                float credit_secured = gp * credit;
                sgpa += credit_secured;
                total_sem_credits += credit;
            }
            total_crs_credit = total_sem_credits;
            total_crs_secured_credit = sgpa;
            sgpa = (float) sgpa / total_sem_credits;
            System.out.println("SGPA FOR " + i + " sem = " + sgpa);
        }
        cgpa = (float) total_crs_secured_credit / total_crs_credit;
        System.out.println("CGPA : " + cgpa);
    }
}
