package assignments.Assign3;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (true){
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            if(max < num){
                max = num;
            }
        }
        System.out.println(max);
    }
}
