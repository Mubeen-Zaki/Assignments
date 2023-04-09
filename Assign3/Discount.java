package assignments.Assign3;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        //4. Calculate Discount Of Product
        Scanner sc = new Scanner(System.in);
        float price = sc.nextFloat();
        if(price > 500 && price <= 1000){
            // 20% off
            float discount_price = 0.8f * price;
            System.out.println(discount_price);
        }
        else if (price > 1000) {
            // 30% off
            float discount_price = 0.7f * price;
            System.out.println(discount_price);
        }
        else {
            System.out.println("Not eligible for discount");
        }
    }
}
