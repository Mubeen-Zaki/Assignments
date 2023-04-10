package assignments.Assign3;

import java.util.Scanner;

public class Problem_listsum {
    public static void main(String[] args) {
        //26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
        Scanner sc = new Scanner(System.in);
        int neg_sum = 0;
        int pos_even_sum = 0;
        int pos_odd_sum = 0;
        while (true){
            int num = sc.nextInt();
            if(num > 0){
                if(num % 2 == 0)
                    pos_even_sum += num;
                else
                    pos_odd_sum += num;
            } else if (num < 0) {
                neg_sum += num;
            }
            else
                break;
        }
        System.out.println("sum of negative numbers : " + neg_sum);
        System.out.println("sum of positive even numbers : " + pos_even_sum);
        System.out.println("sum of positive odd numbers : " + pos_odd_sum);
    }
}
