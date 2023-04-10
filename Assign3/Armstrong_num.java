package assignments.Assign3;

import java.lang.management.MemoryType;
import java.util.Scanner;

public class Armstrong_num {
    public static void main(String[] args) {
        //14. Armstrong Number In Java
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int t = n;
        while (n!=0){
            int r = n % 10;
            s = s + (r * r * r);
            n = n / 10;
        }
        if(s == t){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not an armstrong number");
        }
    }
}
