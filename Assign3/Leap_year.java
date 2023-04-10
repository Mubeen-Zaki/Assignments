package assignments.Assign3;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        //23. Check Leap Year Or Not
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap Year");
                }
                else {
                    System.out.println("Not a leap year");
                }
            }
            else
                System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}
