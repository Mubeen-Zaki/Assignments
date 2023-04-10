package assignments.Assign3;

import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        //19. HCF Of Two Numbers Program
        //20. LCM Of Two Numbers
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // HCF
        int t = 0;
        int hcf = 1;
        if(a < b){
            t = a;
        }
        else
            t = b;
        for(int i = 1; i <= t; i++){
            if(a % i == 0 && b % i == 0){
                if(i > hcf)
                    hcf = i;
            }
        }
        // LCM
        int lcm = (a * b) / hcf;
        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);

        // LCM another method:
        /*int j = 0;
        int lcm1 = 0;
        if(a > b)
            j = a;
        else
            j = b;
        for(int i = j,k = 1; i < Integer.MAX_VALUE; k++, i = i * k){
            if(i % a == 0 && i % b == 0){
                lcm1 = i;
                break;
            }
        }
        System.out.println("LCM = " + lcm1);*/
    }
}
