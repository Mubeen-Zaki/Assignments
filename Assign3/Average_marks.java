package assignments.Assign3;

import java.util.Scanner;

public class Average_marks {
    public static void main(String[] args) {
        //12. Calculate Average Marks
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of students");
        int n = sc.nextInt();
        float avg = 0;
        for(int i = 1; i <= n; i++){
            System.out.println("Enter marks:");
            int marks = sc.nextInt();
            avg += marks;
        }
        avg = avg / n;
        System.out.println(avg);
    }
}
