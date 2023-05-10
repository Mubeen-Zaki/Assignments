package assignments.Assign4;

import java.util.Scanner;

public class Circle {
    //Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        double[] ans = circle(rad);
        System.out.println("Circum : " + ans[0] + ", Area : " + ans[1]);
    }

    static double[] circle(float r){
        double[] c = new double[2];
        c[0] = 2 * 3.14 * r;
        c[1] = 3.14 * r * r;
        return c;
    }
}
