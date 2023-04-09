package assignments.Assign3;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        //2. Calculate Electricity Bill
        //As per TS Electricity Dept for cat-A & B
        Scanner sc = new Scanner(System.in);
        float units = sc.nextFloat();
        float cost = 0;
        if(units > 0 && units <= 100){
            if(units > 50){
                float t = units - 50;
                cost = cost + (50 * 1.45f);
                cost = cost + (t * 2.60f);
                cost = cost + 30;
            }
            else{
                cost = cost + (units * 1.45f) + 25;
            }
        }
        else if (units > 100 && units <= 200) {
            float t = units - 100;
            cost = cost + (100 * 3.30f) + 50 + (t * 4.30f);
        }
        System.out.println(cost);
    }
}
