package assignments.Assign4;

import java.util.Scanner;

public class Prod_2nos {
    //Define a method that returns the product of two numbers entered by user.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Product : " + product(x,y));
    }

    static int product(int a,int b){
        return a * b;
    }
}
