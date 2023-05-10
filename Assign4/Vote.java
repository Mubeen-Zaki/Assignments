package assignments.Assign4;

import java.util.Scanner;

public class Vote {
    //A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(isEligible(age))
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible to vote");
    }

    static boolean isEligible(int n){
        if(n >= 18)
            return true;
        return false;
    }
}
